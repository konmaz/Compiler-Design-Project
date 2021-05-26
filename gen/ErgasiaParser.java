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
		ENDIF=24, DO=25, ENDDO=26, STOP=27, RETURN=28, ID=29, RCONST=30, ICONST=31, 
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
			"ENDIF", "DO", "ENDDO", "STOP", "RETURN", "ID", "RCONST", "ICONST", "CCONST", 
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
			setState(103);
			declarations(0);
			setState(104);
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
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new DeclarationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declarations);
						setState(107);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(108);
						type();
						setState(109);
						vars(0);
						}
						break;
					case 2:
						{
						_localctx = new DeclarationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declarations);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						match(COMMON);
						setState(113);
						cblock_list(0);
						}
						break;
					case 3:
						{
						_localctx = new DeclarationsContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_declarations);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(DATA);
						setState(116);
						vals(0);
						}
						break;
					}
					} 
				}
				setState(121);
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
			setState(122);
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
			setState(125);
			undef_variable();
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
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
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(COMMA);
					setState(129);
					undef_variable();
					}
					} 
				}
				setState(134);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				listspec();
				setState(136);
				match(ID);
				setState(137);
				match(LPAREN);
				setState(138);
				dims(0);
				setState(139);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				listspec();
				setState(142);
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
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
			setState(151);
			dim();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
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
					setState(153);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(154);
					match(COMMA);
					setState(155);
					dim();
					}
					} 
				}
				setState(160);
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
			setState(161);
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
			setState(164);
			cblock();
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
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
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167);
					cblock();
					}
					} 
				}
				setState(172);
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
			setState(173);
			match(DIVOP);
			setState(174);
			match(ID);
			setState(175);
			match(DIVOP);
			setState(176);
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
			setState(179);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
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
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					match(COMMA);
					setState(183);
					match(ID);
					}
					} 
				}
				setState(188);
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
			setState(190);
			match(ID);
			setState(191);
			value_list();
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
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
					setState(193);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(194);
					match(COMMA);
					setState(195);
					match(ID);
					setState(196);
					value_list();
					}
					} 
				}
				setState(201);
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
			setState(202);
			match(DIVOP);
			setState(203);
			values(0);
			setState(204);
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
			setState(207);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
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
					setState(209);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(210);
					match(COMMA);
					setState(211);
					value();
					}
					} 
				}
				setState(216);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				repeat();
				setState(218);
				sign();
				setState(219);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(ADDOP);
				setState(222);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ICONST);
				setState(227);
				match(MULOP);
				}
				break;
			case MULOP:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(ADDOP);
				}
				break;
			case RCONST:
			case ICONST:
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RCONST:
			case ICONST:
			case CCONST:
			case SCONST:
			case LCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				simple_constant();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
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
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RCONST) | (1L << ICONST) | (1L << CCONST) | (1L << SCONST) | (1L << LCONST))) != 0)) ) {
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
			setState(241);
			match(LPAREN);
			setState(242);
			match(RCONST);
			setState(243);
			match(COLON);
			setState(244);
			sign();
			setState(245);
			match(RCONST);
			setState(246);
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
			setState(249);
			labeled_statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
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
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					labeled_statement();
					}
					} 
				}
				setState(257);
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
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				label();
				setState(259);
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
				setState(261);
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
			setState(264);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				simple_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
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
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case LISTFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				assignment();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				goto_statement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				if_statement();
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(273);
				subroutine_call();
				}
				break;
			case READ:
			case WRITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				io_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(275);
				match(CONTINUE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(276);
				match(RETURN);
				}
				break;
			case STOP:
				enterOuterAlt(_localctx, 8);
				{
				setState(277);
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
			setState(280);
			variable();
			setState(281);
			match(ASSIGN);
			setState(282);
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
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(ID);
				setState(285);
				match(LPAREN);
				setState(286);
				expressions(0);
				setState(287);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(LISTFUNC);
				setState(290);
				match(LPAREN);
				setState(291);
				expression(0);
				setState(292);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
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
			setState(298);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
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
					setState(300);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(301);
					match(COMMA);
					setState(302);
					expression(0);
					}
					} 
				}
				setState(307);
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
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(309);
				match(NOTOP);
				setState(310);
				expression(9);
				}
				break;
			case 2:
				{
				setState(311);
				match(ADDOP);
				setState(312);
				expression(8);
				}
				break;
			case 3:
				{
				setState(313);
				variable();
				}
				break;
			case 4:
				{
				setState(314);
				simple_constant();
				}
				break;
			case 5:
				{
				setState(315);
				match(LENGTH);
				setState(316);
				match(LPAREN);
				setState(317);
				expression(0);
				setState(318);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(320);
				match(NEW);
				setState(321);
				match(LPAREN);
				setState(322);
				expression(0);
				setState(323);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(325);
				match(LPAREN);
				setState(326);
				expression(0);
				setState(327);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(329);
				match(LPAREN);
				setState(330);
				expression(0);
				setState(331);
				match(COLON);
				setState(332);
				expression(0);
				setState(333);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(335);
				listexpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(338);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(339);
						match(OROP);
						setState(340);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(341);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(342);
						match(ANDOP);
						setState(343);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(344);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(345);
						match(RELOP);
						setState(346);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(348);
						((ExpressionContext)_localctx).op = match(POWEROP);
						setState(349);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(350);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(351);
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
						setState(352);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(354);
						((ExpressionContext)_localctx).op = match(ADDOP);
						setState(355);
						expression(11);
						}
						break;
					}
					} 
				}
				setState(360);
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
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(LBRACK);
				setState(362);
				expressions(0);
				setState(363);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(LBRACK);
				setState(366);
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
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(GOTO);
				setState(370);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(GOTO);
				setState(372);
				match(ID);
				setState(373);
				match(COMMA);
				setState(374);
				match(LPAREN);
				setState(375);
				labels(0);
				setState(376);
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
			setState(381);
			label();
			}
			_ctx.stop = _input.LT(-1);
			setState(388);
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
					setState(383);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(384);
					match(COMMA);
					setState(385);
					label();
					}
					} 
				}
				setState(390);
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
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(IF);
				setState(392);
				match(LPAREN);
				setState(393);
				expression(0);
				setState(394);
				match(RPAREN);
				setState(395);
				label();
				setState(396);
				match(COMMA);
				setState(397);
				label();
				setState(398);
				match(COMMA);
				setState(399);
				label();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(IF);
				setState(402);
				match(LPAREN);
				setState(403);
				expression(0);
				setState(404);
				match(RPAREN);
				setState(405);
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
			setState(409);
			match(CALL);
			setState(410);
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
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(READ);
				setState(413);
				read_list(0);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				match(WRITE);
				setState(415);
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
			setState(419);
			read_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(426);
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
					setState(421);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(422);
					match(COMMA);
					setState(423);
					read_item();
					}
					} 
				}
				setState(428);
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
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case LISTFUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				variable();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(LPAREN);
				setState(431);
				read_list(0);
				setState(432);
				match(COMMA);
				setState(433);
				match(ID);
				setState(434);
				match(ASSIGN);
				setState(435);
				iter_space();
				setState(436);
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
			setState(440);
			expression(0);
			setState(441);
			match(COMMA);
			setState(442);
			expression(0);
			setState(443);
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
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(COMMA);
				setState(446);
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
			setState(451);
			write_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
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
					setState(453);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(454);
					match(COMMA);
					setState(455);
					write_item();
					}
					} 
				}
				setState(460);
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
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				match(LPAREN);
				setState(463);
				write_list(0);
				setState(464);
				match(COMMA);
				setState(465);
				match(ID);
				setState(466);
				match(ASSIGN);
				setState(467);
				iter_space();
				setState(468);
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
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				branch_statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
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
			setState(476);
			match(IF);
			setState(477);
			match(LPAREN);
			setState(478);
			expression(0);
			setState(479);
			match(RPAREN);
			setState(480);
			match(THEN);
			setState(481);
			body();
			setState(482);
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
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(ELSE);
				setState(485);
				body();
				setState(486);
				match(ENDIF);
				}
				break;
			case ENDIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
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
			setState(491);
			match(DO);
			setState(492);
			match(ID);
			setState(493);
			match(ASSIGN);
			setState(494);
			iter_space();
			setState(495);
			body();
			setState(496);
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
			setState(503);
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
					setState(499);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(500);
					subprogram();
					}
					} 
				}
				setState(505);
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
			setState(506);
			header();
			setState(507);
			body();
			setState(508);
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
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				type();
				setState(511);
				listspec();
				setState(512);
				match(FUNCTION);
				setState(513);
				match(ID);
				setState(514);
				match(LPAREN);
				setState(515);
				formal_parameters();
				setState(516);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				match(SUBROUTINE);
				setState(519);
				match(ID);
				setState(520);
				match(LPAREN);
				setState(521);
				formal_parameters();
				setState(522);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(524);
				match(SUBROUTINE);
				setState(525);
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
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				type();
				setState(529);
				vars(0);
				setState(530);
				match(COMMA);
				setState(531);
				formal_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				type();
				setState(534);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u021d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4x\n\4"+
		"\f\4\16\4{\13\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0085\n\6\f\6\16\6"+
		"\u0088\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\b\3\b"+
		"\5\b\u0097\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009f\n\t\f\t\16\t\u00a2\13"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00ab\n\13\f\13\16\13\u00ae\13"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bb\n\r\f\r\16\r"+
		"\u00be\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c8\n\16\f"+
		"\16\16\16\u00cb\13\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00d7\n\20\f\20\16\20\u00da\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00e3\n\21\3\22\3\22\3\22\5\22\u00e8\n\22\3\23\3\23\5\23\u00ec"+
		"\n\23\3\24\3\24\5\24\u00f0\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u0100\n\27\f\27\16\27\u0103\13\27"+
		"\3\30\3\30\3\30\3\30\5\30\u0109\n\30\3\31\3\31\3\32\3\32\5\32\u010f\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0119\n\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u012a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0132\n\36\f\36\16\36\u0135"+
		"\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0153\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0167\n\37\f\37\16\37\u016a"+
		"\13\37\3 \3 \3 \3 \3 \3 \5 \u0172\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u017d"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0185\n\"\f\"\16\"\u0188\13\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u019a\n#\3$\3$\3$\3%\3%\3"+
		"%\3%\5%\u01a3\n%\3&\3&\3&\3&\3&\3&\7&\u01ab\n&\f&\16&\u01ae\13&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01b9\n\'\3(\3(\3(\3(\3(\3)\3)\3)\5"+
		")\u01c3\n)\3*\3*\3*\3*\3*\3*\7*\u01cb\n*\f*\16*\u01ce\13*\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u01d9\n+\3,\3,\5,\u01dd\n,\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\5.\u01ec\n.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\7\60\u01f8"+
		"\n\60\f\60\16\60\u01fb\13\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0211"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u021b\n\63\3\63\2\20"+
		"\6\n\20\24\30\32\36,:<BJR^\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\6\3\2\b\r\4\2\37\37!!\4"+
		"\2 #&&\3\2,-\2\u0225\2f\3\2\2\2\4i\3\2\2\2\6l\3\2\2\2\b|\3\2\2\2\n~\3"+
		"\2\2\2\f\u0092\3\2\2\2\16\u0096\3\2\2\2\20\u0098\3\2\2\2\22\u00a3\3\2"+
		"\2\2\24\u00a5\3\2\2\2\26\u00af\3\2\2\2\30\u00b4\3\2\2\2\32\u00bf\3\2\2"+
		"\2\34\u00cc\3\2\2\2\36\u00d0\3\2\2\2 \u00e2\3\2\2\2\"\u00e7\3\2\2\2$\u00eb"+
		"\3\2\2\2&\u00ef\3\2\2\2(\u00f1\3\2\2\2*\u00f3\3\2\2\2,\u00fa\3\2\2\2."+
		"\u0108\3\2\2\2\60\u010a\3\2\2\2\62\u010e\3\2\2\2\64\u0118\3\2\2\2\66\u011a"+
		"\3\2\2\28\u0129\3\2\2\2:\u012b\3\2\2\2<\u0152\3\2\2\2>\u0171\3\2\2\2@"+
		"\u017c\3\2\2\2B\u017e\3\2\2\2D\u0199\3\2\2\2F\u019b\3\2\2\2H\u01a2\3\2"+
		"\2\2J\u01a4\3\2\2\2L\u01b8\3\2\2\2N\u01ba\3\2\2\2P\u01c2\3\2\2\2R\u01c4"+
		"\3\2\2\2T\u01d8\3\2\2\2V\u01dc\3\2\2\2X\u01de\3\2\2\2Z\u01eb\3\2\2\2\\"+
		"\u01ed\3\2\2\2^\u01f4\3\2\2\2`\u01fc\3\2\2\2b\u0210\3\2\2\2d\u021a\3\2"+
		"\2\2fg\5\4\3\2gh\5^\60\2h\3\3\2\2\2ij\5\6\4\2jk\5,\27\2k\5\3\2\2\2ly\b"+
		"\4\1\2mn\f\6\2\2no\5\b\5\2op\5\n\6\2px\3\2\2\2qr\f\5\2\2rs\7\7\2\2sx\5"+
		"\24\13\2tu\f\4\2\2uv\7\17\2\2vx\5\32\16\2wm\3\2\2\2wq\3\2\2\2wt\3\2\2"+
		"\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\7\3\2\2\2{y\3\2\2\2|}\t\2\2\2}\t\3\2"+
		"\2\2~\177\b\6\1\2\177\u0080\5\f\7\2\u0080\u0086\3\2\2\2\u0081\u0082\f"+
		"\4\2\2\u0082\u0083\7\62\2\2\u0083\u0085\5\f\7\2\u0084\u0081\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\13\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008a\5\16\b\2\u008a\u008b\7\37\2\2\u008b"+
		"\u008c\7\60\2\2\u008c\u008d\5\20\t\2\u008d\u008e\7\61\2\2\u008e\u0093"+
		"\3\2\2\2\u008f\u0090\5\16\b\2\u0090\u0091\7\37\2\2\u0091\u0093\3\2\2\2"+
		"\u0092\u0089\3\2\2\2\u0092\u008f\3\2\2\2\u0093\r\3\2\2\2\u0094\u0097\7"+
		"\16\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\17\3\2\2\2\u0098\u0099\b\t\1\2\u0099\u009a\5\22\n\2\u009a\u00a0\3\2\2"+
		"\2\u009b\u009c\f\4\2\2\u009c\u009d\7\62\2\2\u009d\u009f\5\22\n\2\u009e"+
		"\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\21\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\t\3\2\2\u00a4\23"+
		"\3\2\2\2\u00a5\u00a6\b\13\1\2\u00a6\u00a7\5\26\f\2\u00a7\u00ac\3\2\2\2"+
		"\u00a8\u00a9\f\4\2\2\u00a9\u00ab\5\26\f\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\25\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7-\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2\7-"+
		"\2\2\u00b2\u00b3\5\30\r\2\u00b3\27\3\2\2\2\u00b4\u00b5\b\r\1\2\u00b5\u00b6"+
		"\7\37\2\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\62\2\2"+
		"\u00b9\u00bb\7\37\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\b\16\1\2\u00c0\u00c1\7\37\2\2\u00c1\u00c2\5\34\17\2\u00c2\u00c9"+
		"\3\2\2\2\u00c3\u00c4\f\4\2\2\u00c4\u00c5\7\62\2\2\u00c5\u00c6\7\37\2\2"+
		"\u00c6\u00c8\5\34\17\2\u00c7\u00c3\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7-\2\2\u00cd\u00ce\5\36\20\2\u00ce\u00cf\7-\2\2\u00cf\35\3\2\2"+
		"\2\u00d0\u00d1\b\20\1\2\u00d1\u00d2\5 \21\2\u00d2\u00d8\3\2\2\2\u00d3"+
		"\u00d4\f\4\2\2\u00d4\u00d5\7\62\2\2\u00d5\u00d7\5 \21\2\u00d6\u00d3\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\37\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\5\"\22\2\u00dc\u00dd\5$\23"+
		"\2\u00dd\u00de\5&\24\2\u00de\u00e3\3\2\2\2\u00df\u00e0\7+\2\2\u00e0\u00e3"+
		"\5&\24\2\u00e1\u00e3\5&\24\2\u00e2\u00db\3\2\2\2\u00e2\u00df\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e5\7!\2\2\u00e5\u00e8\7,\2\2\u00e6"+
		"\u00e8\7,\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8#\3\2\2\2\u00e9"+
		"\u00ec\7+\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2"+
		"\2\2\u00ec%\3\2\2\2\u00ed\u00f0\5(\25\2\u00ee\u00f0\5*\26\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2"+
		")\3\2\2\2\u00f3\u00f4\7\60\2\2\u00f4\u00f5\7 \2\2\u00f5\u00f6\7\64\2\2"+
		"\u00f6\u00f7\5$\23\2\u00f7\u00f8\7 \2\2\u00f8\u00f9\7\61\2\2\u00f9+\3"+
		"\2\2\2\u00fa\u00fb\b\27\1\2\u00fb\u00fc\5.\30\2\u00fc\u0101\3\2\2\2\u00fd"+
		"\u00fe\f\4\2\2\u00fe\u0100\5.\30\2\u00ff\u00fd\3\2\2\2\u0100\u0103\3\2"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102-\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0104\u0105\5\60\31\2\u0105\u0106\5\62\32\2\u0106\u0109\3\2\2"+
		"\2\u0107\u0109\5\62\32\2\u0108\u0104\3\2\2\2\u0108\u0107\3\2\2\2\u0109"+
		"/\3\2\2\2\u010a\u010b\7!\2\2\u010b\61\3\2\2\2\u010c\u010f\5\64\33\2\u010d"+
		"\u010f\5V,\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f\63\3\2\2\2"+
		"\u0110\u0119\5\66\34\2\u0111\u0119\5@!\2\u0112\u0119\5D#\2\u0113\u0119"+
		"\5F$\2\u0114\u0119\5H%\2\u0115\u0119\7\20\2\2\u0116\u0119\7\36\2\2\u0117"+
		"\u0119\7\35\2\2\u0118\u0110\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3"+
		"\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119\65\3\2\2\2\u011a\u011b\58\35"+
		"\2\u011b\u011c\7\63\2\2\u011c\u011d\5<\37\2\u011d\67\3\2\2\2\u011e\u011f"+
		"\7\37\2\2\u011f\u0120\7\60\2\2\u0120\u0121\5:\36\2\u0121\u0122\7\61\2"+
		"\2\u0122\u012a\3\2\2\2\u0123\u0124\7/\2\2\u0124\u0125\7\60\2\2\u0125\u0126"+
		"\5<\37\2\u0126\u0127\7\61\2\2\u0127\u012a\3\2\2\2\u0128\u012a\7\37\2\2"+
		"\u0129\u011e\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0128\3\2\2\2\u012a9\3"+
		"\2\2\2\u012b\u012c\b\36\1\2\u012c\u012d\5<\37\2\u012d\u0133\3\2\2\2\u012e"+
		"\u012f\f\4\2\2\u012f\u0130\7\62\2\2\u0130\u0132\5<\37\2\u0131\u012e\3"+
		"\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		";\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\b\37\1\2\u0137\u0138\7)\2\2"+
		"\u0138\u0153\5<\37\13\u0139\u013a\7+\2\2\u013a\u0153\5<\37\n\u013b\u0153"+
		"\58\35\2\u013c\u0153\5(\25\2\u013d\u013e\7\25\2\2\u013e\u013f\7\60\2\2"+
		"\u013f\u0140\5<\37\2\u0140\u0141\7\61\2\2\u0141\u0153\3\2\2\2\u0142\u0143"+
		"\7\26\2\2\u0143\u0144\7\60\2\2\u0144\u0145\5<\37\2\u0145\u0146\7\61\2"+
		"\2\u0146\u0153\3\2\2\2\u0147\u0148\7\60\2\2\u0148\u0149\5<\37\2\u0149"+
		"\u014a\7\61\2\2\u014a\u0153\3\2\2\2\u014b\u014c\7\60\2\2\u014c\u014d\5"+
		"<\37\2\u014d\u014e\7\64\2\2\u014e\u014f\5<\37\2\u014f\u0150\7\61\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u0153\5> \2\u0152\u0136\3\2\2\2\u0152\u0139\3\2\2"+
		"\2\u0152\u013b\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u013d\3\2\2\2\u0152\u0142"+
		"\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u014b\3\2\2\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0168\3\2\2\2\u0154\u0155\f\21\2\2\u0155\u0156\7\'\2\2\u0156\u0167\5"+
		"<\37\22\u0157\u0158\f\20\2\2\u0158\u0159\7(\2\2\u0159\u0167\5<\37\21\u015a"+
		"\u015b\f\17\2\2\u015b\u015c\7*\2\2\u015c\u0167\5<\37\20\u015d\u015e\f"+
		"\16\2\2\u015e\u015f\7.\2\2\u015f\u0167\5<\37\17\u0160\u0161\f\r\2\2\u0161"+
		"\u0162\t\5\2\2\u0162\u0167\5<\37\16\u0163\u0164\f\f\2\2\u0164\u0165\7"+
		"+\2\2\u0165\u0167\5<\37\r\u0166\u0154\3\2\2\2\u0166\u0157\3\2\2\2\u0166"+
		"\u015a\3\2\2\2\u0166\u015d\3\2\2\2\u0166\u0160\3\2\2\2\u0166\u0163\3\2"+
		"\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"=\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\7\65\2\2\u016c\u016d\5:\36\2"+
		"\u016d\u016e\7\66\2\2\u016e\u0172\3\2\2\2\u016f\u0170\7\65\2\2\u0170\u0172"+
		"\7\66\2\2\u0171\u016b\3\2\2\2\u0171\u016f\3\2\2\2\u0172?\3\2\2\2\u0173"+
		"\u0174\7\21\2\2\u0174\u017d\5\60\31\2\u0175\u0176\7\21\2\2\u0176\u0177"+
		"\7\37\2\2\u0177\u0178\7\62\2\2\u0178\u0179\7\60\2\2\u0179\u017a\5B\"\2"+
		"\u017a\u017b\7\61\2\2\u017b\u017d\3\2\2\2\u017c\u0173\3\2\2\2\u017c\u0175"+
		"\3\2\2\2\u017dA\3\2\2\2\u017e\u017f\b\"\1\2\u017f\u0180\5\60\31\2\u0180"+
		"\u0186\3\2\2\2\u0181\u0182\f\4\2\2\u0182\u0183\7\62\2\2\u0183\u0185\5"+
		"\60\31\2\u0184\u0181\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187C\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\27\2\2"+
		"\u018a\u018b\7\60\2\2\u018b\u018c\5<\37\2\u018c\u018d\7\61\2\2\u018d\u018e"+
		"\5\60\31\2\u018e\u018f\7\62\2\2\u018f\u0190\5\60\31\2\u0190\u0191\7\62"+
		"\2\2\u0191\u0192\5\60\31\2\u0192\u019a\3\2\2\2\u0193\u0194\7\27\2\2\u0194"+
		"\u0195\7\60\2\2\u0195\u0196\5<\37\2\u0196\u0197\7\61\2\2\u0197\u0198\5"+
		"\64\33\2\u0198\u019a\3\2\2\2\u0199\u0189\3\2\2\2\u0199\u0193\3\2\2\2\u019a"+
		"E\3\2\2\2\u019b\u019c\7\22\2\2\u019c\u019d\58\35\2\u019dG\3\2\2\2\u019e"+
		"\u019f\7\23\2\2\u019f\u01a3\5J&\2\u01a0\u01a1\7\24\2\2\u01a1\u01a3\5R"+
		"*\2\u01a2\u019e\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3I\3\2\2\2\u01a4\u01a5"+
		"\b&\1\2\u01a5\u01a6\5L\'\2\u01a6\u01ac\3\2\2\2\u01a7\u01a8\f\4\2\2\u01a8"+
		"\u01a9\7\62\2\2\u01a9\u01ab\5L\'\2\u01aa\u01a7\3\2\2\2\u01ab\u01ae\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01adK\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01af\u01b9\58\35\2\u01b0\u01b1\7\60\2\2\u01b1\u01b2\5J&\2\u01b2"+
		"\u01b3\7\62\2\2\u01b3\u01b4\7\37\2\2\u01b4\u01b5\7\63\2\2\u01b5\u01b6"+
		"\5N(\2\u01b6\u01b7\7\61\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01af\3\2\2\2\u01b8"+
		"\u01b0\3\2\2\2\u01b9M\3\2\2\2\u01ba\u01bb\5<\37\2\u01bb\u01bc\7\62\2\2"+
		"\u01bc\u01bd\5<\37\2\u01bd\u01be\5P)\2\u01beO\3\2\2\2\u01bf\u01c0\7\62"+
		"\2\2\u01c0\u01c3\5<\37\2\u01c1\u01c3\3\2\2\2\u01c2\u01bf\3\2\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c3Q\3\2\2\2\u01c4\u01c5\b*\1\2\u01c5\u01c6\5T+\2\u01c6"+
		"\u01cc\3\2\2\2\u01c7\u01c8\f\4\2\2\u01c8\u01c9\7\62\2\2\u01c9\u01cb\5"+
		"T+\2\u01ca\u01c7\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cdS\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d9\5<\37\2"+
		"\u01d0\u01d1\7\60\2\2\u01d1\u01d2\5R*\2\u01d2\u01d3\7\62\2\2\u01d3\u01d4"+
		"\7\37\2\2\u01d4\u01d5\7\63\2\2\u01d5\u01d6\5N(\2\u01d6\u01d7\7\61\2\2"+
		"\u01d7\u01d9\3\2\2\2\u01d8\u01cf\3\2\2\2\u01d8\u01d0\3\2\2\2\u01d9U\3"+
		"\2\2\2\u01da\u01dd\5X-\2\u01db\u01dd\5\\/\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01db\3\2\2\2\u01ddW\3\2\2\2\u01de\u01df\7\27\2\2\u01df\u01e0\7\60\2"+
		"\2\u01e0\u01e1\5<\37\2\u01e1\u01e2\7\61\2\2\u01e2\u01e3\7\30\2\2\u01e3"+
		"\u01e4\5\4\3\2\u01e4\u01e5\5Z.\2\u01e5Y\3\2\2\2\u01e6\u01e7\7\31\2\2\u01e7"+
		"\u01e8\5\4\3\2\u01e8\u01e9\7\32\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01ec\7"+
		"\32\2\2\u01eb\u01e6\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec[\3\2\2\2\u01ed\u01ee"+
		"\7\33\2\2\u01ee\u01ef\7\37\2\2\u01ef\u01f0\7\63\2\2\u01f0\u01f1\5N(\2"+
		"\u01f1\u01f2\5\4\3\2\u01f2\u01f3\7\34\2\2\u01f3]\3\2\2\2\u01f4\u01f9\b"+
		"\60\1\2\u01f5\u01f6\f\4\2\2\u01f6\u01f8\5`\61\2\u01f7\u01f5\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa_\3\2\2\2"+
		"\u01fb\u01f9\3\2\2\2\u01fc\u01fd\5b\62\2\u01fd\u01fe\5\4\3\2\u01fe\u01ff"+
		"\7\6\2\2\u01ffa\3\2\2\2\u0200\u0201\5\b\5\2\u0201\u0202\5\16\b\2\u0202"+
		"\u0203\7\4\2\2\u0203\u0204\7\37\2\2\u0204\u0205\7\60\2\2\u0205\u0206\5"+
		"d\63\2\u0206\u0207\7\61\2\2\u0207\u0211\3\2\2\2\u0208\u0209\7\5\2\2\u0209"+
		"\u020a\7\37\2\2\u020a\u020b\7\60\2\2\u020b\u020c\5d\63\2\u020c\u020d\7"+
		"\61\2\2\u020d\u0211\3\2\2\2\u020e\u020f\7\5\2\2\u020f\u0211\7\37\2\2\u0210"+
		"\u0200\3\2\2\2\u0210\u0208\3\2\2\2\u0210\u020e\3\2\2\2\u0211c\3\2\2\2"+
		"\u0212\u0213\5\b\5\2\u0213\u0214\5\n\6\2\u0214\u0215\7\62\2\2\u0215\u0216"+
		"\5d\63\2\u0216\u021b\3\2\2\2\u0217\u0218\5\b\5\2\u0218\u0219\5\n\6\2\u0219"+
		"\u021b\3\2\2\2\u021a\u0212\3\2\2\2\u021a\u0217\3\2\2\2\u021be\3\2\2\2"+
		"(wy\u0086\u0092\u0096\u00a0\u00ac\u00bc\u00c9\u00d8\u00e2\u00e7\u00eb"+
		"\u00ef\u0101\u0108\u010e\u0118\u0129\u0133\u0152\u0166\u0168\u0171\u017c"+
		"\u0186\u0199\u01a2\u01ac\u01b8\u01c2\u01cc\u01d8\u01dc\u01eb\u01f9\u0210"+
		"\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}