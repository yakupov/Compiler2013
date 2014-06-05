// Generated from C:\Users\Ilia\Desktop\Cs.g4 by ANTLR 4.1
package org.itmo.iyakupov.a4autogen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, CLASS=2, ENUM=3, CASE=4, DEFAULT=5, IF=6, ELSE=7, FOR=8, WHILE=9, 
		DO=10, CONTINUE=11, BREAK=12, RETURN=13, PRIMITIVE_TYPE=14, PRIMITIVE_TYPE_MODIFIER=15, 
		ACCESS_MODIFIER=16, OTHER_MODIFIER=17, ASSIGN=18, MUL_ASS=19, DIV_ASS=20, 
		REM_ASS=21, ADD_ASS=22, SUB_ASS=23, LSHIFT_ASS=24, RSHIFT_ASS=25, AND_ASS=26, 
		XOR_ASS=27, OR_ASS=28, EQ=29, NEQ=30, GT=31, LT=32, GE=33, LE=34, LSHIFT=35, 
		RSHIFT=36, INCREMENT=37, DECREMENT=38, OPB_FIG=39, CLB_FIG=40, OPB_RND=41, 
		CLB_RND=42, OPB_SQ=43, CLB_SQ=44, SEMICOLON=45, DOUBLE_DOT=46, COMMA=47, 
		DOT=48, ETC=49, PLUS=50, MINUS=51, MUL=52, DIV=53, BIT_AND=54, BIT_OR=55, 
		BIT_XOR=56, AND=57, OR=58, QUESTION=59, REM=60, NOT=61, IDENTIFIER=62, 
		CHARACTER_LITERAL=63, STRING_LITERAL=64, HEX_LITERAL=65, DECIMAL_LITERAL=66, 
		OCTAL_LITERAL=67, FLOATING_POINT_LITERAL=68, WS=69, COMMENT=70, LINE_COMMENT=71, 
		LINE_COMMAND=72;
	public static final String[] tokenNames = {
		"<INVALID>", "'new'", "'class'", "'enum'", "'case'", "'default'", "'if'", 
		"'else'", "'for'", "'while'", "'do'", "'continue'", "'break'", "'return'", 
		"PRIMITIVE_TYPE", "PRIMITIVE_TYPE_MODIFIER", "ACCESS_MODIFIER", "OTHER_MODIFIER", 
		"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
		"'^='", "'|='", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'<<'", 
		"'>>'", "'++'", "'--'", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", 
		"':'", "','", "'.'", "'...'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'&&'", "'||'", "'?'", "'%'", "'!'", "IDENTIFIER", "CHARACTER_LITERAL", 
		"STRING_LITERAL", "HEX_LITERAL", "DECIMAL_LITERAL", "OCTAL_LITERAL", "FLOATING_POINT_LITERAL", 
		"WS", "COMMENT", "LINE_COMMENT", "LINE_COMMAND"
	};
	public static final int
		RULE_cls_def = 0, RULE_cls_method = 1, RULE_assignment_operator = 2, RULE_declaration = 3, 
		RULE_declaration_specifier = 4, RULE_init_declarator_list = 5, RULE_init_declarator = 6, 
		RULE_arr_suffix = 7, RULE_arr_arg_suffix = 8, RULE_arg_suffix = 9, RULE_declarator_suffix = 10, 
		RULE_type_specifier = 11, RULE_enum_specifier = 12, RULE_enumerator_list = 13, 
		RULE_enumerator = 14, RULE_parameter_type_list = 15, RULE_parameter_list = 16, 
		RULE_parameter_declaration = 17, RULE_identifier_list = 18, RULE_argument_expression_list = 19, 
		RULE_additive_expression = 20, RULE_multiplicative_expression = 21, RULE_cast_expression = 22, 
		RULE_unary_expression = 23, RULE_constructor_call = 24, RULE_postfix_expression = 25, 
		RULE_primary_expression = 26, RULE_constant = 27, RULE_expression = 28, 
		RULE_constant_expression = 29, RULE_assignment_expression = 30, RULE_lvalue = 31, 
		RULE_conditional_expression = 32, RULE_logical_or_expression = 33, RULE_logical_and_expression = 34, 
		RULE_inclusive_or_expression = 35, RULE_exclusive_or_expression = 36, 
		RULE_and_expression = 37, RULE_equality_expression = 38, RULE_relational_expression = 39, 
		RULE_shift_expression = 40, RULE_statement = 41, RULE_compound_statement = 42, 
		RULE_expression_statement = 43, RULE_selection_statement = 44, RULE_iteration_statement = 45, 
		RULE_jump_statement = 46, RULE_assign_and_modify_operator = 47, RULE_unary_operator = 48, 
		RULE_equality_operator = 49, RULE_comparsion_operator = 50, RULE_shift_operator = 51;
	public static final String[] ruleNames = {
		"cls_def", "cls_method", "assignment_operator", "declaration", "declaration_specifier", 
		"init_declarator_list", "init_declarator", "arr_suffix", "arr_arg_suffix", 
		"arg_suffix", "declarator_suffix", "type_specifier", "enum_specifier", 
		"enumerator_list", "enumerator", "parameter_type_list", "parameter_list", 
		"parameter_declaration", "identifier_list", "argument_expression_list", 
		"additive_expression", "multiplicative_expression", "cast_expression", 
		"unary_expression", "constructor_call", "postfix_expression", "primary_expression", 
		"constant", "expression", "constant_expression", "assignment_expression", 
		"lvalue", "conditional_expression", "logical_or_expression", "logical_and_expression", 
		"inclusive_or_expression", "exclusive_or_expression", "and_expression", 
		"equality_expression", "relational_expression", "shift_expression", "statement", 
		"compound_statement", "expression_statement", "selection_statement", "iteration_statement", 
		"jump_statement", "assign_and_modify_operator", "unary_operator", "equality_operator", 
		"comparsion_operator", "shift_operator"
	};

	@Override
	public String getGrammarFileName() { return "Cs.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Cls_defContext extends ParserRuleContext {
		public TerminalNode OPB_FIG() { return getToken(CsParser.OPB_FIG, 0); }
		public TerminalNode ACCESS_MODIFIER() { return getToken(CsParser.ACCESS_MODIFIER, 0); }
		public Cls_methodContext cls_method(int i) {
			return getRuleContext(Cls_methodContext.class,i);
		}
		public TerminalNode CLB_FIG() { return getToken(CsParser.CLB_FIG, 0); }
		public TerminalNode OTHER_MODIFIER(int i) {
			return getToken(CsParser.OTHER_MODIFIER, i);
		}
		public List<Cls_methodContext> cls_method() {
			return getRuleContexts(Cls_methodContext.class);
		}
		public List<Enum_specifierContext> enum_specifier() {
			return getRuleContexts(Enum_specifierContext.class);
		}
		public TerminalNode CLASS() { return getToken(CsParser.CLASS, 0); }
		public Cls_defContext cls_def(int i) {
			return getRuleContext(Cls_defContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> OTHER_MODIFIER() { return getTokens(CsParser.OTHER_MODIFIER); }
		public Enum_specifierContext enum_specifier(int i) {
			return getRuleContext(Enum_specifierContext.class,i);
		}
		public List<Cls_defContext> cls_def() {
			return getRuleContexts(Cls_defContext.class);
		}
		public Cls_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterCls_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitCls_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitCls_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cls_defContext cls_def() throws RecognitionException {
		Cls_defContext _localctx = new Cls_defContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cls_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(104); match(ACCESS_MODIFIER);
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OTHER_MODIFIER) {
				{
				{
				setState(107); match(OTHER_MODIFIER);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113); match(CLASS);
			setState(114); match(IDENTIFIER);
			setState(115); match(OPB_FIG);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << PRIMITIVE_TYPE) | (1L << PRIMITIVE_TYPE_MODIFIER) | (1L << ACCESS_MODIFIER) | (1L << OTHER_MODIFIER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(120);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(116); cls_method();
					}
					break;

				case 2:
					{
					setState(117); cls_def();
					}
					break;

				case 3:
					{
					setState(118); enum_specifier();
					}
					break;

				case 4:
					{
					setState(119); declaration();
					}
					break;
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125); match(CLB_FIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cls_methodContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Declarator_suffixContext declarator_suffix() {
			return getRuleContext(Declarator_suffixContext.class,0);
		}
		public Cls_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterCls_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitCls_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitCls_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cls_methodContext cls_method() throws RecognitionException {
		Cls_methodContext _localctx = new Cls_methodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cls_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); declaration_specifier();
			setState(128); match(IDENTIFIER);
			setState(129); declarator_suffix();
			setState(130); compound_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assign_and_modify_operatorContext assign_and_modify_operator() {
			return getRuleContext(Assign_and_modify_operatorContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CsParser.ASSIGN, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_operator);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case MUL_ASS:
			case DIV_ASS:
			case REM_ASS:
			case ADD_ASS:
			case SUB_ASS:
			case LSHIFT_ASS:
			case RSHIFT_ASS:
			case XOR_ASS:
			case OR_ASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); assign_and_modify_operator();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(ASSIGN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CsParser.SEMICOLON, 0); }
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public Init_declarator_listContext init_declarator_list() {
			return getRuleContext(Init_declarator_listContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); declaration_specifier();
			setState(137); init_declarator_list();
			setState(138); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaration_specifierContext extends ParserRuleContext {
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public List<TerminalNode> ACCESS_MODIFIER() { return getTokens(CsParser.ACCESS_MODIFIER); }
		public List<Arr_suffixContext> arr_suffix() {
			return getRuleContexts(Arr_suffixContext.class);
		}
		public TerminalNode ACCESS_MODIFIER(int i) {
			return getToken(CsParser.ACCESS_MODIFIER, i);
		}
		public TerminalNode OTHER_MODIFIER(int i) {
			return getToken(CsParser.OTHER_MODIFIER, i);
		}
		public List<TerminalNode> OTHER_MODIFIER() { return getTokens(CsParser.OTHER_MODIFIER); }
		public Arr_suffixContext arr_suffix(int i) {
			return getRuleContext(Arr_suffixContext.class,i);
		}
		public Declaration_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterDeclaration_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitDeclaration_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitDeclaration_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_specifierContext declaration_specifier() throws RecognitionException {
		Declaration_specifierContext _localctx = new Declaration_specifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_specifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACCESS_MODIFIER || _la==OTHER_MODIFIER) {
				{
				{
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==ACCESS_MODIFIER || _la==OTHER_MODIFIER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); type_specifier();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPB_SQ) {
				{
				{
				setState(147); arr_suffix();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declarator_listContext extends ParserRuleContext {
		public Init_declaratorContext init_declarator(int i) {
			return getRuleContext(Init_declaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public List<Init_declaratorContext> init_declarator() {
			return getRuleContexts(Init_declaratorContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Init_declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterInit_declarator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitInit_declarator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitInit_declarator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declarator_listContext init_declarator_list() throws RecognitionException {
		Init_declarator_listContext _localctx = new Init_declarator_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_init_declarator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); init_declarator();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154); match(COMMA);
				setState(155); init_declarator();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Init_declaratorContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public Init_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterInit_declarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitInit_declarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitInit_declarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaratorContext init_declarator() throws RecognitionException {
		Init_declaratorContext _localctx = new Init_declaratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_init_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(161); match(IDENTIFIER);
				}
			}

			setState(167);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << MUL_ASS) | (1L << DIV_ASS) | (1L << REM_ASS) | (1L << ADD_ASS) | (1L << SUB_ASS) | (1L << LSHIFT_ASS) | (1L << RSHIFT_ASS) | (1L << XOR_ASS) | (1L << OR_ASS))) != 0)) {
				{
				setState(164); assignment_operator();
				setState(165); assignment_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_suffixContext extends ParserRuleContext {
		public TerminalNode OPB_SQ() { return getToken(CsParser.OPB_SQ, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public TerminalNode CLB_SQ() { return getToken(CsParser.CLB_SQ, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Arr_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterArr_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitArr_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitArr_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_suffixContext arr_suffix() throws RecognitionException {
		Arr_suffixContext _localctx = new Arr_suffixContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arr_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(OPB_SQ);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(170); match(COMMA);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176); match(CLB_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arr_arg_suffixContext extends ParserRuleContext {
		public TerminalNode OPB_SQ() { return getToken(CsParser.OPB_SQ, 0); }
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public TerminalNode CLB_SQ() { return getToken(CsParser.CLB_SQ, 0); }
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public Arr_arg_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr_arg_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterArr_arg_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitArr_arg_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitArr_arg_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arr_arg_suffixContext arr_arg_suffix() throws RecognitionException {
		Arr_arg_suffixContext _localctx = new Arr_arg_suffixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arr_arg_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(OPB_SQ);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << BIT_AND) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				{
				setState(179); argument_expression_list();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185); match(CLB_SQ);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_suffixContext extends ParserRuleContext {
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public Arg_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterArg_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitArg_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitArg_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_suffixContext arg_suffix() throws RecognitionException {
		Arg_suffixContext _localctx = new Arg_suffixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arg_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(OPB_RND);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << BIT_AND) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				{
				setState(188); argument_expression_list();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); match(CLB_RND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declarator_suffixContext extends ParserRuleContext {
		public Parameter_type_listContext parameter_type_list() {
			return getRuleContext(Parameter_type_listContext.class,0);
		}
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public Declarator_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterDeclarator_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitDeclarator_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitDeclarator_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declarator_suffixContext declarator_suffix() throws RecognitionException {
		Declarator_suffixContext _localctx = new Declarator_suffixContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarator_suffix);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196); match(OPB_RND);
				setState(197); parameter_type_list();
				setState(198); match(CLB_RND);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); match(OPB_RND);
				setState(201); match(CLB_RND);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_specifierContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(CsParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public TerminalNode PRIMITIVE_TYPE_MODIFIER() { return getToken(CsParser.PRIMITIVE_TYPE_MODIFIER, 0); }
		public Enum_specifierContext enum_specifier() {
			return getRuleContext(Enum_specifierContext.class,0);
		}
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterType_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitType_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitType_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_specifier);
		int _la;
		try {
			setState(210);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
			case PRIMITIVE_TYPE_MODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				_la = _input.LA(1);
				if (_la==PRIMITIVE_TYPE_MODIFIER) {
					{
					setState(204); match(PRIMITIVE_TYPE_MODIFIER);
					}
				}

				setState(207); match(PRIMITIVE_TYPE);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); enum_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_specifierContext extends ParserRuleContext {
		public TerminalNode OPB_FIG() { return getToken(CsParser.OPB_FIG, 0); }
		public TerminalNode ENUM() { return getToken(CsParser.ENUM, 0); }
		public Enumerator_listContext enumerator_list() {
			return getRuleContext(Enumerator_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public TerminalNode CLB_FIG() { return getToken(CsParser.CLB_FIG, 0); }
		public Enum_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_specifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterEnum_specifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitEnum_specifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitEnum_specifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_specifierContext enum_specifier() throws RecognitionException {
		Enum_specifierContext _localctx = new Enum_specifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum_specifier);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); match(ENUM);
				setState(213); match(OPB_FIG);
				setState(214); enumerator_list();
				setState(215); match(CLB_FIG);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); match(ENUM);
				setState(218); match(IDENTIFIER);
				setState(219); match(OPB_FIG);
				setState(220); enumerator_list();
				setState(221); match(CLB_FIG);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223); match(ENUM);
				setState(224); match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enumerator_listContext extends ParserRuleContext {
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Enumerator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterEnumerator_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitEnumerator_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitEnumerator_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enumerator_listContext enumerator_list() throws RecognitionException {
		Enumerator_listContext _localctx = new Enumerator_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumerator_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); enumerator();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228); match(COMMA);
				setState(229); enumerator();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(CsParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(IDENTIFIER);
			setState(238);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(236); match(ASSIGN);
				setState(237); constant_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_type_listContext extends ParserRuleContext {
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CsParser.COMMA, 0); }
		public TerminalNode ETC() { return getToken(CsParser.ETC, 0); }
		public Parameter_type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterParameter_type_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitParameter_type_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitParameter_type_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_type_listContext parameter_type_list() throws RecognitionException {
		Parameter_type_listContext _localctx = new Parameter_type_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameter_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); parameter_list();
			setState(243);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(241); match(COMMA);
				setState(242); match(ETC);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_declarationContext parameter_declaration(int i) {
			return getRuleContext(Parameter_declarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public List<Parameter_declarationContext> parameter_declaration() {
			return getRuleContexts(Parameter_declarationContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameter_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245); parameter_declaration();
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(246); match(COMMA);
					setState(247); parameter_declaration();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Declaration_specifierContext declaration_specifier() {
			return getRuleContext(Declaration_specifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitParameter_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); declaration_specifier();
			setState(254); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CsParser.IDENTIFIER); }
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(IDENTIFIER);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(257); match(COMMA);
				setState(258); match(IDENTIFIER);
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_expression_listContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Argument_expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expression_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterArgument_expression_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitArgument_expression_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitArgument_expression_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_expression_listContext argument_expression_list() throws RecognitionException {
		Argument_expression_listContext _localctx = new Argument_expression_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argument_expression_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); assignment_expression();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265); match(COMMA);
				setState(266); assignment_expression();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Additive_expressionContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(CsParser.MINUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CsParser.MINUS); }
		public Multiplicative_expressionContext multiplicative_expression(int i) {
			return getRuleContext(Multiplicative_expressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CsParser.PLUS); }
		public List<Multiplicative_expressionContext> multiplicative_expression() {
			return getRuleContexts(Multiplicative_expressionContext.class);
		}
		public TerminalNode PLUS(int i) {
			return getToken(CsParser.PLUS, i);
		}
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterAdditive_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitAdditive_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitAdditive_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additive_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272); multiplicative_expression();
			}
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(277);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(273); match(PLUS);
						setState(274); multiplicative_expression();
						}
						break;
					case MINUS:
						{
						setState(275); match(MINUS);
						setState(276); multiplicative_expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public List<Cast_expressionContext> cast_expression() {
			return getRuleContexts(Cast_expressionContext.class);
		}
		public List<TerminalNode> MUL() { return getTokens(CsParser.MUL); }
		public List<TerminalNode> DIV() { return getTokens(CsParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(CsParser.DIV, i);
		}
		public TerminalNode MUL(int i) {
			return getToken(CsParser.MUL, i);
		}
		public Cast_expressionContext cast_expression(int i) {
			return getRuleContext(Cast_expressionContext.class,i);
		}
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterMultiplicative_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitMultiplicative_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitMultiplicative_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplicative_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(282); cast_expression();
			}
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(289);
					switch (_input.LA(1)) {
					case MUL:
						{
						setState(283); match(MUL);
						setState(284); cast_expression();
						}
						break;
					case DIV:
						{
						setState(285); match(DIV);
						setState(286); cast_expression();
						}
						break;
					case REM:
						{
						setState(287); match(REM);
						setState(288); cast_expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cast_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public Cast_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterCast_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitCast_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitCast_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cast_expressionContext cast_expression() throws RecognitionException {
		Cast_expressionContext _localctx = new Cast_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cast_expression);
		try {
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); match(OPB_RND);
				setState(295); match(IDENTIFIER);
				setState(296); match(CLB_RND);
				setState(297); cast_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298); unary_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_expressionContext extends ParserRuleContext {
		public Cast_expressionContext cast_expression() {
			return getRuleContext(Cast_expressionContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(CsParser.INCREMENT, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Constructor_callContext constructor_call() {
			return getRuleContext(Constructor_callContext.class,0);
		}
		public TerminalNode DECREMENT() { return getToken(CsParser.DECREMENT, 0); }
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterUnary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitUnary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitUnary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unary_expression);
		try {
			setState(310);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(301); constructor_call();
				}
				break;
			case OPB_RND:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(302); postfix_expression();
				}
				break;
			case INCREMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(303); match(INCREMENT);
				setState(304); unary_expression();
				}
				break;
			case DECREMENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(305); match(DECREMENT);
				setState(306); unary_expression();
				}
				break;
			case PLUS:
			case MINUS:
			case MUL:
			case BIT_AND:
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(307); unary_operator();
				setState(308); cast_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constructor_callContext extends ParserRuleContext {
		public Arr_arg_suffixContext arr_arg_suffix() {
			return getRuleContext(Arr_arg_suffixContext.class,0);
		}
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode NEW() { return getToken(CsParser.NEW, 0); }
		public Arg_suffixContext arg_suffix(int i) {
			return getRuleContext(Arg_suffixContext.class,i);
		}
		public List<Arg_suffixContext> arg_suffix() {
			return getRuleContexts(Arg_suffixContext.class);
		}
		public Constructor_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterConstructor_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitConstructor_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitConstructor_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_callContext constructor_call() throws RecognitionException {
		Constructor_callContext _localctx = new Constructor_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constructor_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312); match(NEW);
			setState(313); type_specifier();
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPB_SQ) {
					{
					{
					setState(314); arr_arg_suffix();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				{
				setState(323);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(320); arg_suffix();
						}
						} 
					}
					setState(325);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Postfix_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OPB_SQ() { return getTokens(CsParser.OPB_SQ); }
		public TerminalNode OPB_SQ(int i) {
			return getToken(CsParser.OPB_SQ, i);
		}
		public Postfix_expressionContext postfix_expression(int i) {
			return getRuleContext(Postfix_expressionContext.class,i);
		}
		public List<Argument_expression_listContext> argument_expression_list() {
			return getRuleContexts(Argument_expression_listContext.class);
		}
		public TerminalNode CLB_RND(int i) {
			return getToken(CsParser.CLB_RND, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public List<TerminalNode> DECREMENT() { return getTokens(CsParser.DECREMENT); }
		public List<TerminalNode> CLB_SQ() { return getTokens(CsParser.CLB_SQ); }
		public Argument_expression_listContext argument_expression_list(int i) {
			return getRuleContext(Argument_expression_listContext.class,i);
		}
		public TerminalNode CLB_SQ(int i) {
			return getToken(CsParser.CLB_SQ, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(CsParser.DOT, i);
		}
		public List<Postfix_expressionContext> postfix_expression() {
			return getRuleContexts(Postfix_expressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> INCREMENT() { return getTokens(CsParser.INCREMENT); }
		public List<TerminalNode> DOT() { return getTokens(CsParser.DOT); }
		public TerminalNode OPB_RND(int i) {
			return getToken(CsParser.OPB_RND, i);
		}
		public TerminalNode INCREMENT(int i) {
			return getToken(CsParser.INCREMENT, i);
		}
		public List<TerminalNode> CLB_RND() { return getTokens(CsParser.CLB_RND); }
		public List<TerminalNode> OPB_RND() { return getTokens(CsParser.OPB_RND); }
		public TerminalNode DECREMENT(int i) {
			return getToken(CsParser.DECREMENT, i);
		}
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterPostfix_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitPostfix_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitPostfix_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_postfix_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328); primary_expression();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(342);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(329); match(OPB_SQ);
						setState(330); expression();
						setState(331); match(CLB_SQ);
						}
						break;

					case 2:
						{
						setState(333); match(OPB_RND);
						setState(334); match(CLB_RND);
						}
						break;

					case 3:
						{
						setState(335); match(OPB_RND);
						setState(336); argument_expression_list();
						setState(337); match(CLB_RND);
						}
						break;

					case 4:
						{
						setState(339); match(DOT);
						setState(340); postfix_expression();
						}
						break;

					case 5:
						{
						setState(341);
						_la = _input.LA(1);
						if ( !(_la==INCREMENT || _la==DECREMENT) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_expressionContext extends ParserRuleContext {
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterPrimary_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitPrimary_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitPrimary_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_primary_expression);
		try {
			setState(353);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(347); match(IDENTIFIER);
				}
				break;
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(348); constant();
				}
				break;
			case OPB_RND:
				enterOuterAlt(_localctx, 3);
				{
				setState(349); match(OPB_RND);
				setState(350); expression();
				setState(351); match(CLB_RND);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode OCTAL_LITERAL() { return getToken(CsParser.OCTAL_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(CsParser.STRING_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(CsParser.DECIMAL_LITERAL, 0); }
		public TerminalNode FLOATING_POINT_LITERAL() { return getToken(CsParser.FLOATING_POINT_LITERAL, 0); }
		public TerminalNode CHARACTER_LITERAL() { return getToken(CsParser.CHARACTER_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(CsParser.HEX_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (CHARACTER_LITERAL - 63)) | (1L << (STRING_LITERAL - 63)) | (1L << (HEX_LITERAL - 63)) | (1L << (DECIMAL_LITERAL - 63)) | (1L << (OCTAL_LITERAL - 63)) | (1L << (FLOATING_POINT_LITERAL - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(CsParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsParser.COMMA, i);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); assignment_expression();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(358); match(COMMA);
				setState(359); assignment_expression();
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365); conditional_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment_expression);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367); lvalue();
				setState(368); assignment_operator();
				setState(369); assignment_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371); conditional_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); unary_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conditional_expressionContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(CsParser.QUESTION, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(CsParser.DOUBLE_DOT, 0); }
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Conditional_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterConditional_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitConditional_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitConditional_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_expressionContext conditional_expression() throws RecognitionException {
		Conditional_expressionContext _localctx = new Conditional_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); logical_or_expression();
			setState(382);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(377); match(QUESTION);
				setState(378); expression();
				setState(379); match(DOUBLE_DOT);
				setState(380); conditional_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_or_expressionContext extends ParserRuleContext {
		public List<Logical_and_expressionContext> logical_and_expression() {
			return getRuleContexts(Logical_and_expressionContext.class);
		}
		public List<TerminalNode> OR() { return getTokens(CsParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CsParser.OR, i);
		}
		public Logical_and_expressionContext logical_and_expression(int i) {
			return getRuleContext(Logical_and_expressionContext.class,i);
		}
		public Logical_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterLogical_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitLogical_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitLogical_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_or_expressionContext logical_or_expression() throws RecognitionException {
		Logical_or_expressionContext _localctx = new Logical_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); logical_and_expression();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(385); match(OR);
				setState(386); logical_and_expression();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public List<Inclusive_or_expressionContext> inclusive_or_expression() {
			return getRuleContexts(Inclusive_or_expressionContext.class);
		}
		public List<TerminalNode> AND() { return getTokens(CsParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CsParser.AND, i);
		}
		public Inclusive_or_expressionContext inclusive_or_expression(int i) {
			return getRuleContext(Inclusive_or_expressionContext.class,i);
		}
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterLogical_and_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitLogical_and_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitLogical_and_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); inclusive_or_expression();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(393); match(AND);
				setState(394); inclusive_or_expression();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public TerminalNode BIT_OR(int i) {
			return getToken(CsParser.BIT_OR, i);
		}
		public List<TerminalNode> BIT_OR() { return getTokens(CsParser.BIT_OR); }
		public Exclusive_or_expressionContext exclusive_or_expression(int i) {
			return getRuleContext(Exclusive_or_expressionContext.class,i);
		}
		public List<Exclusive_or_expressionContext> exclusive_or_expression() {
			return getRuleContexts(Exclusive_or_expressionContext.class);
		}
		public Inclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterInclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitInclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitInclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inclusive_or_expressionContext inclusive_or_expression() throws RecognitionException {
		Inclusive_or_expressionContext _localctx = new Inclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); exclusive_or_expression();
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_OR) {
				{
				{
				setState(401); match(BIT_OR);
				setState(402); exclusive_or_expression();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public TerminalNode BIT_XOR(int i) {
			return getToken(CsParser.BIT_XOR, i);
		}
		public List<TerminalNode> BIT_XOR() { return getTokens(CsParser.BIT_XOR); }
		public And_expressionContext and_expression(int i) {
			return getRuleContext(And_expressionContext.class,i);
		}
		public List<And_expressionContext> and_expression() {
			return getRuleContexts(And_expressionContext.class);
		}
		public Exclusive_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterExclusive_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitExclusive_or_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitExclusive_or_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exclusive_or_expressionContext exclusive_or_expression() throws RecognitionException {
		Exclusive_or_expressionContext _localctx = new Exclusive_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); and_expression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT_XOR) {
				{
				{
				setState(409); match(BIT_XOR);
				setState(410); and_expression();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class And_expressionContext extends ParserRuleContext {
		public TerminalNode BIT_AND(int i) {
			return getToken(CsParser.BIT_AND, i);
		}
		public List<TerminalNode> BIT_AND() { return getTokens(CsParser.BIT_AND); }
		public Equality_expressionContext equality_expression(int i) {
			return getRuleContext(Equality_expressionContext.class,i);
		}
		public List<Equality_expressionContext> equality_expression() {
			return getRuleContexts(Equality_expressionContext.class);
		}
		public And_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterAnd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitAnd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitAnd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_expressionContext and_expression() throws RecognitionException {
		And_expressionContext _localctx = new And_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_and_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416); equality_expression();
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(417); match(BIT_AND);
					setState(418); equality_expression();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_expressionContext extends ParserRuleContext {
		public List<Relational_expressionContext> relational_expression() {
			return getRuleContexts(Relational_expressionContext.class);
		}
		public List<Equality_operatorContext> equality_operator() {
			return getRuleContexts(Equality_operatorContext.class);
		}
		public Relational_expressionContext relational_expression(int i) {
			return getRuleContext(Relational_expressionContext.class,i);
		}
		public Equality_operatorContext equality_operator(int i) {
			return getRuleContext(Equality_operatorContext.class,i);
		}
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterEquality_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitEquality_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitEquality_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); relational_expression();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQ || _la==NEQ) {
				{
				{
				setState(425); equality_operator();
				setState(426); relational_expression();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Relational_expressionContext extends ParserRuleContext {
		public List<Shift_expressionContext> shift_expression() {
			return getRuleContexts(Shift_expressionContext.class);
		}
		public List<Comparsion_operatorContext> comparsion_operator() {
			return getRuleContexts(Comparsion_operatorContext.class);
		}
		public Comparsion_operatorContext comparsion_operator(int i) {
			return getRuleContext(Comparsion_operatorContext.class,i);
		}
		public Shift_expressionContext shift_expression(int i) {
			return getRuleContext(Shift_expressionContext.class,i);
		}
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterRelational_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitRelational_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitRelational_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433); shift_expression();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) {
				{
				{
				setState(434); comparsion_operator();
				setState(435); shift_expression();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_expressionContext extends ParserRuleContext {
		public Additive_expressionContext additive_expression(int i) {
			return getRuleContext(Additive_expressionContext.class,i);
		}
		public Shift_operatorContext shift_operator(int i) {
			return getRuleContext(Shift_operatorContext.class,i);
		}
		public List<Shift_operatorContext> shift_operator() {
			return getRuleContexts(Shift_operatorContext.class);
		}
		public List<Additive_expressionContext> additive_expression() {
			return getRuleContexts(Additive_expressionContext.class);
		}
		public Shift_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterShift_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitShift_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitShift_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_expressionContext shift_expression() throws RecognitionException {
		Shift_expressionContext _localctx = new Shift_expressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); additive_expression();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LSHIFT || _la==RSHIFT) {
				{
				{
				setState(443); shift_operator();
				setState(444); additive_expression();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_statement);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case OPB_FIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(451); compound_statement();
				}
				break;
			case NEW:
			case INCREMENT:
			case DECREMENT:
			case OPB_RND:
			case SEMICOLON:
			case PLUS:
			case MINUS:
			case MUL:
			case BIT_AND:
			case NOT:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(452); expression_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(453); selection_statement();
				}
				break;
			case FOR:
			case WHILE:
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(454); iteration_statement();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(455); jump_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode OPB_FIG() { return getToken(CsParser.OPB_FIG, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode CLB_FIG() { return getToken(CsParser.CLB_FIG, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); match(OPB_FIG);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ENUM) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << PRIMITIVE_TYPE) | (1L << PRIMITIVE_TYPE_MODIFIER) | (1L << ACCESS_MODIFIER) | (1L << OTHER_MODIFIER) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_FIG) | (1L << OPB_RND) | (1L << SEMICOLON) | (1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << BIT_AND) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				setState(461);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(459); declaration();
					}
					break;

				case 2:
					{
					setState(460); statement();
					}
					break;
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466); match(CLB_FIG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CsParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expression_statement);
		try {
			setState(472);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(468); match(SEMICOLON);
				}
				break;
			case NEW:
			case INCREMENT:
			case DECREMENT:
			case OPB_RND:
			case PLUS:
			case MINUS:
			case MUL:
			case BIT_AND:
			case NOT:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(469); expression();
				setState(470); match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selection_statementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode IF() { return getToken(CsParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(CsParser.ELSE, 0); }
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterSelection_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitSelection_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitSelection_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474); match(IF);
			setState(475); match(OPB_RND);
			setState(476); expression();
			setState(477); match(CLB_RND);
			setState(478); statement();
			setState(481);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(479); match(ELSE);
				setState(480); statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Iteration_statementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CsParser.WHILE, 0); }
		public TerminalNode SEMICOLON() { return getToken(CsParser.SEMICOLON, 0); }
		public TerminalNode DO() { return getToken(CsParser.DO, 0); }
		public TerminalNode FOR() { return getToken(CsParser.FOR, 0); }
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public List<Expression_statementContext> expression_statement() {
			return getRuleContexts(Expression_statementContext.class);
		}
		public Expression_statementContext expression_statement(int i) {
			return getRuleContext(Expression_statementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterIteration_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitIteration_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitIteration_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_iteration_statement);
		int _la;
		try {
			setState(507);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(483); match(WHILE);
				setState(484); match(OPB_RND);
				setState(485); expression();
				setState(486); match(CLB_RND);
				setState(487); statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(489); match(DO);
				setState(490); statement();
				setState(491); match(WHILE);
				setState(492); match(OPB_RND);
				setState(493); expression();
				setState(494); match(CLB_RND);
				setState(495); match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(497); match(FOR);
				setState(498); match(OPB_RND);
				setState(499); expression_statement();
				setState(500); expression_statement();
				setState(502);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << BIT_AND) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(501); expression();
					}
				}

				setState(504); match(CLB_RND);
				setState(505); statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Jump_statementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(CsParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(CsParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(CsParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(CsParser.CONTINUE, 0); }
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterJump_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitJump_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitJump_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_jump_statement);
		try {
			setState(519);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509); match(CONTINUE);
				setState(510); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511); match(BREAK);
				setState(512); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(513); match(RETURN);
				setState(514); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515); match(RETURN);
				setState(516); expression();
				setState(517); match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_and_modify_operatorContext extends ParserRuleContext {
		public TerminalNode RSHIFT_ASS() { return getToken(CsParser.RSHIFT_ASS, 0); }
		public TerminalNode DIV_ASS() { return getToken(CsParser.DIV_ASS, 0); }
		public TerminalNode MUL_ASS() { return getToken(CsParser.MUL_ASS, 0); }
		public TerminalNode LSHIFT_ASS() { return getToken(CsParser.LSHIFT_ASS, 0); }
		public TerminalNode XOR_ASS() { return getToken(CsParser.XOR_ASS, 0); }
		public TerminalNode REM_ASS() { return getToken(CsParser.REM_ASS, 0); }
		public TerminalNode SUB_ASS() { return getToken(CsParser.SUB_ASS, 0); }
		public TerminalNode ADD_ASS() { return getToken(CsParser.ADD_ASS, 0); }
		public TerminalNode OR_ASS() { return getToken(CsParser.OR_ASS, 0); }
		public Assign_and_modify_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_and_modify_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterAssign_and_modify_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitAssign_and_modify_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitAssign_and_modify_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_and_modify_operatorContext assign_and_modify_operator() throws RecognitionException {
		Assign_and_modify_operatorContext _localctx = new Assign_and_modify_operatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assign_and_modify_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_ASS) | (1L << DIV_ASS) | (1L << REM_ASS) | (1L << ADD_ASS) | (1L << SUB_ASS) | (1L << LSHIFT_ASS) | (1L << RSHIFT_ASS) | (1L << XOR_ASS) | (1L << OR_ASS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(CsParser.MUL, 0); }
		public TerminalNode BIT_AND() { return getToken(CsParser.BIT_AND, 0); }
		public TerminalNode MINUS() { return getToken(CsParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CsParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(CsParser.PLUS, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MUL) | (1L << BIT_AND) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_operatorContext extends ParserRuleContext {
		public TerminalNode NEQ() { return getToken(CsParser.NEQ, 0); }
		public TerminalNode EQ() { return getToken(CsParser.EQ, 0); }
		public Equality_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterEquality_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitEquality_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitEquality_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_operatorContext equality_operator() throws RecognitionException {
		Equality_operatorContext _localctx = new Equality_operatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparsion_operatorContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CsParser.LT, 0); }
		public TerminalNode LE() { return getToken(CsParser.LE, 0); }
		public TerminalNode GT() { return getToken(CsParser.GT, 0); }
		public TerminalNode GE() { return getToken(CsParser.GE, 0); }
		public Comparsion_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparsion_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterComparsion_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitComparsion_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitComparsion_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparsion_operatorContext comparsion_operator() throws RecognitionException {
		Comparsion_operatorContext _localctx = new Comparsion_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comparsion_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shift_operatorContext extends ParserRuleContext {
		public TerminalNode RSHIFT() { return getToken(CsParser.RSHIFT, 0); }
		public TerminalNode LSHIFT() { return getToken(CsParser.LSHIFT, 0); }
		public Shift_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).enterShift_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsListener ) ((CsListener)listener).exitShift_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CsVisitor ) return ((CsVisitor<? extends T>)visitor).visitShift_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operatorContext shift_operator() throws RecognitionException {
		Shift_operatorContext _localctx = new Shift_operatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !(_la==LSHIFT || _la==RSHIFT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3J\u0216\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\5\2l\n\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\5\4\u0089\n\4\3\5\3\5\3\5\3\5\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6"+
		"\3\6\3\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\7\3\7\3\7\7\7\u009f\n\7\f"+
		"\7\16\7\u00a2\13\7\3\b\5\b\u00a5\n\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\t\3\t"+
		"\7\t\u00ae\n\t\f\t\16\t\u00b1\13\t\3\t\3\t\3\n\3\n\7\n\u00b7\n\n\f\n\16"+
		"\n\u00ba\13\n\3\n\3\n\3\13\3\13\7\13\u00c0\n\13\f\13\16\13\u00c3\13\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cd\n\f\3\r\5\r\u00d0\n\r\3\r"+
		"\3\r\3\r\5\r\u00d5\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00e4\n\16\3\17\3\17\3\17\7\17\u00e9\n\17\f\17"+
		"\16\17\u00ec\13\17\3\20\3\20\3\20\5\20\u00f1\n\20\3\21\3\21\3\21\5\21"+
		"\u00f6\n\21\3\22\3\22\3\22\7\22\u00fb\n\22\f\22\16\22\u00fe\13\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u0106\n\24\f\24\16\24\u0109\13\24\3\25"+
		"\3\25\3\25\7\25\u010e\n\25\f\25\16\25\u0111\13\25\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0118\n\26\f\26\16\26\u011b\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0124\n\27\f\27\16\27\u0127\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u012e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0139\n\31\3\32\3\32\3\32\7\32\u013e\n\32\f\32\16\32\u0141\13\32\3\32"+
		"\7\32\u0144\n\32\f\32\16\32\u0147\13\32\5\32\u0149\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0159\n\33"+
		"\f\33\16\33\u015c\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0164\n\34"+
		"\3\35\3\35\3\36\3\36\3\36\7\36\u016b\n\36\f\36\16\36\u016e\13\36\3\37"+
		"\3\37\3 \3 \3 \3 \3 \5 \u0177\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0181"+
		"\n\"\3#\3#\3#\7#\u0186\n#\f#\16#\u0189\13#\3$\3$\3$\7$\u018e\n$\f$\16"+
		"$\u0191\13$\3%\3%\3%\7%\u0196\n%\f%\16%\u0199\13%\3&\3&\3&\7&\u019e\n"+
		"&\f&\16&\u01a1\13&\3\'\3\'\3\'\7\'\u01a6\n\'\f\'\16\'\u01a9\13\'\3(\3"+
		"(\3(\3(\7(\u01af\n(\f(\16(\u01b2\13(\3)\3)\3)\3)\7)\u01b8\n)\f)\16)\u01bb"+
		"\13)\3*\3*\3*\3*\7*\u01c1\n*\f*\16*\u01c4\13*\3+\3+\3+\3+\3+\5+\u01cb"+
		"\n+\3,\3,\3,\7,\u01d0\n,\f,\16,\u01d3\13,\3,\3,\3-\3-\3-\3-\5-\u01db\n"+
		"-\3.\3.\3.\3.\3.\3.\3.\5.\u01e4\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\5/\u01f9\n/\3/\3/\3/\5/\u01fe\n/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u020a\n\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\65\2\66\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\n\3\2\22\23"+
		"\3\2\'(\3\2AF\4\2\25\33\35\36\5\2\64\6688??\3\2\37 \3\2!$\3\2%&\u0229"+
		"\2k\3\2\2\2\4\u0081\3\2\2\2\6\u0088\3\2\2\2\b\u008a\3\2\2\2\n\u0091\3"+
		"\2\2\2\f\u009b\3\2\2\2\16\u00a4\3\2\2\2\20\u00ab\3\2\2\2\22\u00b4\3\2"+
		"\2\2\24\u00bd\3\2\2\2\26\u00cc\3\2\2\2\30\u00d4\3\2\2\2\32\u00e3\3\2\2"+
		"\2\34\u00e5\3\2\2\2\36\u00ed\3\2\2\2 \u00f2\3\2\2\2\"\u00f7\3\2\2\2$\u00ff"+
		"\3\2\2\2&\u0102\3\2\2\2(\u010a\3\2\2\2*\u0112\3\2\2\2,\u011c\3\2\2\2."+
		"\u012d\3\2\2\2\60\u0138\3\2\2\2\62\u013a\3\2\2\2\64\u014a\3\2\2\2\66\u0163"+
		"\3\2\2\28\u0165\3\2\2\2:\u0167\3\2\2\2<\u016f\3\2\2\2>\u0176\3\2\2\2@"+
		"\u0178\3\2\2\2B\u017a\3\2\2\2D\u0182\3\2\2\2F\u018a\3\2\2\2H\u0192\3\2"+
		"\2\2J\u019a\3\2\2\2L\u01a2\3\2\2\2N\u01aa\3\2\2\2P\u01b3\3\2\2\2R\u01bc"+
		"\3\2\2\2T\u01ca\3\2\2\2V\u01cc\3\2\2\2X\u01da\3\2\2\2Z\u01dc\3\2\2\2\\"+
		"\u01fd\3\2\2\2^\u0209\3\2\2\2`\u020b\3\2\2\2b\u020d\3\2\2\2d\u020f\3\2"+
		"\2\2f\u0211\3\2\2\2h\u0213\3\2\2\2jl\7\22\2\2kj\3\2\2\2kl\3\2\2\2lp\3"+
		"\2\2\2mo\7\23\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp"+
		"\3\2\2\2st\7\4\2\2tu\7@\2\2u|\7)\2\2v{\5\4\3\2w{\5\2\2\2x{\5\32\16\2y"+
		"{\5\b\5\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7*\2\2\u0080\3\3\2\2\2\u0081"+
		"\u0082\5\n\6\2\u0082\u0083\7@\2\2\u0083\u0084\5\26\f\2\u0084\u0085\5V"+
		",\2\u0085\5\3\2\2\2\u0086\u0089\5`\61\2\u0087\u0089\7\24\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0087\3\2\2\2\u0089\7\3\2\2\2\u008a\u008b\5\n\6\2\u008b"+
		"\u008c\5\f\7\2\u008c\u008d\7/\2\2\u008d\t\3\2\2\2\u008e\u0090\t\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0098\5\30\r\2"+
		"\u0095\u0097\5\20\t\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u00a0\5\16\b\2\u009c\u009d\7\61\2\2\u009d\u009f\5\16\b\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\r\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7@\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a7\5\6\4\2\u00a7\u00a8"+
		"\5> \2\u00a8\u00aa\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\17\3\2\2\2\u00ab\u00af\7-\2\2\u00ac\u00ae\7\61\2\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7.\2\2\u00b3\21\3\2\2\2\u00b4"+
		"\u00b8\7-\2\2\u00b5\u00b7\5(\25\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\23\3\2\2\2\u00bd\u00c1\7+\2\2"+
		"\u00be\u00c0\5(\25\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c5\7,\2\2\u00c5\25\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\5 \21\2"+
		"\u00c8\u00c9\7,\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cb\7+\2\2\u00cb\u00cd"+
		"\7,\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\27\3\2\2\2\u00ce"+
		"\u00d0\7\21\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3"+
		"\2\2\2\u00d1\u00d5\7\20\2\2\u00d2\u00d5\5\32\16\2\u00d3\u00d5\7@\2\2\u00d4"+
		"\u00cf\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\31\3\2\2"+
		"\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\7)\2\2\u00d8\u00d9\5\34\17\2\u00d9"+
		"\u00da\7*\2\2\u00da\u00e4\3\2\2\2\u00db\u00dc\7\5\2\2\u00dc\u00dd\7@\2"+
		"\2\u00dd\u00de\7)\2\2\u00de\u00df\5\34\17\2\u00df\u00e0\7*\2\2\u00e0\u00e4"+
		"\3\2\2\2\u00e1\u00e2\7\5\2\2\u00e2\u00e4\7@\2\2\u00e3\u00d6\3\2\2\2\u00e3"+
		"\u00db\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\33\3\2\2\2\u00e5\u00ea\5\36\20"+
		"\2\u00e6\u00e7\7\61\2\2\u00e7\u00e9\5\36\20\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\35\3\2\2"+
		"\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\7@\2\2\u00ee\u00ef\7\24\2\2\u00ef\u00f1"+
		"\5<\37\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2"+
		"\u00f5\5\"\22\2\u00f3\u00f4\7\61\2\2\u00f4\u00f6\7\63\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00fc\5$\23\2\u00f8"+
		"\u00f9\7\61\2\2\u00f9\u00fb\5$\23\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0100\5\n\6\2\u0100\u0101\7@\2\2\u0101%\3\2\2\2\u0102\u0107"+
		"\7@\2\2\u0103\u0104\7\61\2\2\u0104\u0106\7@\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\'\3\2\2\2"+
		"\u0109\u0107\3\2\2\2\u010a\u010f\5> \2\u010b\u010c\7\61\2\2\u010c\u010e"+
		"\5> \2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110)\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0119\5,\27\2"+
		"\u0113\u0114\7\64\2\2\u0114\u0118\5,\27\2\u0115\u0116\7\65\2\2\u0116\u0118"+
		"\5,\27\2\u0117\u0113\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a+\3\2\2\2\u011b\u0119\3\2\2\2"+
		"\u011c\u0125\5.\30\2\u011d\u011e\7\66\2\2\u011e\u0124\5.\30\2\u011f\u0120"+
		"\7\67\2\2\u0120\u0124\5.\30\2\u0121\u0122\7>\2\2\u0122\u0124\5.\30\2\u0123"+
		"\u011d\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126-\3\2\2\2\u0127\u0125"+
		"\3\2\2\2\u0128\u0129\7+\2\2\u0129\u012a\7@\2\2\u012a\u012b\7,\2\2\u012b"+
		"\u012e\5.\30\2\u012c\u012e\5\60\31\2\u012d\u0128\3\2\2\2\u012d\u012c\3"+
		"\2\2\2\u012e/\3\2\2\2\u012f\u0139\5\62\32\2\u0130\u0139\5\64\33\2\u0131"+
		"\u0132\7\'\2\2\u0132\u0139\5\60\31\2\u0133\u0134\7(\2\2\u0134\u0139\5"+
		"\60\31\2\u0135\u0136\5b\62\2\u0136\u0137\5.\30\2\u0137\u0139\3\2\2\2\u0138"+
		"\u012f\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0133\3\2"+
		"\2\2\u0138\u0135\3\2\2\2\u0139\61\3\2\2\2\u013a\u013b\7\3\2\2\u013b\u0148"+
		"\5\30\r\2\u013c\u013e\5\22\n\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0149\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0142\u0144\5\24\13\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0145\3\2\2\2\u0149\63\3\2\2\2\u014a"+
		"\u015a\5\66\34\2\u014b\u014c\7-\2\2\u014c\u014d\5:\36\2\u014d\u014e\7"+
		".\2\2\u014e\u0159\3\2\2\2\u014f\u0150\7+\2\2\u0150\u0159\7,\2\2\u0151"+
		"\u0152\7+\2\2\u0152\u0153\5(\25\2\u0153\u0154\7,\2\2\u0154\u0159\3\2\2"+
		"\2\u0155\u0156\7\62\2\2\u0156\u0159\5\64\33\2\u0157\u0159\t\3\2\2\u0158"+
		"\u014b\3\2\2\2\u0158\u014f\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0155\3\2"+
		"\2\2\u0158\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\65\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0164\7@\2\2"+
		"\u015e\u0164\58\35\2\u015f\u0160\7+\2\2\u0160\u0161\5:\36\2\u0161\u0162"+
		"\7,\2\2\u0162\u0164\3\2\2\2\u0163\u015d\3\2\2\2\u0163\u015e\3\2\2\2\u0163"+
		"\u015f\3\2\2\2\u0164\67\3\2\2\2\u0165\u0166\t\4\2\2\u01669\3\2\2\2\u0167"+
		"\u016c\5> \2\u0168\u0169\7\61\2\2\u0169\u016b\5> \2\u016a\u0168\3\2\2"+
		"\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d;"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\5B\"\2\u0170=\3\2\2\2\u0171\u0172"+
		"\5@!\2\u0172\u0173\5\6\4\2\u0173\u0174\5> \2\u0174\u0177\3\2\2\2\u0175"+
		"\u0177\5B\"\2\u0176\u0171\3\2\2\2\u0176\u0175\3\2\2\2\u0177?\3\2\2\2\u0178"+
		"\u0179\5\60\31\2\u0179A\3\2\2\2\u017a\u0180\5D#\2\u017b\u017c\7=\2\2\u017c"+
		"\u017d\5:\36\2\u017d\u017e\7\60\2\2\u017e\u017f\5B\"\2\u017f\u0181\3\2"+
		"\2\2\u0180\u017b\3\2\2\2\u0180\u0181\3\2\2\2\u0181C\3\2\2\2\u0182\u0187"+
		"\5F$\2\u0183\u0184\7<\2\2\u0184\u0186\5F$\2\u0185\u0183\3\2\2\2\u0186"+
		"\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188E\3\2\2\2"+
		"\u0189\u0187\3\2\2\2\u018a\u018f\5H%\2\u018b\u018c\7;\2\2\u018c\u018e"+
		"\5H%\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190G\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0197\5J&\2\u0193"+
		"\u0194\79\2\2\u0194\u0196\5J&\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2"+
		"\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198I\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019f\5L\'\2\u019b\u019c\7:\2\2\u019c\u019e\5L\'\2\u019d"+
		"\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0K\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a7\5N(\2\u01a3\u01a4"+
		"\78\2\2\u01a4\u01a6\5N(\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8M\3\2\2\2\u01a9\u01a7\3\2\2\2"+
		"\u01aa\u01b0\5P)\2\u01ab\u01ac\5d\63\2\u01ac\u01ad\5P)\2\u01ad\u01af\3"+
		"\2\2\2\u01ae\u01ab\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1O\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b9\5R*\2\u01b4"+
		"\u01b5\5f\64\2\u01b5\u01b6\5R*\2\u01b6\u01b8\3\2\2\2\u01b7\u01b4\3\2\2"+
		"\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baQ"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01c2\5*\26\2\u01bd\u01be\5h\65\2\u01be"+
		"\u01bf\5*\26\2\u01bf\u01c1\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c1\u01c4\3\2"+
		"\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3S\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c5\u01cb\5V,\2\u01c6\u01cb\5X-\2\u01c7\u01cb\5Z.\2\u01c8\u01cb"+
		"\5\\/\2\u01c9\u01cb\5^\60\2\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01ca"+
		"\u01c7\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbU\3\2\2\2"+
		"\u01cc\u01d1\7)\2\2\u01cd\u01d0\5\b\5\2\u01ce\u01d0\5T+\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4\u01d5\7*"+
		"\2\2\u01d5W\3\2\2\2\u01d6\u01db\7/\2\2\u01d7\u01d8\5:\36\2\u01d8\u01d9"+
		"\7/\2\2\u01d9\u01db\3\2\2\2\u01da\u01d6\3\2\2\2\u01da\u01d7\3\2\2\2\u01db"+
		"Y\3\2\2\2\u01dc\u01dd\7\b\2\2\u01dd\u01de\7+\2\2\u01de\u01df\5:\36\2\u01df"+
		"\u01e0\7,\2\2\u01e0\u01e3\5T+\2\u01e1\u01e2\7\t\2\2\u01e2\u01e4\5T+\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4[\3\2\2\2\u01e5\u01e6\7"+
		"\13\2\2\u01e6\u01e7\7+\2\2\u01e7\u01e8\5:\36\2\u01e8\u01e9\7,\2\2\u01e9"+
		"\u01ea\5T+\2\u01ea\u01fe\3\2\2\2\u01eb\u01ec\7\f\2\2\u01ec\u01ed\5T+\2"+
		"\u01ed\u01ee\7\13\2\2\u01ee\u01ef\7+\2\2\u01ef\u01f0\5:\36\2\u01f0\u01f1"+
		"\7,\2\2\u01f1\u01f2\7/\2\2\u01f2\u01fe\3\2\2\2\u01f3\u01f4\7\n\2\2\u01f4"+
		"\u01f5\7+\2\2\u01f5\u01f6\5X-\2\u01f6\u01f8\5X-\2\u01f7\u01f9\5:\36\2"+
		"\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb"+
		"\7,\2\2\u01fb\u01fc\5T+\2\u01fc\u01fe\3\2\2\2\u01fd\u01e5\3\2\2\2\u01fd"+
		"\u01eb\3\2\2\2\u01fd\u01f3\3\2\2\2\u01fe]\3\2\2\2\u01ff\u0200\7\r\2\2"+
		"\u0200\u020a\7/\2\2\u0201\u0202\7\16\2\2\u0202\u020a\7/\2\2\u0203\u0204"+
		"\7\17\2\2\u0204\u020a\7/\2\2\u0205\u0206\7\17\2\2\u0206\u0207\5:\36\2"+
		"\u0207\u0208\7/\2\2\u0208\u020a\3\2\2\2\u0209\u01ff\3\2\2\2\u0209\u0201"+
		"\3\2\2\2\u0209\u0203\3\2\2\2\u0209\u0205\3\2\2\2\u020a_\3\2\2\2\u020b"+
		"\u020c\t\5\2\2\u020ca\3\2\2\2\u020d\u020e\t\6\2\2\u020ec\3\2\2\2\u020f"+
		"\u0210\t\7\2\2\u0210e\3\2\2\2\u0211\u0212\t\b\2\2\u0212g\3\2\2\2\u0213"+
		"\u0214\t\t\2\2\u0214i\3\2\2\28kpz|\u0088\u0091\u0098\u00a0\u00a4\u00a9"+
		"\u00af\u00b8\u00c1\u00cc\u00cf\u00d4\u00e3\u00ea\u00f0\u00f5\u00fc\u0107"+
		"\u010f\u0117\u0119\u0123\u0125\u012d\u0138\u013f\u0145\u0148\u0158\u015a"+
		"\u0163\u016c\u0176\u0180\u0187\u018f\u0197\u019f\u01a7\u01b0\u01b9\u01c2"+
		"\u01ca\u01cf\u01d1\u01da\u01e3\u01f8\u01fd\u0209";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}