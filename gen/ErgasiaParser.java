// Generated from C:/Users/Konstantinos/IdeaProjects/ErgasiaSxediashGlosonProgrammatismou/src\Ergasia.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ErgasiaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, FUNCTION=2, SUBROUTINE=3, END=4, COMMON=5, INTEGER=6, REAL=7, COMPLEX=8, 
		LOGICAL=9, CHARACTER=10, STRING=11, LIST=12, DATA=13, CONTINUE=14, GOTO=15, 
		CALL=16, READ=17, WRITE=18, LENGTH=19, NEW=20, IF=21, THEN=22, ELSE=23, 
		ENDIF=24, DO=25, ENDDO=26, STOP=27, RETURN=28, ID=29, ICONST=30, RCONST=31, 
		CCONST=32, SCONST=33, AUTAKI=34, DOUBLE_AUTAKI=35, LCONST=36, OROP=37, 
		ANDOP=38, NOTOP=39, RELOP=40, ADDOP=41, MULOP=42, DIVOP=43, POWEROP=44, 
		LISTFUNC=45, LPAREN=46, RPAREN=47, COMMA=48, ASSIGN=49, COLON=50, LBRACK=51, 
		RBRACK=52, AADM0=53, LINE_COMMENT=54, WS=55;
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_declarations = 2, RULE_type = 3, 
		RULE_vars = 4, RULE_undef_variable = 5, RULE_listspec = 6, RULE_dims = 7, 
		RULE_dim = 8, RULE_cblock_list = 9, RULE_cblock = 10, RULE_id_list = 11, 
		RULE_vals = 12, RULE_value_list = 13, RULE_values = 14, RULE_value = 15, 
		RULE_repeat = 16, RULE_sign = 17, RULE_constant = 18, RULE_simple_constant = 19, 
		RULE_complex_constant = 20, RULE_statements = 21, RULE_labeled_statement = 22, 
		RULE_label = 23, RULE_statement = 24, RULE_simple_statement = 25, RULE_assignment = 26, 
		RULE_variable = 27, RULE_expressions = 28, RULE_expression = 29, RULE_listexpression = 30, 
		RULE_goto_statement = 31, RULE_labels = 32, RULE_if_statement = 33, RULE_subroutine_call = 34, 
		RULE_io_statement = 35, RULE_read_list = 36, RULE_read_item = 37, RULE_iter_space = 38, 
		RULE_step = 39, RULE_write_list = 40, RULE_write_item = 41, RULE_compound_statement = 42, 
		RULE_branch_statement = 43, RULE_tail = 44, RULE_loop_statement = 45, 
		RULE_subprograms = 46, RULE_subprogram = 47, RULE_header = 48, RULE_formal_parameters = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "body", "declarations", "type", "vars", "undef_variable", 
			"listspec", "dims", "dim", "cblock_list", "cblock", "id_list", "vals", 
			"value_list", "values", "value", "repeat", "sign", "constant", "simple_constant", 
			"complex_constant", "statements", "labeled_statement", "label", "statement", 
			"simple_statement", "assignment", "variable", "expressions", "expression", 
			"listexpression", "goto_statement", "labels", "if_statement", "subroutine_call", 
			"io_statement", "read_list", "read_item", "iter_space", "step", "write_list", 
			"write_item", "compound_statement", "branch_statement", "tail", "loop_statement", 
			"subprograms", "subprogram", "header", "formal_parameters"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'''", "'\"'", 
			null, null, null, null, null, null, "'*'", "'/'", "'**'", null, "'('", 
			"')'", "','", "'='", "':'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "FUNCTION", "SUBROUTINE", "END", "COMMON", "INTEGER", "REAL", 
			"COMPLEX", "LOGICAL", "CHARACTER", "STRING", "LIST", "DATA", "CONTINUE", 
			"GOTO", "CALL", "READ", "WRITE", "LENGTH", "NEW", "IF", "THEN", "ELSE", 
			"ENDIF", "DO", "ENDDO", "STOP", "RETURN", "ID", "ICONST", "RCONST", "CCONST", 
			"SCONST", "AUTAKI", "DOUBLE_AUTAKI", "LCONST", "OROP", "ANDOP", "NOTOP", 
			"RELOP", "ADDOP", "MULOP", "DIVOP", "POWEROP", "LISTFUNC", "LPAREN", 
			"RPAREN", "COMMA", "ASSIGN", "COLON", "LBRACK", "RBRACK", "AADM0", "LINE_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Ergasia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ErgasiaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ErgasiaParser.END, 0); }
		public SubprogramsContext subprograms() {
			return getRuleContext(SubprogramsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			body();
			setState(101);
			match(END);
			setState(102);
			subprograms(0);
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

	public static class BodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			declarations(0);
			setState(105);
			statements(0);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode COMMON() { return getToken(ErgasiaParser.COMMON, 0); }
		public Cblock_listContext cblock_list() {
			return getRuleContext(Cblock_listContext.class,0);
		}
		public TerminalNode DATA() { return getToken(ErgasiaParser.DATA, 0); }
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		return declarations(0);
	}

	private DeclarationsContext declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, _parentState);
		DeclarationsContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new DeclarationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declarations);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						type();
						setState(110);
						vars(0);
						}
						break;
					case 2:
						{
						_localctx = new DeclarationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declarations);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(113);
						match(COMMON);
						setState(114);
						cblock_list(0);
						}
						break;
					case 3:
						{
						_localctx = new DeclarationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declarations);
						setState(115);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(116);
						match(DATA);
						setState(117);
						vals(0);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ErgasiaParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(ErgasiaParser.REAL, 0); }
		public TerminalNode COMPLEX() { return getToken(ErgasiaParser.COMPLEX, 0); }
		public TerminalNode LOGICAL() { return getToken(ErgasiaParser.LOGICAL, 0); }
		public TerminalNode CHARACTER() { return getToken(ErgasiaParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(ErgasiaParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << REAL) | (1L << COMPLEX) | (1L << LOGICAL) | (1L << CHARACTER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VarsContext extends ParserRuleContext {
		public Undef_variableContext undef_variable() {
			return getRuleContext(Undef_variableContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		return vars(0);
	}

	private VarsContext vars(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarsContext _localctx = new VarsContext(_ctx, _parentState);
		VarsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_vars, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(126);
			undef_variable();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_vars);
					setState(128);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(129);
					match(COMMA);
					setState(130);
					undef_variable();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Undef_variableContext extends ParserRuleContext {
		public ListspecContext listspec() {
			return getRuleContext(ListspecContext.class,0);
		}
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public Undef_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undef_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterUndef_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitUndef_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitUndef_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Undef_variableContext undef_variable() throws RecognitionException {
		Undef_variableContext _localctx = new Undef_variableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_undef_variable);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				listspec();
				setState(137);
				match(ID);
				setState(138);
				match(LPAREN);
				setState(139);
				dims(0);
				setState(140);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				listspec();
				setState(143);
				match(ID);
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

	public static class ListspecContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(ErgasiaParser.LIST, 0); }
		public ListspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterListspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitListspec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitListspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListspecContext listspec() throws RecognitionException {
		ListspecContext _localctx = new ListspecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listspec);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(LIST);
				}
				break;
			case FUNCTION:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DimsContext extends ParserRuleContext {
		public DimContext dim() {
			return getRuleContext(DimContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		return dims(0);
	}

	private DimsContext dims(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DimsContext _localctx = new DimsContext(_ctx, _parentState);
		DimsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_dims, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(152);
			dim();
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dims);
					setState(154);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(155);
					match(COMMA);
					setState(156);
					dim();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DimContext extends ParserRuleContext {
		public TerminalNode ICONST() { return getToken(ErgasiaParser.ICONST, 0); }
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public DimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterDim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitDim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimContext dim() throws RecognitionException {
		DimContext _localctx = new DimContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==ICONST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Cblock_listContext extends ParserRuleContext {
		public CblockContext cblock() {
			return getRuleContext(CblockContext.class,0);
		}
		public Cblock_listContext cblock_list() {
			return getRuleContext(Cblock_listContext.class,0);
		}
		public Cblock_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cblock_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterCblock_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitCblock_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitCblock_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cblock_listContext cblock_list() throws RecognitionException {
		return cblock_list(0);
	}

	private Cblock_listContext cblock_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Cblock_listContext _localctx = new Cblock_listContext(_ctx, _parentState);
		Cblock_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cblock_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			cblock();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Cblock_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_cblock_list);
					setState(167);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(168);
					cblock();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CblockContext extends ParserRuleContext {
		public List<TerminalNode> DIVOP() { return getTokens(ErgasiaParser.DIVOP); }
		public TerminalNode DIVOP(int i) {
			return getToken(ErgasiaParser.DIVOP, i);
		}
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public CblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterCblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitCblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitCblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CblockContext cblock() throws RecognitionException {
		CblockContext _localctx = new CblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DIVOP);
			setState(175);
			match(ID);
			setState(176);
			match(DIVOP);
			setState(177);
			id_list(0);
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		return id_list(0);
	}

	private Id_listContext id_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_listContext _localctx = new Id_listContext(_ctx, _parentState);
		Id_listContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_id_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_list);
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					match(COMMA);
					setState(184);
					match(ID);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public ValsContext vals() {
			return getRuleContext(ValsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public ValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterVals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitVals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValsContext vals() throws RecognitionException {
		return vals(0);
	}

	private ValsContext vals(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValsContext _localctx = new ValsContext(_ctx, _parentState);
		ValsContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_vals, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			match(ID);
			setState(192);
			value_list();
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_vals);
					setState(194);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(195);
					match(COMMA);
					setState(196);
					match(ID);
					setState(197);
					value_list();
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public List<TerminalNode> DIVOP() { return getTokens(ErgasiaParser.DIVOP); }
		public TerminalNode DIVOP(int i) {
			return getToken(ErgasiaParser.DIVOP, i);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(DIVOP);
			setState(204);
			values(0);
			setState(205);
			match(DIVOP);
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

	public static class ValuesContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		return values(0);
	}

	private ValuesContext values(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValuesContext _localctx = new ValuesContext(_ctx, _parentState);
		ValuesContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValuesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_values);
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211);
					match(COMMA);
					setState(212);
					value();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(ErgasiaParser.ADDOP, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				repeat();
				setState(219);
				sign();
				setState(220);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(ADDOP);
				setState(223);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				constant();
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode ICONST() { return getToken(ErgasiaParser.ICONST, 0); }
		public TerminalNode MULOP() { return getToken(ErgasiaParser.MULOP, 0); }
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_repeat);
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(ICONST);
				setState(228);
				match(MULOP);
				}
				break;
			case MULOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(MULOP);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADDOP() { return getToken(ErgasiaParser.ADDOP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sign);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(ADDOP);
				}
				break;
			case ICONST:
			case RCONST:
			case CCONST:
			case SCONST:
			case LCONST:
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
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
		public Simple_constantContext simple_constant() {
			return getRuleContext(Simple_constantContext.class,0);
		}
		public Complex_constantContext complex_constant() {
			return getRuleContext(Complex_constantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constant);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
			case RCONST:
			case CCONST:
			case SCONST:
			case LCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				simple_constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				complex_constant();
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

	public static class Simple_constantContext extends ParserRuleContext {
		public TerminalNode ICONST() { return getToken(ErgasiaParser.ICONST, 0); }
		public TerminalNode RCONST() { return getToken(ErgasiaParser.RCONST, 0); }
		public TerminalNode LCONST() { return getToken(ErgasiaParser.LCONST, 0); }
		public TerminalNode CCONST() { return getToken(ErgasiaParser.CCONST, 0); }
		public TerminalNode SCONST() { return getToken(ErgasiaParser.SCONST, 0); }
		public Simple_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterSimple_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitSimple_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitSimple_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_constantContext simple_constant() throws RecognitionException {
		Simple_constantContext _localctx = new Simple_constantContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simple_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ICONST) | (1L << RCONST) | (1L << CCONST) | (1L << SCONST) | (1L << LCONST))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Complex_constantContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public List<TerminalNode> RCONST() { return getTokens(ErgasiaParser.RCONST); }
		public TerminalNode RCONST(int i) {
			return getToken(ErgasiaParser.RCONST, i);
		}
		public TerminalNode COLON() { return getToken(ErgasiaParser.COLON, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public Complex_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterComplex_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitComplex_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitComplex_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Complex_constantContext complex_constant() throws RecognitionException {
		Complex_constantContext _localctx = new Complex_constantContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_complex_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LPAREN);
			setState(243);
			match(RCONST);
			setState(244);
			match(COLON);
			setState(245);
			sign();
			setState(246);
			match(RCONST);
			setState(247);
			match(RPAREN);
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

	public static class StatementsContext extends ParserRuleContext {
		public Labeled_statementContext labeled_statement() {
			return getRuleContext(Labeled_statementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			labeled_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(252);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(253);
					labeled_statement();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Labeled_statementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Labeled_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeled_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterLabeled_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitLabeled_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitLabeled_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Labeled_statementContext labeled_statement() throws RecognitionException {
		Labeled_statementContext _localctx = new Labeled_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_labeled_statement);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				label();
				setState(260);
				statement();
				}
				break;
			case CONTINUE:
			case GOTO:
			case CALL:
			case READ:
			case WRITE:
			case IF:
			case DO:
			case STOP:
			case RETURN:
			case ID:
			case LISTFUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				statement();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ICONST() { return getToken(ErgasiaParser.ICONST, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ICONST);
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
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				simple_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				compound_statement();
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

	public static class Simple_statementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Goto_statementContext goto_statement() {
			return getRuleContext(Goto_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Subroutine_callContext subroutine_call() {
			return getRuleContext(Subroutine_callContext.class,0);
		}
		public Io_statementContext io_statement() {
			return getRuleContext(Io_statementContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(ErgasiaParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(ErgasiaParser.RETURN, 0); }
		public TerminalNode STOP() { return getToken(ErgasiaParser.STOP, 0); }
		public Simple_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterSimple_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitSimple_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitSimple_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_statementContext simple_statement() throws RecognitionException {
		Simple_statementContext _localctx = new Simple_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_simple_statement);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case LISTFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				assignment();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				goto_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				if_statement();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				subroutine_call();
				}
				break;
			case READ:
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				io_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				match(RETURN);
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				match(STOP);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ErgasiaParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			variable();
			setState(282);
			match(ASSIGN);
			setState(283);
			expression(0);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public TerminalNode LISTFUNC() { return getToken(ErgasiaParser.LISTFUNC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variable);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(ID);
				setState(286);
				match(LPAREN);
				setState(287);
				expressions(0);
				setState(288);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(LISTFUNC);
				setState(291);
				match(LPAREN);
				setState(292);
				expression(0);
				setState(293);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(ID);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(299);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressions);
					setState(301);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(302);
					match(COMMA);
					setState(303);
					expression(0);
					}
					} 
				}
				setState(308);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NOTOP() { return getToken(ErgasiaParser.NOTOP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDOP() { return getToken(ErgasiaParser.ADDOP, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Simple_constantContext simple_constant() {
			return getRuleContext(Simple_constantContext.class,0);
		}
		public TerminalNode LENGTH() { return getToken(ErgasiaParser.LENGTH, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public TerminalNode NEW() { return getToken(ErgasiaParser.NEW, 0); }
		public TerminalNode COLON() { return getToken(ErgasiaParser.COLON, 0); }
		public ListexpressionContext listexpression() {
			return getRuleContext(ListexpressionContext.class,0);
		}
		public TerminalNode OROP() { return getToken(ErgasiaParser.OROP, 0); }
		public TerminalNode ANDOP() { return getToken(ErgasiaParser.ANDOP, 0); }
		public TerminalNode RELOP() { return getToken(ErgasiaParser.RELOP, 0); }
		public TerminalNode POWEROP() { return getToken(ErgasiaParser.POWEROP, 0); }
		public TerminalNode MULOP() { return getToken(ErgasiaParser.MULOP, 0); }
		public TerminalNode DIVOP() { return getToken(ErgasiaParser.DIVOP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(310);
				match(NOTOP);
				setState(311);
				expression(9);
				}
				break;
			case 2:
				{
				setState(312);
				match(ADDOP);
				setState(313);
				expression(8);
				}
				break;
			case 3:
				{
				setState(314);
				variable();
				}
				break;
			case 4:
				{
				setState(315);
				simple_constant();
				}
				break;
			case 5:
				{
				setState(316);
				match(LENGTH);
				setState(317);
				match(LPAREN);
				setState(318);
				expression(0);
				setState(319);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(321);
				match(NEW);
				setState(322);
				match(LPAREN);
				setState(323);
				expression(0);
				setState(324);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(326);
				match(LPAREN);
				setState(327);
				expression(0);
				setState(328);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(330);
				match(LPAREN);
				setState(331);
				expression(0);
				setState(332);
				match(COLON);
				setState(333);
				expression(0);
				setState(334);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(336);
				listexpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(340);
						match(OROP);
						setState(341);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(342);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(343);
						match(ANDOP);
						setState(344);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(346);
						match(RELOP);
						setState(347);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(348);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(349);
						match(POWEROP);
						setState(350);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(351);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(352);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULOP || _la==DIVOP) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(353);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(354);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(355);
						((ExpressionContext)_localctx).op = match(ADDOP);
						setState(356);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListexpressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ErgasiaParser.LBRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ErgasiaParser.RBRACK, 0); }
		public ListexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterListexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitListexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitListexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListexpressionContext listexpression() throws RecognitionException {
		ListexpressionContext _localctx = new ListexpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listexpression);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(LBRACK);
				setState(363);
				expressions(0);
				setState(364);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(LBRACK);
				setState(367);
				match(RBRACK);
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

	public static class Goto_statementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(ErgasiaParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public Goto_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterGoto_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitGoto_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitGoto_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Goto_statementContext goto_statement() throws RecognitionException {
		Goto_statementContext _localctx = new Goto_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_goto_statement);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(GOTO);
				setState(371);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(GOTO);
				setState(373);
				match(ID);
				setState(374);
				match(COMMA);
				setState(375);
				match(LPAREN);
				setState(376);
				labels(0);
				setState(377);
				match(RPAREN);
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

	public static class LabelsContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LabelsContext labels() {
			return getRuleContext(LabelsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelsContext labels() throws RecognitionException {
		return labels(0);
	}

	private LabelsContext labels(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LabelsContext _localctx = new LabelsContext(_ctx, _parentState);
		LabelsContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_labels, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			label();
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LabelsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_labels);
					setState(384);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(385);
					match(COMMA);
					setState(386);
					label();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ErgasiaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ErgasiaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ErgasiaParser.COMMA, i);
		}
		public Simple_statementContext simple_statement() {
			return getRuleContext(Simple_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_if_statement);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(IF);
				setState(393);
				match(LPAREN);
				setState(394);
				expression(0);
				setState(395);
				match(RPAREN);
				setState(396);
				label();
				setState(397);
				match(COMMA);
				setState(398);
				label();
				setState(399);
				match(COMMA);
				setState(400);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(IF);
				setState(403);
				match(LPAREN);
				setState(404);
				expression(0);
				setState(405);
				match(RPAREN);
				setState(406);
				simple_statement();
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

	public static class Subroutine_callContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(ErgasiaParser.CALL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Subroutine_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutine_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterSubroutine_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitSubroutine_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitSubroutine_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subroutine_callContext subroutine_call() throws RecognitionException {
		Subroutine_callContext _localctx = new Subroutine_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subroutine_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(CALL);
			setState(411);
			variable();
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

	public static class Io_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(ErgasiaParser.READ, 0); }
		public Read_listContext read_list() {
			return getRuleContext(Read_listContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(ErgasiaParser.WRITE, 0); }
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public Io_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterIo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitIo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitIo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Io_statementContext io_statement() throws RecognitionException {
		Io_statementContext _localctx = new Io_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_io_statement);
		try {
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(READ);
				setState(414);
				read_list(0);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(WRITE);
				setState(416);
				write_list(0);
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

	public static class Read_listContext extends ParserRuleContext {
		public Read_itemContext read_item() {
			return getRuleContext(Read_itemContext.class,0);
		}
		public Read_listContext read_list() {
			return getRuleContext(Read_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public Read_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterRead_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitRead_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitRead_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_listContext read_list() throws RecognitionException {
		return read_list(0);
	}

	private Read_listContext read_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Read_listContext _localctx = new Read_listContext(_ctx, _parentState);
		Read_listContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_read_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			read_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Read_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_read_list);
					setState(422);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(423);
					match(COMMA);
					setState(424);
					read_item();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Read_itemContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public Read_listContext read_list() {
			return getRuleContext(Read_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ErgasiaParser.ASSIGN, 0); }
		public Iter_spaceContext iter_space() {
			return getRuleContext(Iter_spaceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public Read_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterRead_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitRead_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitRead_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_itemContext read_item() throws RecognitionException {
		Read_itemContext _localctx = new Read_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_read_item);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case LISTFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(LPAREN);
				setState(432);
				read_list(0);
				setState(433);
				match(COMMA);
				setState(434);
				match(ID);
				setState(435);
				match(ASSIGN);
				setState(436);
				iter_space();
				setState(437);
				match(RPAREN);
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

	public static class Iter_spaceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public StepContext step() {
			return getRuleContext(StepContext.class,0);
		}
		public Iter_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterIter_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitIter_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitIter_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iter_spaceContext iter_space() throws RecognitionException {
		Iter_spaceContext _localctx = new Iter_spaceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iter_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			expression(0);
			setState(442);
			match(COMMA);
			setState(443);
			expression(0);
			setState(444);
			step();
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

	public static class StepContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_step);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(COMMA);
				setState(447);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Write_listContext extends ParserRuleContext {
		public Write_itemContext write_item() {
			return getRuleContext(Write_itemContext.class,0);
		}
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public Write_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterWrite_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitWrite_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitWrite_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_listContext write_list() throws RecognitionException {
		return write_list(0);
	}

	private Write_listContext write_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Write_listContext _localctx = new Write_listContext(_ctx, _parentState);
		Write_listContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_write_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(452);
			write_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(459);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Write_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_write_list);
					setState(454);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(455);
					match(COMMA);
					setState(456);
					write_item();
					}
					} 
				}
				setState(461);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Write_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ErgasiaParser.ASSIGN, 0); }
		public Iter_spaceContext iter_space() {
			return getRuleContext(Iter_spaceContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public Write_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterWrite_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitWrite_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitWrite_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_itemContext write_item() throws RecognitionException {
		Write_itemContext _localctx = new Write_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_write_item);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(LPAREN);
				setState(464);
				write_list(0);
				setState(465);
				match(COMMA);
				setState(466);
				match(ID);
				setState(467);
				match(ASSIGN);
				setState(468);
				iter_space();
				setState(469);
				match(RPAREN);
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

	public static class Compound_statementContext extends ParserRuleContext {
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterCompound_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitCompound_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitCompound_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_compound_statement);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				branch_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				loop_statement();
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

	public static class Branch_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ErgasiaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(ErgasiaParser.THEN, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterBranch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitBranch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitBranch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_branch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(IF);
			setState(478);
			match(LPAREN);
			setState(479);
			expression(0);
			setState(480);
			match(RPAREN);
			setState(481);
			match(THEN);
			setState(482);
			body();
			setState(483);
			tail();
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

	public static class TailContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(ErgasiaParser.ELSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(ErgasiaParser.ENDIF, 0); }
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tail);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(ELSE);
				setState(486);
				body();
				setState(487);
				match(ENDIF);
				}
				break;
			case ENDIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(ENDIF);
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

	public static class Loop_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(ErgasiaParser.DO, 0); }
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ErgasiaParser.ASSIGN, 0); }
		public Iter_spaceContext iter_space() {
			return getRuleContext(Iter_spaceContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode ENDDO() { return getToken(ErgasiaParser.ENDDO, 0); }
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterLoop_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitLoop_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitLoop_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_loop_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(DO);
			setState(493);
			match(ID);
			setState(494);
			match(ASSIGN);
			setState(495);
			iter_space();
			setState(496);
			body();
			setState(497);
			match(ENDDO);
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

	public static class SubprogramsContext extends ParserRuleContext {
		public SubprogramsContext subprograms() {
			return getRuleContext(SubprogramsContext.class,0);
		}
		public SubprogramContext subprogram() {
			return getRuleContext(SubprogramContext.class,0);
		}
		public SubprogramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprograms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterSubprograms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitSubprograms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitSubprograms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramsContext subprograms() throws RecognitionException {
		return subprograms(0);
	}

	private SubprogramsContext subprograms(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubprogramsContext _localctx = new SubprogramsContext(_ctx, _parentState);
		SubprogramsContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_subprograms, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubprogramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subprograms);
					setState(500);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(501);
					subprogram();
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SubprogramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ErgasiaParser.END, 0); }
		public SubprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterSubprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitSubprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitSubprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramContext subprogram() throws RecognitionException {
		SubprogramContext _localctx = new SubprogramContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_subprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			header();
			setState(508);
			body();
			setState(509);
			match(END);
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

	public static class HeaderContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ListspecContext listspec() {
			return getRuleContext(ListspecContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(ErgasiaParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(ErgasiaParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ErgasiaParser.LPAREN, 0); }
		public Formal_parametersContext formal_parameters() {
			return getRuleContext(Formal_parametersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ErgasiaParser.RPAREN, 0); }
		public TerminalNode SUBROUTINE() { return getToken(ErgasiaParser.SUBROUTINE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_header);
		try {
			setState(527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				type();
				setState(512);
				listspec();
				setState(513);
				match(FUNCTION);
				setState(514);
				match(ID);
				setState(515);
				match(LPAREN);
				setState(516);
				formal_parameters();
				setState(517);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(SUBROUTINE);
				setState(520);
				match(ID);
				setState(521);
				match(LPAREN);
				setState(522);
				formal_parameters();
				setState(523);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(SUBROUTINE);
				setState(526);
				match(ID);
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

	public static class Formal_parametersContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ErgasiaParser.COMMA, 0); }
		public Formal_parametersContext formal_parameters() {
			return getRuleContext(Formal_parametersContext.class,0);
		}
		public Formal_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).enterFormal_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ErgasiaListener ) ((ErgasiaListener)listener).exitFormal_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ErgasiaVisitor ) return ((ErgasiaVisitor<? extends T>)visitor).visitFormal_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parametersContext formal_parameters() throws RecognitionException {
		Formal_parametersContext _localctx = new Formal_parametersContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_formal_parameters);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				type();
				setState(530);
				vars(0);
				setState(531);
				match(COMMA);
				setState(532);
				formal_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				type();
				setState(535);
				vars(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return declarations_sempred((DeclarationsContext)_localctx, predIndex);
		case 4:
			return vars_sempred((VarsContext)_localctx, predIndex);
		case 7:
			return dims_sempred((DimsContext)_localctx, predIndex);
		case 9:
			return cblock_list_sempred((Cblock_listContext)_localctx, predIndex);
		case 11:
			return id_list_sempred((Id_listContext)_localctx, predIndex);
		case 12:
			return vals_sempred((ValsContext)_localctx, predIndex);
		case 14:
			return values_sempred((ValuesContext)_localctx, predIndex);
		case 21:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 28:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		case 29:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 32:
			return labels_sempred((LabelsContext)_localctx, predIndex);
		case 36:
			return read_list_sempred((Read_listContext)_localctx, predIndex);
		case 40:
			return write_list_sempred((Write_listContext)_localctx, predIndex);
		case 46:
			return subprograms_sempred((SubprogramsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean declarations_sempred(DeclarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean vars_sempred(VarsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dims_sempred(DimsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cblock_list_sempred(Cblock_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean id_list_sempred(Id_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean vals_sempred(ValsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean values_sempred(ValuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 15);
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean labels_sempred(LabelsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean read_list_sempred(Read_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean write_list_sempred(Write_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subprograms_sempred(SubprogramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u021e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4y"+
		"\n\4\f\4\16\4|\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6\f\6"+
		"\16\6\u0089\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0094\n\7\3\b"+
		"\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a0\n\t\f\t\16\t\u00a3"+
		"\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00ac\n\13\f\13\16\13\u00af"+
		"\13\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r\16"+
		"\r\u00bf\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c9\n\16"+
		"\f\16\16\16\u00cc\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\7\20\u00d8\n\20\f\20\16\20\u00db\13\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00e4\n\21\3\22\3\22\3\22\5\22\u00e9\n\22\3\23\3\23\5\23"+
		"\u00ed\n\23\3\24\3\24\5\24\u00f1\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0101\n\27\f\27\16\27\u0104"+
		"\13\27\3\30\3\30\3\30\3\30\5\30\u010a\n\30\3\31\3\31\3\32\3\32\5\32\u0110"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011a\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u012b\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0133\n\36\f\36\16\36\u0136"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0154\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0168\n\37\f\37\16\37\u016b"+
		"\13\37\3 \3 \3 \3 \3 \3 \5 \u0173\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u017e"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0186\n\"\f\"\16\"\u0189\13\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u019b\n#\3$\3$\3$\3%\3%\3"+
		"%\3%\5%\u01a4\n%\3&\3&\3&\3&\3&\3&\7&\u01ac\n&\f&\16&\u01af\13&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01ba\n\'\3(\3(\3(\3(\3(\3)\3)\3)\5"+
		")\u01c4\n)\3*\3*\3*\3*\3*\3*\7*\u01cc\n*\f*\16*\u01cf\13*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u01da\n+\3,\3,\5,\u01de\n,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\5.\u01ed\n.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u01f9"+
		"\n\60\f\60\16\60\u01fc\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0212"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u021c\n\63\3\63\2\20"+
		"\6\n\20\24\30\32\36,:<BJR^\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\6\3\2\b\r\3\2\37 \4\2 "+
		"#&&\3\2,-\2\u0226\2f\3\2\2\2\4j\3\2\2\2\6m\3\2\2\2\b}\3\2\2\2\n\177\3"+
		"\2\2\2\f\u0093\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2\2\2\22\u00a4\3\2"+
		"\2\2\24\u00a6\3\2\2\2\26\u00b0\3\2\2\2\30\u00b5\3\2\2\2\32\u00c0\3\2\2"+
		"\2\34\u00cd\3\2\2\2\36\u00d1\3\2\2\2 \u00e3\3\2\2\2\"\u00e8\3\2\2\2$\u00ec"+
		"\3\2\2\2&\u00f0\3\2\2\2(\u00f2\3\2\2\2*\u00f4\3\2\2\2,\u00fb\3\2\2\2."+
		"\u0109\3\2\2\2\60\u010b\3\2\2\2\62\u010f\3\2\2\2\64\u0119\3\2\2\2\66\u011b"+
		"\3\2\2\28\u012a\3\2\2\2:\u012c\3\2\2\2<\u0153\3\2\2\2>\u0172\3\2\2\2@"+
		"\u017d\3\2\2\2B\u017f\3\2\2\2D\u019a\3\2\2\2F\u019c\3\2\2\2H\u01a3\3\2"+
		"\2\2J\u01a5\3\2\2\2L\u01b9\3\2\2\2N\u01bb\3\2\2\2P\u01c3\3\2\2\2R\u01c5"+
		"\3\2\2\2T\u01d9\3\2\2\2V\u01dd\3\2\2\2X\u01df\3\2\2\2Z\u01ec\3\2\2\2\\"+
		"\u01ee\3\2\2\2^\u01f5\3\2\2\2`\u01fd\3\2\2\2b\u0211\3\2\2\2d\u021b\3\2"+
		"\2\2fg\5\4\3\2gh\7\6\2\2hi\5^\60\2i\3\3\2\2\2jk\5\6\4\2kl\5,\27\2l\5\3"+
		"\2\2\2mz\b\4\1\2no\f\6\2\2op\5\b\5\2pq\5\n\6\2qy\3\2\2\2rs\f\5\2\2st\7"+
		"\7\2\2ty\5\24\13\2uv\f\4\2\2vw\7\17\2\2wy\5\32\16\2xn\3\2\2\2xr\3\2\2"+
		"\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\7\3\2\2\2|z\3\2\2\2}~\t\2"+
		"\2\2~\t\3\2\2\2\177\u0080\b\6\1\2\u0080\u0081\5\f\7\2\u0081\u0087\3\2"+
		"\2\2\u0082\u0083\f\4\2\2\u0083\u0084\7\62\2\2\u0084\u0086\5\f\7\2\u0085"+
		"\u0082\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\13\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\5\16\b\2\u008b\u008c"+
		"\7\37\2\2\u008c\u008d\7\60\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\61\2"+
		"\2\u008f\u0094\3\2\2\2\u0090\u0091\5\16\b\2\u0091\u0092\7\37\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008a\3\2\2\2\u0093\u0090\3\2\2\2\u0094\r\3\2\2\2"+
		"\u0095\u0098\7\16\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\17\3\2\2\2\u0099\u009a\b\t\1\2\u009a\u009b\5\22\n\2\u009b"+
		"\u00a1\3\2\2\2\u009c\u009d\f\4\2\2\u009d\u009e\7\62\2\2\u009e\u00a0\5"+
		"\22\n\2\u009f\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\t\3\2"+
		"\2\u00a5\23\3\2\2\2\u00a6\u00a7\b\13\1\2\u00a7\u00a8\5\26\f\2\u00a8\u00ad"+
		"\3\2\2\2\u00a9\u00aa\f\4\2\2\u00aa\u00ac\5\26\f\2\u00ab\u00a9\3\2\2\2"+
		"\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\25"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2\7\37\2\2\u00b2"+
		"\u00b3\7-\2\2\u00b3\u00b4\5\30\r\2\u00b4\27\3\2\2\2\u00b5\u00b6\b\r\1"+
		"\2\u00b6\u00b7\7\37\2\2\u00b7\u00bd\3\2\2\2\u00b8\u00b9\f\4\2\2\u00b9"+
		"\u00ba\7\62\2\2\u00ba\u00bc\7\37\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\b\16\1\2\u00c1\u00c2\7\37\2\2\u00c2\u00c3\5"+
		"\34\17\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\f\4\2\2\u00c5\u00c6\7\62\2\2"+
		"\u00c6\u00c7\7\37\2\2\u00c7\u00c9\5\34\17\2\u00c8\u00c4\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\33\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7-\2\2\u00ce\u00cf\5\36\20\2\u00cf"+
		"\u00d0\7-\2\2\u00d0\35\3\2\2\2\u00d1\u00d2\b\20\1\2\u00d2\u00d3\5 \21"+
		"\2\u00d3\u00d9\3\2\2\2\u00d4\u00d5\f\4\2\2\u00d5\u00d6\7\62\2\2\u00d6"+
		"\u00d8\5 \21\2\u00d7\u00d4\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\37\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd"+
		"\5\"\22\2\u00dd\u00de\5$\23\2\u00de\u00df\5&\24\2\u00df\u00e4\3\2\2\2"+
		"\u00e0\u00e1\7+\2\2\u00e1\u00e4\5&\24\2\u00e2\u00e4\5&\24\2\u00e3\u00dc"+
		"\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4!\3\2\2\2\u00e5"+
		"\u00e6\7 \2\2\u00e6\u00e9\7,\2\2\u00e7\u00e9\7,\2\2\u00e8\u00e5\3\2\2"+
		"\2\u00e8\u00e7\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00ed\7+\2\2\u00eb\u00ed\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed%\3\2\2\2\u00ee\u00f1"+
		"\5(\25\2\u00ef\u00f1\5*\26\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\'\3\2\2\2\u00f2\u00f3\t\4\2\2\u00f3)\3\2\2\2\u00f4\u00f5\7\60\2\2\u00f5"+
		"\u00f6\7!\2\2\u00f6\u00f7\7\64\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7!"+
		"\2\2\u00f9\u00fa\7\61\2\2\u00fa+\3\2\2\2\u00fb\u00fc\b\27\1\2\u00fc\u00fd"+
		"\5.\30\2\u00fd\u0102\3\2\2\2\u00fe\u00ff\f\4\2\2\u00ff\u0101\5.\30\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2"+
		"\2\2\u0103-\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5\60\31\2\u0106\u0107"+
		"\5\62\32\2\u0107\u010a\3\2\2\2\u0108\u010a\5\62\32\2\u0109\u0105\3\2\2"+
		"\2\u0109\u0108\3\2\2\2\u010a/\3\2\2\2\u010b\u010c\7 \2\2\u010c\61\3\2"+
		"\2\2\u010d\u0110\5\64\33\2\u010e\u0110\5V,\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\63\3\2\2\2\u0111\u011a\5\66\34\2\u0112\u011a\5@!"+
		"\2\u0113\u011a\5D#\2\u0114\u011a\5F$\2\u0115\u011a\5H%\2\u0116\u011a\7"+
		"\20\2\2\u0117\u011a\7\36\2\2\u0118\u011a\7\35\2\2\u0119\u0111\3\2\2\2"+
		"\u0119\u0112\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115"+
		"\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\65\3\2\2\2\u011b\u011c\58\35\2\u011c\u011d\7\63\2\2\u011d\u011e\5<\37"+
		"\2\u011e\67\3\2\2\2\u011f\u0120\7\37\2\2\u0120\u0121\7\60\2\2\u0121\u0122"+
		"\5:\36\2\u0122\u0123\7\61\2\2\u0123\u012b\3\2\2\2\u0124\u0125\7/\2\2\u0125"+
		"\u0126\7\60\2\2\u0126\u0127\5<\37\2\u0127\u0128\7\61\2\2\u0128\u012b\3"+
		"\2\2\2\u0129\u012b\7\37\2\2\u012a\u011f\3\2\2\2\u012a\u0124\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012b9\3\2\2\2\u012c\u012d\b\36\1\2\u012d\u012e\5<\37\2"+
		"\u012e\u0134\3\2\2\2\u012f\u0130\f\4\2\2\u0130\u0131\7\62\2\2\u0131\u0133"+
		"\5<\37\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135;\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\b\37\1\2"+
		"\u0138\u0139\7)\2\2\u0139\u0154\5<\37\13\u013a\u013b\7+\2\2\u013b\u0154"+
		"\5<\37\n\u013c\u0154\58\35\2\u013d\u0154\5(\25\2\u013e\u013f\7\25\2\2"+
		"\u013f\u0140\7\60\2\2\u0140\u0141\5<\37\2\u0141\u0142\7\61\2\2\u0142\u0154"+
		"\3\2\2\2\u0143\u0144\7\26\2\2\u0144\u0145\7\60\2\2\u0145\u0146\5<\37\2"+
		"\u0146\u0147\7\61\2\2\u0147\u0154\3\2\2\2\u0148\u0149\7\60\2\2\u0149\u014a"+
		"\5<\37\2\u014a\u014b\7\61\2\2\u014b\u0154\3\2\2\2\u014c\u014d\7\60\2\2"+
		"\u014d\u014e\5<\37\2\u014e\u014f\7\64\2\2\u014f\u0150\5<\37\2\u0150\u0151"+
		"\7\61\2\2\u0151\u0154\3\2\2\2\u0152\u0154\5> \2\u0153\u0137\3\2\2\2\u0153"+
		"\u013a\3\2\2\2\u0153\u013c\3\2\2\2\u0153\u013d\3\2\2\2\u0153\u013e\3\2"+
		"\2\2\u0153\u0143\3\2\2\2\u0153\u0148\3\2\2\2\u0153\u014c\3\2\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0169\3\2\2\2\u0155\u0156\f\21\2\2\u0156\u0157\7"+
		"\'\2\2\u0157\u0168\5<\37\22\u0158\u0159\f\20\2\2\u0159\u015a\7(\2\2\u015a"+
		"\u0168\5<\37\21\u015b\u015c\f\17\2\2\u015c\u015d\7*\2\2\u015d\u0168\5"+
		"<\37\20\u015e\u015f\f\16\2\2\u015f\u0160\7.\2\2\u0160\u0168\5<\37\16\u0161"+
		"\u0162\f\r\2\2\u0162\u0163\t\5\2\2\u0163\u0168\5<\37\16\u0164\u0165\f"+
		"\f\2\2\u0165\u0166\7+\2\2\u0166\u0168\5<\37\r\u0167\u0155\3\2\2\2\u0167"+
		"\u0158\3\2\2\2\u0167\u015b\3\2\2\2\u0167\u015e\3\2\2\2\u0167\u0161\3\2"+
		"\2\2\u0167\u0164\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a=\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7\65\2\2"+
		"\u016d\u016e\5:\36\2\u016e\u016f\7\66\2\2\u016f\u0173\3\2\2\2\u0170\u0171"+
		"\7\65\2\2\u0171\u0173\7\66\2\2\u0172\u016c\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0173?\3\2\2\2\u0174\u0175\7\21\2\2\u0175\u017e\5\60\31\2\u0176\u0177"+
		"\7\21\2\2\u0177\u0178\7\37\2\2\u0178\u0179\7\62\2\2\u0179\u017a\7\60\2"+
		"\2\u017a\u017b\5B\"\2\u017b\u017c\7\61\2\2\u017c\u017e\3\2\2\2\u017d\u0174"+
		"\3\2\2\2\u017d\u0176\3\2\2\2\u017eA\3\2\2\2\u017f\u0180\b\"\1\2\u0180"+
		"\u0181\5\60\31\2\u0181\u0187\3\2\2\2\u0182\u0183\f\4\2\2\u0183\u0184\7"+
		"\62\2\2\u0184\u0186\5\60\31\2\u0185\u0182\3\2\2\2\u0186\u0189\3\2\2\2"+
		"\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188C\3\2\2\2\u0189\u0187\3"+
		"\2\2\2\u018a\u018b\7\27\2\2\u018b\u018c\7\60\2\2\u018c\u018d\5<\37\2\u018d"+
		"\u018e\7\61\2\2\u018e\u018f\5\60\31\2\u018f\u0190\7\62\2\2\u0190\u0191"+
		"\5\60\31\2\u0191\u0192\7\62\2\2\u0192\u0193\5\60\31\2\u0193\u019b\3\2"+
		"\2\2\u0194\u0195\7\27\2\2\u0195\u0196\7\60\2\2\u0196\u0197\5<\37\2\u0197"+
		"\u0198\7\61\2\2\u0198\u0199\5\64\33\2\u0199\u019b\3\2\2\2\u019a\u018a"+
		"\3\2\2\2\u019a\u0194\3\2\2\2\u019bE\3\2\2\2\u019c\u019d\7\22\2\2\u019d"+
		"\u019e\58\35\2\u019eG\3\2\2\2\u019f\u01a0\7\23\2\2\u01a0\u01a4\5J&\2\u01a1"+
		"\u01a2\7\24\2\2\u01a2\u01a4\5R*\2\u01a3\u019f\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4I\3\2\2\2\u01a5\u01a6\b&\1\2\u01a6\u01a7\5L\'\2\u01a7\u01ad"+
		"\3\2\2\2\u01a8\u01a9\f\4\2\2\u01a9\u01aa\7\62\2\2\u01aa\u01ac\5L\'\2\u01ab"+
		"\u01a8\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01aeK\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01ba\58\35\2\u01b1\u01b2"+
		"\7\60\2\2\u01b2\u01b3\5J&\2\u01b3\u01b4\7\62\2\2\u01b4\u01b5\7\37\2\2"+
		"\u01b5\u01b6\7\63\2\2\u01b6\u01b7\5N(\2\u01b7\u01b8\7\61\2\2\u01b8\u01ba"+
		"\3\2\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b1\3\2\2\2\u01baM\3\2\2\2\u01bb"+
		"\u01bc\5<\37\2\u01bc\u01bd\7\62\2\2\u01bd\u01be\5<\37\2\u01be\u01bf\5"+
		"P)\2\u01bfO\3\2\2\2\u01c0\u01c1\7\62\2\2\u01c1\u01c4\5<\37\2\u01c2\u01c4"+
		"\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4Q\3\2\2\2\u01c5"+
		"\u01c6\b*\1\2\u01c6\u01c7\5T+\2\u01c7\u01cd\3\2\2\2\u01c8\u01c9\f\4\2"+
		"\2\u01c9\u01ca\7\62\2\2\u01ca\u01cc\5T+\2\u01cb\u01c8\3\2\2\2\u01cc\u01cf"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ceS\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01da\5<\37\2\u01d1\u01d2\7\60\2\2\u01d2\u01d3\5"+
		"R*\2\u01d3\u01d4\7\62\2\2\u01d4\u01d5\7\37\2\2\u01d5\u01d6\7\63\2\2\u01d6"+
		"\u01d7\5N(\2\u01d7\u01d8\7\61\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d0\3\2"+
		"\2\2\u01d9\u01d1\3\2\2\2\u01daU\3\2\2\2\u01db\u01de\5X-\2\u01dc\u01de"+
		"\5\\/\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01deW\3\2\2\2\u01df\u01e0"+
		"\7\27\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e2\5<\37\2\u01e2\u01e3\7\61\2"+
		"\2\u01e3\u01e4\7\30\2\2\u01e4\u01e5\5\4\3\2\u01e5\u01e6\5Z.\2\u01e6Y\3"+
		"\2\2\2\u01e7\u01e8\7\31\2\2\u01e8\u01e9\5\4\3\2\u01e9\u01ea\7\32\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01ed\7\32\2\2\u01ec\u01e7\3\2\2\2\u01ec\u01eb\3"+
		"\2\2\2\u01ed[\3\2\2\2\u01ee\u01ef\7\33\2\2\u01ef\u01f0\7\37\2\2\u01f0"+
		"\u01f1\7\63\2\2\u01f1\u01f2\5N(\2\u01f2\u01f3\5\4\3\2\u01f3\u01f4\7\34"+
		"\2\2\u01f4]\3\2\2\2\u01f5\u01fa\b\60\1\2\u01f6\u01f7\f\4\2\2\u01f7\u01f9"+
		"\5`\61\2\u01f8\u01f6\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb_\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\5b\62\2"+
		"\u01fe\u01ff\5\4\3\2\u01ff\u0200\7\6\2\2\u0200a\3\2\2\2\u0201\u0202\5"+
		"\b\5\2\u0202\u0203\5\16\b\2\u0203\u0204\7\4\2\2\u0204\u0205\7\37\2\2\u0205"+
		"\u0206\7\60\2\2\u0206\u0207\5d\63\2\u0207\u0208\7\61\2\2\u0208\u0212\3"+
		"\2\2\2\u0209\u020a\7\5\2\2\u020a\u020b\7\37\2\2\u020b\u020c\7\60\2\2\u020c"+
		"\u020d\5d\63\2\u020d\u020e\7\61\2\2\u020e\u0212\3\2\2\2\u020f\u0210\7"+
		"\5\2\2\u0210\u0212\7\37\2\2\u0211\u0201\3\2\2\2\u0211\u0209\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212c\3\2\2\2\u0213\u0214\5\b\5\2\u0214\u0215\5\n\6\2"+
		"\u0215\u0216\7\62\2\2\u0216\u0217\5d\63\2\u0217\u021c\3\2\2\2\u0218\u0219"+
		"\5\b\5\2\u0219\u021a\5\n\6\2\u021a\u021c\3\2\2\2\u021b\u0213\3\2\2\2\u021b"+
		"\u0218\3\2\2\2\u021ce\3\2\2\2(xz\u0087\u0093\u0097\u00a1\u00ad\u00bd\u00ca"+
		"\u00d9\u00e3\u00e8\u00ec\u00f0\u0102\u0109\u010f\u0119\u012a\u0134\u0153"+
		"\u0167\u0169\u0172\u017d\u0187\u019a\u01a3\u01ad\u01b9\u01c3\u01cd\u01d9"+
		"\u01dd\u01ec\u01fa\u0211\u021b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}