// Generated from /home/ilia/Compiler2014/Cs.g4 by ANTLR 4.3
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
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

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
		RULE_additive_expression = 20, RULE_multiplicative_expression = 21, RULE_unary_expression = 22, 
		RULE_constructor_call = 23, RULE_postfix_expression = 24, RULE_primary_expression = 25, 
		RULE_constant = 26, RULE_assignment_expression = 27, RULE_conditional_expression = 28, 
		RULE_logical_or_expression = 29, RULE_logical_and_expression = 30, RULE_inclusive_or_expression = 31, 
		RULE_exclusive_or_expression = 32, RULE_and_expression = 33, RULE_equality_expression = 34, 
		RULE_relational_expression = 35, RULE_shift_expression = 36, RULE_statement = 37, 
		RULE_compound_statement = 38, RULE_expression_statement = 39, RULE_selection_statement = 40, 
		RULE_iteration_statement = 41, RULE_jump_statement = 42, RULE_assign_and_modify_operator = 43, 
		RULE_unary_operator = 44, RULE_equality_operator = 45, RULE_comparsion_operator = 46, 
		RULE_shift_operator = 47;
	public static final String[] ruleNames = {
		"cls_def", "cls_method", "assignment_operator", "declaration", "declaration_specifier", 
		"init_declarator_list", "init_declarator", "arr_suffix", "arr_arg_suffix", 
		"arg_suffix", "declarator_suffix", "type_specifier", "enum_specifier", 
		"enumerator_list", "enumerator", "parameter_type_list", "parameter_list", 
		"parameter_declaration", "identifier_list", "argument_expression_list", 
		"additive_expression", "multiplicative_expression", "unary_expression", 
		"constructor_call", "postfix_expression", "primary_expression", "constant", 
		"assignment_expression", "conditional_expression", "logical_or_expression", 
		"logical_and_expression", "inclusive_or_expression", "exclusive_or_expression", 
		"and_expression", "equality_expression", "relational_expression", "shift_expression", 
		"statement", "compound_statement", "expression_statement", "selection_statement", 
		"iteration_statement", "jump_statement", "assign_and_modify_operator", 
		"unary_operator", "equality_operator", "comparsion_operator", "shift_operator"
	};

	@Override
	public String getGrammarFileName() { return "Cs.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

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
			setState(97);
			_la = _input.LA(1);
			if (_la==ACCESS_MODIFIER) {
				{
				setState(96); match(ACCESS_MODIFIER);
				}
			}

			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OTHER_MODIFIER) {
				{
				{
				setState(99); match(OTHER_MODIFIER);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(CLASS);
			setState(106); match(IDENTIFIER);
			setState(107); match(OPB_FIG);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << ENUM) | (1L << PRIMITIVE_TYPE) | (1L << PRIMITIVE_TYPE_MODIFIER) | (1L << ACCESS_MODIFIER) | (1L << OTHER_MODIFIER) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(112);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(108); cls_method();
					}
					break;

				case 2:
					{
					setState(109); cls_def();
					}
					break;

				case 3:
					{
					setState(110); enum_specifier();
					}
					break;

				case 4:
					{
					setState(111); declaration();
					}
					break;
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); match(CLB_FIG);
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
			setState(119); declaration_specifier();
			setState(120); match(IDENTIFIER);
			setState(121); declarator_suffix();
			setState(122); compound_statement();
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
			setState(126);
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
				setState(124); assign_and_modify_operator();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(ASSIGN);
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
			setState(128); declaration_specifier();
			setState(129); init_declarator_list();
			setState(130); match(SEMICOLON);
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACCESS_MODIFIER || _la==OTHER_MODIFIER) {
				{
				{
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==ACCESS_MODIFIER || _la==OTHER_MODIFIER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138); type_specifier();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPB_SQ) {
				{
				{
				setState(139); arr_suffix();
				}
				}
				setState(144);
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
			setState(145); init_declarator();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146); match(COMMA);
				setState(147); init_declarator();
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
			setState(153); match(IDENTIFIER);
			setState(157);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << MUL_ASS) | (1L << DIV_ASS) | (1L << REM_ASS) | (1L << ADD_ASS) | (1L << SUB_ASS) | (1L << LSHIFT_ASS) | (1L << RSHIFT_ASS) | (1L << XOR_ASS) | (1L << OR_ASS))) != 0)) {
				{
				setState(154); assignment_operator();
				setState(155); assignment_expression();
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
			setState(159); match(OPB_SQ);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(160); match(COMMA);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166); match(CLB_SQ);
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
			setState(168); match(OPB_SQ);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				{
				setState(169); argument_expression_list();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); match(CLB_SQ);
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
			setState(177); match(OPB_RND);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				{
				setState(178); argument_expression_list();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(CLB_RND);
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
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(OPB_RND);
				setState(187); parameter_type_list();
				setState(188); match(CLB_RND);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(OPB_RND);
				setState(191); match(CLB_RND);
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
			setState(200);
			switch (_input.LA(1)) {
			case PRIMITIVE_TYPE:
			case PRIMITIVE_TYPE_MODIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				_la = _input.LA(1);
				if (_la==PRIMITIVE_TYPE_MODIFIER) {
					{
					setState(194); match(PRIMITIVE_TYPE_MODIFIER);
					}
				}

				setState(197); match(PRIMITIVE_TYPE);
				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); enum_specifier();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); match(IDENTIFIER);
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
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); match(ENUM);
				setState(203); match(OPB_FIG);
				setState(204); enumerator_list();
				setState(205); match(CLB_FIG);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); match(ENUM);
				setState(208); match(IDENTIFIER);
				setState(209); match(OPB_FIG);
				setState(210); enumerator_list();
				setState(211); match(CLB_FIG);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213); match(ENUM);
				setState(214); match(IDENTIFIER);
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
			setState(217); enumerator();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(218); match(COMMA);
				setState(219); enumerator();
				}
				}
				setState(224);
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
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
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
			setState(225); match(IDENTIFIER);
			setState(228);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(226); match(ASSIGN);
				setState(227); conditional_expression();
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
			setState(230); parameter_list();
			setState(233);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(231); match(COMMA);
				setState(232); match(ETC);
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
			setState(235); parameter_declaration();
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236); match(COMMA);
					setState(237); parameter_declaration();
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public Init_declaratorContext init_declarator() {
			return getRuleContext(Init_declaratorContext.class,0);
		}
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
			setState(243); declaration_specifier();
			setState(244); init_declarator();
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
			setState(246); match(IDENTIFIER);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(247); match(COMMA);
				setState(248); match(IDENTIFIER);
				}
				}
				setState(253);
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
			setState(254); assignment_expression();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255); match(COMMA);
				setState(256); assignment_expression();
				}
				}
				setState(261);
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
		public TerminalNode MINUS() { return getToken(CsParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CsParser.PLUS, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(262); multiplicative_expression();
			}
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(263); match(PLUS);
				setState(264); additive_expression();
				}
				break;

			case 2:
				{
				setState(265); match(MINUS);
				setState(266); additive_expression();
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(CsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CsParser.DIV, 0); }
		public List<Unary_expressionContext> unary_expression() {
			return getRuleContexts(Unary_expressionContext.class);
		}
		public TerminalNode REM() { return getToken(CsParser.REM, 0); }
		public Unary_expressionContext unary_expression(int i) {
			return getRuleContext(Unary_expressionContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(269); unary_expression();
			}
			setState(276);
			switch (_input.LA(1)) {
			case MUL:
				{
				setState(270); match(MUL);
				setState(271); unary_expression();
				}
				break;
			case DIV:
				{
				setState(272); match(DIV);
				setState(273); unary_expression();
				}
				break;
			case REM:
				{
				setState(274); match(REM);
				setState(275); unary_expression();
				}
				break;
			case NEW:
			case EQ:
			case NEQ:
			case GT:
			case LT:
			case GE:
			case LE:
			case LSHIFT:
			case RSHIFT:
			case INCREMENT:
			case DECREMENT:
			case CLB_FIG:
			case OPB_RND:
			case CLB_RND:
			case CLB_SQ:
			case SEMICOLON:
			case DOUBLE_DOT:
			case COMMA:
			case PLUS:
			case MINUS:
			case BIT_AND:
			case BIT_OR:
			case BIT_XOR:
			case AND:
			case OR:
			case QUESTION:
			case NOT:
			case IDENTIFIER:
			case CHARACTER_LITERAL:
			case STRING_LITERAL:
			case HEX_LITERAL:
			case DECIMAL_LITERAL:
			case OCTAL_LITERAL:
			case FLOATING_POINT_LITERAL:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Constructor_callContext constructor_call() {
			return getRuleContext(Constructor_callContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_unary_expression);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); constructor_call();
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
				setState(279); postfix_expression();
				}
				break;
			case INCREMENT:
			case DECREMENT:
			case PLUS:
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(280); unary_operator();
				setState(281); unary_expression();
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
		public List<Arr_arg_suffixContext> arr_arg_suffix() {
			return getRuleContexts(Arr_arg_suffixContext.class);
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
		public Arr_arg_suffixContext arr_arg_suffix(int i) {
			return getRuleContext(Arr_arg_suffixContext.class,i);
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
		enterRule(_localctx, 46, RULE_constructor_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(NEW);
			setState(286); type_specifier();
			setState(299);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPB_SQ) {
					{
					{
					setState(287); arr_arg_suffix();
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				{
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293); arg_suffix();
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public TerminalNode INCREMENT() { return getToken(CsParser.INCREMENT, 0); }
		public TerminalNode DOT() { return getToken(CsParser.DOT, 0); }
		public Argument_expression_listContext argument_expression_list() {
			return getRuleContext(Argument_expression_listContext.class,0);
		}
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public TerminalNode DECREMENT() { return getToken(CsParser.DECREMENT, 0); }
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
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
		enterRule(_localctx, 48, RULE_postfix_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); primary_expression();
			setState(316);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(303);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(302);
					_la = _input.LA(1);
					if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				}
				break;

			case 2:
				{
				setState(310);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(305); match(OPB_RND);
					setState(307);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
						{
						setState(306); argument_expression_list();
						}
					}

					setState(309); match(CLB_RND);
					}
					break;
				}
				setState(314);
				_la = _input.LA(1);
				if (_la==DOT) {
					{
					setState(312); match(DOT);
					setState(313); postfix_expression();
					}
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public List<Arr_arg_suffixContext> arr_arg_suffix() {
			return getRuleContexts(Arr_arg_suffixContext.class);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CsParser.IDENTIFIER, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
		public Arr_arg_suffixContext arr_arg_suffix(int i) {
			return getRuleContext(Arr_arg_suffixContext.class,i);
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
		enterRule(_localctx, 50, RULE_primary_expression);
		int _la;
		try {
			setState(330);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); match(IDENTIFIER);
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPB_SQ) {
					{
					{
					setState(319); arr_arg_suffix();
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
				setState(325); constant();
				}
				break;
			case OPB_RND:
				enterOuterAlt(_localctx, 3);
				{
				setState(326); match(OPB_RND);
				setState(327); assignment_expression();
				setState(328); match(CLB_RND);
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
		enterRule(_localctx, 52, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
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
		enterRule(_localctx, 54, RULE_assignment_expression);
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); unary_expression();
				setState(335); assignment_operator();
				setState(336); assignment_expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338); conditional_expression();
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

	public static class Conditional_expressionContext extends ParserRuleContext {
		public TerminalNode QUESTION() { return getToken(CsParser.QUESTION, 0); }
		public TerminalNode DOUBLE_DOT() { return getToken(CsParser.DOUBLE_DOT, 0); }
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Conditional_expressionContext conditional_expression() {
			return getRuleContext(Conditional_expressionContext.class,0);
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
		enterRule(_localctx, 56, RULE_conditional_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341); logical_or_expression();
			setState(347);
			_la = _input.LA(1);
			if (_la==QUESTION) {
				{
				setState(342); match(QUESTION);
				setState(343); assignment_expression();
				setState(344); match(DOUBLE_DOT);
				setState(345); conditional_expression();
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
		public Logical_or_expressionContext logical_or_expression() {
			return getRuleContext(Logical_or_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(CsParser.OR, 0); }
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
		enterRule(_localctx, 58, RULE_logical_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349); logical_and_expression();
			setState(352);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(350); match(OR);
				setState(351); logical_or_expression();
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(CsParser.AND, 0); }
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
		enterRule(_localctx, 60, RULE_logical_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); inclusive_or_expression();
			setState(357);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(355); match(AND);
				setState(356); logical_and_expression();
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

	public static class Inclusive_or_expressionContext extends ParserRuleContext {
		public Inclusive_or_expressionContext inclusive_or_expression() {
			return getRuleContext(Inclusive_or_expressionContext.class,0);
		}
		public TerminalNode BIT_OR() { return getToken(CsParser.BIT_OR, 0); }
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
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
		enterRule(_localctx, 62, RULE_inclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); exclusive_or_expression();
			setState(362);
			_la = _input.LA(1);
			if (_la==BIT_OR) {
				{
				setState(360); match(BIT_OR);
				setState(361); inclusive_or_expression();
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

	public static class Exclusive_or_expressionContext extends ParserRuleContext {
		public TerminalNode BIT_XOR() { return getToken(CsParser.BIT_XOR, 0); }
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
		}
		public Exclusive_or_expressionContext exclusive_or_expression() {
			return getRuleContext(Exclusive_or_expressionContext.class,0);
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
		enterRule(_localctx, 64, RULE_exclusive_or_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); and_expression();
			setState(367);
			_la = _input.LA(1);
			if (_la==BIT_XOR) {
				{
				setState(365); match(BIT_XOR);
				setState(366); exclusive_or_expression();
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

	public static class And_expressionContext extends ParserRuleContext {
		public TerminalNode BIT_AND() { return getToken(CsParser.BIT_AND, 0); }
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public And_expressionContext and_expression() {
			return getRuleContext(And_expressionContext.class,0);
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
		enterRule(_localctx, 66, RULE_and_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); equality_expression();
			setState(372);
			_la = _input.LA(1);
			if (_la==BIT_AND) {
				{
				setState(370); match(BIT_AND);
				setState(371); and_expression();
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Equality_operatorContext equality_operator() {
			return getRuleContext(Equality_operatorContext.class,0);
		}
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
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
		enterRule(_localctx, 68, RULE_equality_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); relational_expression();
			setState(378);
			_la = _input.LA(1);
			if (_la==EQ || _la==NEQ) {
				{
				setState(375); equality_operator();
				setState(376); equality_expression();
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Comparsion_operatorContext comparsion_operator() {
			return getRuleContext(Comparsion_operatorContext.class,0);
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
		enterRule(_localctx, 70, RULE_relational_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); shift_expression();
			setState(384);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE))) != 0)) {
				{
				setState(381); comparsion_operator();
				setState(382); relational_expression();
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

	public static class Shift_expressionContext extends ParserRuleContext {
		public Shift_expressionContext shift_expression() {
			return getRuleContext(Shift_expressionContext.class,0);
		}
		public Shift_operatorContext shift_operator() {
			return getRuleContext(Shift_operatorContext.class,0);
		}
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
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
		enterRule(_localctx, 72, RULE_shift_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); additive_expression();
			setState(390);
			_la = _input.LA(1);
			if (_la==LSHIFT || _la==RSHIFT) {
				{
				setState(387); shift_operator();
				setState(388); shift_expression();
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
		enterRule(_localctx, 74, RULE_statement);
		try {
			setState(397);
			switch (_input.LA(1)) {
			case OPB_FIG:
				enterOuterAlt(_localctx, 1);
				{
				setState(392); compound_statement();
				}
				break;
			case NEW:
			case INCREMENT:
			case DECREMENT:
			case OPB_RND:
			case SEMICOLON:
			case PLUS:
			case MINUS:
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
				setState(393); expression_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(394); selection_statement();
				}
				break;
			case FOR:
			case WHILE:
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(395); iteration_statement();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(396); jump_statement();
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
		enterRule(_localctx, 76, RULE_compound_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(OPB_FIG);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << ENUM) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << DO) | (1L << CONTINUE) | (1L << BREAK) | (1L << RETURN) | (1L << PRIMITIVE_TYPE) | (1L << PRIMITIVE_TYPE_MODIFIER) | (1L << ACCESS_MODIFIER) | (1L << OTHER_MODIFIER) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_FIG) | (1L << OPB_RND) | (1L << SEMICOLON) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
				{
				setState(402);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(400); declaration();
					}
					break;

				case 2:
					{
					setState(401); statement();
					}
					break;
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407); match(CLB_FIG);
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
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
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
		enterRule(_localctx, 78, RULE_expression_statement);
		try {
			setState(413);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(409); match(SEMICOLON);
				}
				break;
			case NEW:
			case INCREMENT:
			case DECREMENT:
			case OPB_RND:
			case PLUS:
			case MINUS:
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
				setState(410); assignment_expression();
				setState(411); match(SEMICOLON);
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
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CsParser.ELSE, 0); }
		public TerminalNode CLB_RND() { return getToken(CsParser.CLB_RND, 0); }
		public TerminalNode OPB_RND() { return getToken(CsParser.OPB_RND, 0); }
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
		enterRule(_localctx, 80, RULE_selection_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(IF);
			setState(416); match(OPB_RND);
			setState(417); assignment_expression();
			setState(418); match(CLB_RND);
			setState(419); statement();
			setState(422);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(420); match(ELSE);
				setState(421); statement();
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
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
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
		enterRule(_localctx, 82, RULE_iteration_statement);
		int _la;
		try {
			setState(448);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(424); match(WHILE);
				setState(425); match(OPB_RND);
				setState(426); assignment_expression();
				setState(427); match(CLB_RND);
				setState(428); statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(430); match(DO);
				setState(431); statement();
				setState(432); match(WHILE);
				setState(433); match(OPB_RND);
				setState(434); assignment_expression();
				setState(435); match(CLB_RND);
				setState(436); match(SEMICOLON);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(438); match(FOR);
				setState(439); match(OPB_RND);
				setState(440); expression_statement();
				setState(441); expression_statement();
				setState(443);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << OPB_RND) | (1L << PLUS) | (1L << MINUS) | (1L << NOT) | (1L << IDENTIFIER) | (1L << CHARACTER_LITERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRING_LITERAL - 64)) | (1L << (HEX_LITERAL - 64)) | (1L << (DECIMAL_LITERAL - 64)) | (1L << (OCTAL_LITERAL - 64)) | (1L << (FLOATING_POINT_LITERAL - 64)))) != 0)) {
					{
					setState(442); assignment_expression();
					}
				}

				setState(445); match(CLB_RND);
				setState(446); statement();
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
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CsParser.RETURN, 0); }
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
		enterRule(_localctx, 84, RULE_jump_statement);
		try {
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450); match(CONTINUE);
				setState(451); match(SEMICOLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452); match(BREAK);
				setState(453); match(SEMICOLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454); match(RETURN);
				setState(455); match(SEMICOLON);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(456); match(RETURN);
				setState(457); assignment_expression();
				setState(458); match(SEMICOLON);
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
		enterRule(_localctx, 86, RULE_assign_and_modify_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
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
		public TerminalNode INCREMENT() { return getToken(CsParser.INCREMENT, 0); }
		public TerminalNode MINUS() { return getToken(CsParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CsParser.NOT, 0); }
		public TerminalNode PLUS() { return getToken(CsParser.PLUS, 0); }
		public TerminalNode DECREMENT() { return getToken(CsParser.DECREMENT, 0); }
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
		enterRule(_localctx, 88, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INCREMENT) | (1L << DECREMENT) | (1L << PLUS) | (1L << MINUS) | (1L << NOT))) != 0)) ) {
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
		enterRule(_localctx, 90, RULE_equality_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
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
		enterRule(_localctx, 92, RULE_comparsion_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		enterRule(_localctx, 94, RULE_shift_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u01db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\5\2d\n\2\3\2\7\2g\n\2\f"+
		"\2\16\2j\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4\u0081\n\4\3\5\3\5\3\5\3\5\3\6\7\6"+
		"\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092\13"+
		"\6\3\7\3\7\3\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\3\b\3\b\3\b\3\b\5\b\u00a0"+
		"\n\b\3\t\3\t\7\t\u00a4\n\t\f\t\16\t\u00a7\13\t\3\t\3\t\3\n\3\n\7\n\u00ad"+
		"\n\n\f\n\16\n\u00b0\13\n\3\n\3\n\3\13\3\13\7\13\u00b6\n\13\f\13\16\13"+
		"\u00b9\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c3\n\f\3\r\5\r\u00c6"+
		"\n\r\3\r\3\r\3\r\5\r\u00cb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17\7\17\u00df\n"+
		"\17\f\17\16\17\u00e2\13\17\3\20\3\20\3\20\5\20\u00e7\n\20\3\21\3\21\3"+
		"\21\5\21\u00ec\n\21\3\22\3\22\3\22\7\22\u00f1\n\22\f\22\16\22\u00f4\13"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00fc\n\24\f\24\16\24\u00ff\13"+
		"\24\3\25\3\25\3\25\7\25\u0104\n\25\f\25\16\25\u0107\13\25\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u010e\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0117\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u011e\n\30\3\31\3\31\3\31\7"+
		"\31\u0123\n\31\f\31\16\31\u0126\13\31\3\31\7\31\u0129\n\31\f\31\16\31"+
		"\u012c\13\31\5\31\u012e\n\31\3\32\3\32\5\32\u0132\n\32\3\32\3\32\5\32"+
		"\u0136\n\32\3\32\5\32\u0139\n\32\3\32\3\32\5\32\u013d\n\32\5\32\u013f"+
		"\n\32\3\33\3\33\7\33\u0143\n\33\f\33\16\33\u0146\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u014d\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0156"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015e\n\36\3\37\3\37\3\37\5\37"+
		"\u0163\n\37\3 \3 \3 \5 \u0168\n \3!\3!\3!\5!\u016d\n!\3\"\3\"\3\"\5\""+
		"\u0172\n\"\3#\3#\3#\5#\u0177\n#\3$\3$\3$\3$\5$\u017d\n$\3%\3%\3%\3%\5"+
		"%\u0183\n%\3&\3&\3&\3&\5&\u0189\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0190\n\'\3"+
		"(\3(\3(\7(\u0195\n(\f(\16(\u0198\13(\3(\3(\3)\3)\3)\3)\5)\u01a0\n)\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u01a9\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\5+\u01be\n+\3+\3+\3+\5+\u01c3\n+\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\5,\u01cf\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\2"+
		"\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`\2\n\3\2\22\23\3\2\'(\3\2AF\4\2\25\33\35\36\5\2\'(\64"+
		"\65??\3\2\37 \3\2!$\3\2%&\u01ee\2c\3\2\2\2\4y\3\2\2\2\6\u0080\3\2\2\2"+
		"\b\u0082\3\2\2\2\n\u0089\3\2\2\2\f\u0093\3\2\2\2\16\u009b\3\2\2\2\20\u00a1"+
		"\3\2\2\2\22\u00aa\3\2\2\2\24\u00b3\3\2\2\2\26\u00c2\3\2\2\2\30\u00ca\3"+
		"\2\2\2\32\u00d9\3\2\2\2\34\u00db\3\2\2\2\36\u00e3\3\2\2\2 \u00e8\3\2\2"+
		"\2\"\u00ed\3\2\2\2$\u00f5\3\2\2\2&\u00f8\3\2\2\2(\u0100\3\2\2\2*\u0108"+
		"\3\2\2\2,\u010f\3\2\2\2.\u011d\3\2\2\2\60\u011f\3\2\2\2\62\u012f\3\2\2"+
		"\2\64\u014c\3\2\2\2\66\u014e\3\2\2\28\u0155\3\2\2\2:\u0157\3\2\2\2<\u015f"+
		"\3\2\2\2>\u0164\3\2\2\2@\u0169\3\2\2\2B\u016e\3\2\2\2D\u0173\3\2\2\2F"+
		"\u0178\3\2\2\2H\u017e\3\2\2\2J\u0184\3\2\2\2L\u018f\3\2\2\2N\u0191\3\2"+
		"\2\2P\u019f\3\2\2\2R\u01a1\3\2\2\2T\u01c2\3\2\2\2V\u01ce\3\2\2\2X\u01d0"+
		"\3\2\2\2Z\u01d2\3\2\2\2\\\u01d4\3\2\2\2^\u01d6\3\2\2\2`\u01d8\3\2\2\2"+
		"bd\7\22\2\2cb\3\2\2\2cd\3\2\2\2dh\3\2\2\2eg\7\23\2\2fe\3\2\2\2gj\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\4\2\2lm\7@\2\2mt\7)\2\2"+
		"ns\5\4\3\2os\5\2\2\2ps\5\32\16\2qs\5\b\5\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2"+
		"\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7*\2"+
		"\2x\3\3\2\2\2yz\5\n\6\2z{\7@\2\2{|\5\26\f\2|}\5N(\2}\5\3\2\2\2~\u0081"+
		"\5X-\2\177\u0081\7\24\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\7\3\2"+
		"\2\2\u0082\u0083\5\n\6\2\u0083\u0084\5\f\7\2\u0084\u0085\7/\2\2\u0085"+
		"\t\3\2\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008c\u0090\5\30\r\2\u008d\u008f\5\20\t\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\13"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0098\5\16\b\2\u0094\u0095\7\61\2\2"+
		"\u0095\u0097\5\16\b\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\r\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"\u009f\7@\2\2\u009c\u009d\5\6\4\2\u009d\u009e\58\35\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a5"+
		"\7-\2\2\u00a2\u00a4\7\61\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\7.\2\2\u00a9\21\3\2\2\2\u00aa\u00ae\7-\2\2\u00ab\u00ad"+
		"\5(\25\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7."+
		"\2\2\u00b2\23\3\2\2\2\u00b3\u00b7\7+\2\2\u00b4\u00b6\5(\25\2\u00b5\u00b4"+
		"\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7,\2\2\u00bb\25\3\2\2\2"+
		"\u00bc\u00bd\7+\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7,\2\2\u00bf\u00c3"+
		"\3\2\2\2\u00c0\u00c1\7+\2\2\u00c1\u00c3\7,\2\2\u00c2\u00bc\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\27\3\2\2\2\u00c4\u00c6\7\21\2\2\u00c5\u00c4\3\2\2"+
		"\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00cb\7\20\2\2\u00c8"+
		"\u00cb\5\32\16\2\u00c9\u00cb\7@\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\31\3\2\2\2\u00cc\u00cd\7\5\2\2\u00cd"+
		"\u00ce\7)\2\2\u00ce\u00cf\5\34\17\2\u00cf\u00d0\7*\2\2\u00d0\u00da\3\2"+
		"\2\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\7@\2\2\u00d3\u00d4\7)\2\2\u00d4\u00d5"+
		"\5\34\17\2\u00d5\u00d6\7*\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d8\7\5\2\2"+
		"\u00d8\u00da\7@\2\2\u00d9\u00cc\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\33\3\2\2\2\u00db\u00e0\5\36\20\2\u00dc\u00dd\7\61\2\2\u00dd"+
		"\u00df\5\36\20\2\u00de\u00dc\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3"+
		"\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e6\7@\2\2\u00e4\u00e5\7\24\2\2\u00e5\u00e7\5:\36\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00eb\5\"\22\2\u00e9\u00ea"+
		"\7\61\2\2\u00ea\u00ec\7\63\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec!\3\2\2\2\u00ed\u00f2\5$\23\2\u00ee\u00ef\7\61\2\2\u00ef\u00f1\5"+
		"$\23\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3#\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\5\n\6\2"+
		"\u00f6\u00f7\5\16\b\2\u00f7%\3\2\2\2\u00f8\u00fd\7@\2\2\u00f9\u00fa\7"+
		"\61\2\2\u00fa\u00fc\7@\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u00fd\3\2\2\2"+
		"\u0100\u0105\58\35\2\u0101\u0102\7\61\2\2\u0102\u0104\58\35\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		")\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5,\27\2\u0109\u010a\7\64\2\2"+
		"\u010a\u010e\5*\26\2\u010b\u010c\7\65\2\2\u010c\u010e\5*\26\2\u010d\u0109"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e+\3\2\2\2\u010f"+
		"\u0116\5.\30\2\u0110\u0111\7\66\2\2\u0111\u0117\5.\30\2\u0112\u0113\7"+
		"\67\2\2\u0113\u0117\5.\30\2\u0114\u0115\7>\2\2\u0115\u0117\5.\30\2\u0116"+
		"\u0110\3\2\2\2\u0116\u0112\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117-\3\2\2\2\u0118\u011e\5\60\31\2\u0119\u011e\5\62\32\2\u011a"+
		"\u011b\5Z.\2\u011b\u011c\5.\30\2\u011c\u011e\3\2\2\2\u011d\u0118\3\2\2"+
		"\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011e/\3\2\2\2\u011f\u0120"+
		"\7\3\2\2\u0120\u012d\5\30\r\2\u0121\u0123\5\22\n\2\u0122\u0121\3\2\2\2"+
		"\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012e"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0129\5\24\13\2\u0128\u0127\3\2\2\2"+
		"\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0124\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"\61\3\2\2\2\u012f\u013e\5\64\33\2\u0130\u0132\t\3\2\2\u0131\u0130\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u013f\3\2\2\2\u0133\u0135\7+\2\2\u0134"+
		"\u0136\5(\25\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\7,\2\2\u0138\u0133\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u013b\7\62\2\2\u013b\u013d\5\62\32\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0131\3\2\2\2\u013e"+
		"\u0138\3\2\2\2\u013f\63\3\2\2\2\u0140\u0144\7@\2\2\u0141\u0143\5\22\n"+
		"\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u014d\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014d\5\66\34\2"+
		"\u0148\u0149\7+\2\2\u0149\u014a\58\35\2\u014a\u014b\7,\2\2\u014b\u014d"+
		"\3\2\2\2\u014c\u0140\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014d"+
		"\65\3\2\2\2\u014e\u014f\t\4\2\2\u014f\67\3\2\2\2\u0150\u0151\5.\30\2\u0151"+
		"\u0152\5\6\4\2\u0152\u0153\58\35\2\u0153\u0156\3\2\2\2\u0154\u0156\5:"+
		"\36\2\u0155\u0150\3\2\2\2\u0155\u0154\3\2\2\2\u01569\3\2\2\2\u0157\u015d"+
		"\5<\37\2\u0158\u0159\7=\2\2\u0159\u015a\58\35\2\u015a\u015b\7\60\2\2\u015b"+
		"\u015c\5:\36\2\u015c\u015e\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e;\3\2\2\2\u015f\u0162\5> \2\u0160\u0161\7<\2\2\u0161\u0163\5"+
		"<\37\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163=\3\2\2\2\u0164\u0167"+
		"\5@!\2\u0165\u0166\7;\2\2\u0166\u0168\5> \2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168?\3\2\2\2\u0169\u016c\5B\"\2\u016a\u016b\79\2\2\u016b"+
		"\u016d\5@!\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016dA\3\2\2\2\u016e"+
		"\u0171\5D#\2\u016f\u0170\7:\2\2\u0170\u0172\5B\"\2\u0171\u016f\3\2\2\2"+
		"\u0171\u0172\3\2\2\2\u0172C\3\2\2\2\u0173\u0176\5F$\2\u0174\u0175\78\2"+
		"\2\u0175\u0177\5D#\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177E\3"+
		"\2\2\2\u0178\u017c\5H%\2\u0179\u017a\5\\/\2\u017a\u017b\5F$\2\u017b\u017d"+
		"\3\2\2\2\u017c\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017dG\3\2\2\2\u017e"+
		"\u0182\5J&\2\u017f\u0180\5^\60\2\u0180\u0181\5H%\2\u0181\u0183\3\2\2\2"+
		"\u0182\u017f\3\2\2\2\u0182\u0183\3\2\2\2\u0183I\3\2\2\2\u0184\u0188\5"+
		"*\26\2\u0185\u0186\5`\61\2\u0186\u0187\5J&\2\u0187\u0189\3\2\2\2\u0188"+
		"\u0185\3\2\2\2\u0188\u0189\3\2\2\2\u0189K\3\2\2\2\u018a\u0190\5N(\2\u018b"+
		"\u0190\5P)\2\u018c\u0190\5R*\2\u018d\u0190\5T+\2\u018e\u0190\5V,\2\u018f"+
		"\u018a\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d\3\2"+
		"\2\2\u018f\u018e\3\2\2\2\u0190M\3\2\2\2\u0191\u0196\7)\2\2\u0192\u0195"+
		"\5\b\5\2\u0193\u0195\5L\'\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2"+
		"\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7*\2\2\u019aO\3\2\2\2\u019b\u01a0"+
		"\7/\2\2\u019c\u019d\58\35\2\u019d\u019e\7/\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u019b\3\2\2\2\u019f\u019c\3\2\2\2\u01a0Q\3\2\2\2\u01a1\u01a2\7\b\2\2"+
		"\u01a2\u01a3\7+\2\2\u01a3\u01a4\58\35\2\u01a4\u01a5\7,\2\2\u01a5\u01a8"+
		"\5L\'\2\u01a6\u01a7\7\t\2\2\u01a7\u01a9\5L\'\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9S\3\2\2\2\u01aa\u01ab\7\13\2\2\u01ab\u01ac\7+\2\2"+
		"\u01ac\u01ad\58\35\2\u01ad\u01ae\7,\2\2\u01ae\u01af\5L\'\2\u01af\u01c3"+
		"\3\2\2\2\u01b0\u01b1\7\f\2\2\u01b1\u01b2\5L\'\2\u01b2\u01b3\7\13\2\2\u01b3"+
		"\u01b4\7+\2\2\u01b4\u01b5\58\35\2\u01b5\u01b6\7,\2\2\u01b6\u01b7\7/\2"+
		"\2\u01b7\u01c3\3\2\2\2\u01b8\u01b9\7\n\2\2\u01b9\u01ba\7+\2\2\u01ba\u01bb"+
		"\5P)\2\u01bb\u01bd\5P)\2\u01bc\u01be\58\35\2\u01bd\u01bc\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\7,\2\2\u01c0\u01c1\5L\'"+
		"\2\u01c1\u01c3\3\2\2\2\u01c2\u01aa\3\2\2\2\u01c2\u01b0\3\2\2\2\u01c2\u01b8"+
		"\3\2\2\2\u01c3U\3\2\2\2\u01c4\u01c5\7\r\2\2\u01c5\u01cf\7/\2\2\u01c6\u01c7"+
		"\7\16\2\2\u01c7\u01cf\7/\2\2\u01c8\u01c9\7\17\2\2\u01c9\u01cf\7/\2\2\u01ca"+
		"\u01cb\7\17\2\2\u01cb\u01cc\58\35\2\u01cc\u01cd\7/\2\2\u01cd\u01cf\3\2"+
		"\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c6\3\2\2\2\u01ce\u01c8\3\2\2\2\u01ce"+
		"\u01ca\3\2\2\2\u01cfW\3\2\2\2\u01d0\u01d1\t\5\2\2\u01d1Y\3\2\2\2\u01d2"+
		"\u01d3\t\6\2\2\u01d3[\3\2\2\2\u01d4\u01d5\t\7\2\2\u01d5]\3\2\2\2\u01d6"+
		"\u01d7\t\b\2\2\u01d7_\3\2\2\2\u01d8\u01d9\t\t\2\2\u01d9a\3\2\2\2\67ch"+
		"rt\u0080\u0089\u0090\u0098\u009f\u00a5\u00ae\u00b7\u00c2\u00c5\u00ca\u00d9"+
		"\u00e0\u00e6\u00eb\u00f2\u00fd\u0105\u010d\u0116\u011d\u0124\u012a\u012d"+
		"\u0131\u0135\u0138\u013c\u013e\u0144\u014c\u0155\u015d\u0162\u0167\u016c"+
		"\u0171\u0176\u017c\u0182\u0188\u018f\u0194\u0196\u019f\u01a8\u01bd\u01c2"+
		"\u01ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}