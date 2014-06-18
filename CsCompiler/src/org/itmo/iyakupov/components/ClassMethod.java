package org.itmo.iyakupov.components;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.itmo.iyakupov.ClassResident;
import org.itmo.iyakupov.ErrorProcessor;
import org.itmo.iyakupov.a4autogen.CsParser;
import org.itmo.iyakupov.scope.TranslateScope;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import static java.lang.String.format;

public class ClassMethod implements Opcodes, ClassResident {
	private final Log log = LogFactory.getLog(getClass());
	
	protected CompoundStatement block;
	protected ArrayList<Variable> args = new ArrayList<Variable>();
	protected boolean varargs = false;
	protected TranslateScope scope;
	protected ClassDef parent;
	protected String name;
	protected DeclarationSpecifier declarationSpecifier;
	protected ErrorProcessor errorProcessor;

	public ClassMethod(ParserRuleContext tree, TranslateScope scope, ClassDef parentClass, ErrorProcessor errorProcessor) {
		this.parent = parentClass;
		this.scope = scope;
		this.errorProcessor = errorProcessor;
		
		if (tree.getTokens(CsParser.IDENTIFIER).size() > 0) {
			name = tree.getToken(CsParser.IDENTIFIER, 0).getText();
			log.trace("Method added: " + tree.getToken(CsParser.IDENTIFIER, 0).getText());	
		} else {
			log.trace("Constructor added");
		}
		
		for (ParserRuleContext child : tree.getRuleContexts(ParserRuleContext.class)) {
			if (child.getRuleIndex() == CsParser.RULE_declaration_specifier) {
				declarationSpecifier = new DeclarationSpecifier(child, scope);
			} else if (child.getRuleIndex() == CsParser.RULE_declarator_suffix) {
				for (ParserRuleContext declSuffixChild : child.getRuleContexts(ParserRuleContext.class)) {
					if (declSuffixChild.getRuleIndex() == CsParser.RULE_parameter_type_list) {
						if (declSuffixChild.getTokens(CsParser.ETC).size() > 0)
							varargs = true;
						
						for (ParserRuleContext parmTypeListChild : declSuffixChild.getRuleContexts(ParserRuleContext.class)) {
							if (parmTypeListChild.getRuleIndex() == CsParser.RULE_parameter_list) {
								for (ParserRuleContext parmListChild : parmTypeListChild.getRuleContexts(ParserRuleContext.class)) {
									if (parmListChild.getRuleIndex() == CsParser.RULE_parameter_declaration) {
										args.add(new Variable(parmListChild.getRuleContext(ParserRuleContext.class, 1), 
												parmListChild.getRuleContext(ParserRuleContext.class, 0),
												scope,
												errorProcessor,
												null));
									}
								}
							}
						}
					}
				}
			} else if (child.getRuleIndex() == CsParser.RULE_compound_statement) {
				block = new CompoundStatement(child, errorProcessor, scope);
			}
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public void compile(ClassWriter cw, String className, List<Variable> initExpressions, ClassDef parentClass) {
		List<Type> argTypes = new ArrayList<Type>();
		for (Variable v: args) {
			argTypes.add(v.getType());
		}
		if (scope.isFunctionDeclared(name, argTypes.toArray(new Type[argTypes.size()]))) {
			errorProcessor.fail(0, "Trying to redefine method " + name);
		}
		scope.declareFunction(name, declarationSpecifier.type, argTypes.toArray(new Type[argTypes.size()]));
		scope.setMethodName(name);
		scope.newBlock();
		for (Variable v: args) {
			scope.addLocalVariable(v.getName(), v.declarationSpecifier.type);
		}
			
		final boolean isConstructor = name.equals(className);
		final String actualName = isConstructor ? "<init>" : name;
		String type = null;
		if (!isConstructor) {
			type = declarationSpecifier.type.getDescriptor();
		} else {
			type = "()V";
		}
		log.trace(format("Compiling method %s w. args %s. Is constructor: %s", actualName, type, isConstructor));
		StringBuilder descriptor = new StringBuilder();
		descriptor.append('(');
		for (int i = 0; i < args.size(); ++i) {
			if (i != 0)
				descriptor.append(';');
			descriptor.append(args.get(i).getType().getDescriptor());
		}
		descriptor.append(')');
		descriptor.append(type);
        MethodVisitor mv = cw.visitMethod(ACC_PUBLIC, actualName, descriptor.toString(), null, null);
        if (isConstructor) {
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
	        for (Variable v: initExpressions) {
	        	if (v.getInitExpression() != null) {
	            	if (v.getInitExpression() != null) {
	                    mv.visitVarInsn(ALOAD, 0);        
	            		v.getInitExpression().compile(mv);
	            		parentClass.assignToVariable(mv, v);
	            	}
	        	}
	        }
        }
        block.compile(mv);
        mv.visitInsn(RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
        
        scope.setMethodName(null);
		scope.endBlock();
	}
}

