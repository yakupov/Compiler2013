package org.itmo.iyakupov.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.itmo.iyakupov.CompilationUnit;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.scope.TranslateScope;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class ClassDef extends ClassLoader implements Opcodes, CompilationUnit {
	private final Log log = LogFactory.getLog(getClass());
	
	protected final ParserRuleContext tree;
	protected final TranslateScope scope;
	protected final List<TerminalNode> accessModifiers;
	protected final List<TerminalNode> otherModifiers;
	protected final String name;
	protected final List<Variable> fields = new ArrayList<Variable>();
	protected final List<ClassMethod> methods = new ArrayList<ClassMethod>();
	protected final ErrorProcessor errorProcessor;
	
	public ClassDef(ParserRuleContext tree, TranslateScope scope, ErrorProcessor errorProcessor) {
		this.tree = tree;
		this.scope = scope;
		this.errorProcessor = errorProcessor;
		
		if (tree.getRuleIndex() != CsParser.RULE_cls_def) {
			throw new RuntimeException("Invalid rule, must be an error in the compiler");
		}
		
		//Modifiers - ignore for now
		accessModifiers = tree.getTokens(CsParser.ACCESS_MODIFIER);
		log.trace("AccessModifiers#: " + accessModifiers.size());
		otherModifiers = tree.getTokens(CsParser.OTHER_MODIFIER);
		log.trace("OtherModifiers#: " + accessModifiers.size());
		
		//Class name
		List<TerminalNode> identifiers = tree.getTokens(CsParser.IDENTIFIER);
		errorProcessor.assertEquals(identifiers.size(), 1, tree.getStart().getLine(), 
				"IDENTIFIER, total number in class");
		name = identifiers.get(0).getText();
		log.trace("Class name: " + name);
		
		//Fields and methods
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_cls_method) {
				methods.add(new ClassMethod(child, scope, this, errorProcessor));
			} else if (child.getRuleIndex() == CsParser.RULE_declaration) {
				ParserRuleContext declarationSpecifier = null;
				for (ParserRuleContext details : child.getRuleContexts(ParserRuleContext.class)) {
					if (details.getRuleIndex() == CsParser.RULE_declaration_specifier) {
						errorProcessor.assertTrue(declarationSpecifier == null, tree.getStart().getLine(), 
								"declaration specifier: there is more than one of it");
						declarationSpecifier = details;
					} else if (details.getRuleIndex() == CsParser.RULE_init_declarator_list) {
						for (ParserRuleContext declarator : details.getRuleContexts(ParserRuleContext.class)) {
							if (declarator.getRuleIndex() == CsParser.RULE_init_declarator) {
								fields.add(new Variable(declarator, declarationSpecifier, scope, errorProcessor, name));							
							}
						}
					}
				}
			}
		}
	}

	public void assignToVariable(MethodVisitor mv, Variable v) {
		mv.visitFieldInsn(PUTFIELD, name, v.getName(), v.getType().getDescriptor());
	}
	
	@Override
	public byte[] compile() {
		scope.addClass(name);

        // class header
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cw.visit(V1_6, ACC_PUBLIC, name, null, "java/lang/Object", new String[] {});
        
        //Fields
        for (Variable v: fields) {
        	FieldVisitor fv = cw.visitField(ACC_PUBLIC, 
        			v.getName(), 
        			v.getType().getDescriptor(),
        			null, 
        			null);
        	fv.visitEnd();
        	scope.addField(v.getName(), v.declarationSpecifier.type);
        }
        
        // default public constructor
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        for (Variable v: fields) {
        	if (v.getInitExpression() != null) {
                mv.visitVarInsn(ALOAD, 0);        
        		v.getInitExpression().compile(mv);
        		assignToVariable(mv, v);
        	}
        }
        mv.visitInsn(RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
		
        //Methods
        for (ClassMethod m : methods) {
        	m.compile(cw, name, fields, this);
        }
             
        return cw.toByteArray();
	}
}
