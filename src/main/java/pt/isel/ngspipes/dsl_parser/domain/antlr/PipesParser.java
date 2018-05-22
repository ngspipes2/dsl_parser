package pt.isel.ngspipes.dsl_parser.domain.antlr;// Generated from Pipes.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		ID=32, STRING=33, BOOLEAN=34, NUMBER=35, COMMENT=36, WS=37;
	public static final int
		RULE_root = 0, RULE_valueDeclaration = 1, RULE_parameterDeclaration = 2, 
		RULE_parameterName = 3, RULE_parameterValue = 4, RULE_variableDeclaration = 5, 
		RULE_variableName = 6, RULE_variableValue = 7, RULE_properties = 8, RULE_authorProperty = 9, 
		RULE_descriptionProperty = 10, RULE_versionProperty = 11, RULE_documentationProperty = 12, 
		RULE_repositories = 13, RULE_repository = 14, RULE_toolRepository = 15, 
		RULE_pipelineRepository = 16, RULE_repositoryId = 17, RULE_locationProperty = 18, 
		RULE_locationValue = 19, RULE_configProperty = 20, RULE_config = 21, RULE_configName = 22, 
		RULE_configValue = 23, RULE_outputs = 24, RULE_output = 25, RULE_outputId = 26, 
		RULE_outputValue = 27, RULE_outputName = 28, RULE_steps = 29, RULE_step = 30, 
		RULE_stepId = 31, RULE_execProperty = 32, RULE_commandReference = 33, 
		RULE_toolName = 34, RULE_commandName = 35, RULE_pipelineReference = 36, 
		RULE_pipelineName = 37, RULE_executionContextProperty = 38, RULE_inputsProperty = 39, 
		RULE_inputProperty = 40, RULE_inputName = 41, RULE_inputValue = 42, RULE_chain = 43, 
		RULE_spreadProperty = 44, RULE_spreadStrategyProperty = 45, RULE_strategyValue = 46, 
		RULE_combineStrategy = 47, RULE_oneToOneStrategy = 48, RULE_oneToManyStrategy = 49, 
		RULE_spreadInputsToSpreadProperty = 50, RULE_value = 51, RULE_indirectValue = 52, 
		RULE_directValue = 53, RULE_array = 54;
	public static final String[] ruleNames = {
		"root", "valueDeclaration", "parameterDeclaration", "parameterName", "parameterValue", 
		"variableDeclaration", "variableName", "variableValue", "properties", 
		"authorProperty", "descriptionProperty", "versionProperty", "documentationProperty", 
		"repositories", "repository", "toolRepository", "pipelineRepository", 
		"repositoryId", "locationProperty", "locationValue", "configProperty", 
		"config", "configName", "configValue", "outputs", "output", "outputId", 
		"outputValue", "outputName", "steps", "step", "stepId", "execProperty", 
		"commandReference", "toolName", "commandName", "pipelineReference", "pipelineName", 
		"executionContextProperty", "inputsProperty", "inputProperty", "inputName", 
		"inputValue", "chain", "spreadProperty", "spreadStrategyProperty", "strategyValue", 
		"combineStrategy", "oneToOneStrategy", "oneToManyStrategy", "spreadInputsToSpreadProperty", 
		"value", "indirectValue", "directValue", "array"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'params.'", "'Properties'", "':'", "'{'", "'}'", "'author'", 
		"'description'", "'version'", "'documentation'", "'['", "','", "']'", 
		"'Repositories'", "'ToolRepository'", "'PipelineRepository'", "'location'", 
		"'config'", "'Outputs'", "'Steps'", "'Step'", "'exec'", "'execution_context'", 
		"'inputs'", "'spread'", "'strategy'", "'one_to_one'", "'('", "')'", "'one_to_many'", 
		"'inputs_to_spread'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ID", "STRING", "BOOLEAN", 
		"NUMBER", "COMMENT", "WS"
	};
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
	public String getGrammarFileName() { return "Pipes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PipesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public RepositoriesContext repositories() {
			return getRuleContext(RepositoriesContext.class,0);
		}
		public StepsContext steps() {
			return getRuleContext(StepsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PipesParser.EOF, 0); }
		public List<ValueDeclarationContext> valueDeclaration() {
			return getRuleContexts(ValueDeclarationContext.class);
		}
		public ValueDeclarationContext valueDeclaration(int i) {
			return getRuleContext(ValueDeclarationContext.class,i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					valueDeclaration();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(116);
				properties();
				}
			}

			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==ID) {
				{
				{
				setState(119);
				valueDeclaration();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			repositories();
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					valueDeclaration();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(132);
				outputs();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==ID) {
				{
				{
				setState(135);
				valueDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			steps();
			setState(142);
			match(EOF);
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

	public static class ValueDeclarationContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ValueDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitValueDeclaration(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valueDeclaration);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				parameterDeclaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				variableDeclaration();
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public ParameterValueContext parameterValue() {
			return getRuleContext(ParameterValueContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			parameterName();
			setState(149);
			match(T__0);
			setState(150);
			parameterValue();
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

	public static class ParameterNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public ParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitParameterName(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__1);
			setState(153);
			match(ID);
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

	public static class ParameterValueContext extends ParserRuleContext {
		public DirectValueContext directValue() {
			return getRuleContext(DirectValueContext.class,0);
		}
		public ParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterParameterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitParameterValue(this);
		}
	}

	public final ParameterValueContext parameterValue() throws RecognitionException {
		ParameterValueContext _localctx = new ParameterValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			directValue();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			variableName();
			setState(158);
			match(T__0);
			setState(159);
			variableValue();
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
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

	public static class VariableValueContext extends ParserRuleContext {
		public DirectValueContext directValue() {
			return getRuleContext(DirectValueContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitVariableValue(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			directValue();
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

	public static class PropertiesContext extends ParserRuleContext {
		public AuthorPropertyContext authorProperty() {
			return getRuleContext(AuthorPropertyContext.class,0);
		}
		public DescriptionPropertyContext descriptionProperty() {
			return getRuleContext(DescriptionPropertyContext.class,0);
		}
		public VersionPropertyContext versionProperty() {
			return getRuleContext(VersionPropertyContext.class,0);
		}
		public DocumentationPropertyContext documentationProperty() {
			return getRuleContext(DocumentationPropertyContext.class,0);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__2);
			setState(166);
			match(T__3);
			setState(167);
			match(T__4);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(168);
				authorProperty();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(171);
				descriptionProperty();
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(174);
				versionProperty();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(177);
				documentationProperty();
				}
			}

			setState(180);
			match(T__5);
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

	public static class AuthorPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public AuthorPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterAuthorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitAuthorProperty(this);
		}
	}

	public final AuthorPropertyContext authorProperty() throws RecognitionException {
		AuthorPropertyContext _localctx = new AuthorPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_authorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__6);
			setState(183);
			match(T__3);
			setState(184);
			match(STRING);
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

	public static class DescriptionPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public DescriptionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterDescriptionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitDescriptionProperty(this);
		}
	}

	public final DescriptionPropertyContext descriptionProperty() throws RecognitionException {
		DescriptionPropertyContext _localctx = new DescriptionPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_descriptionProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__7);
			setState(187);
			match(T__3);
			setState(188);
			match(STRING);
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

	public static class VersionPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public VersionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterVersionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitVersionProperty(this);
		}
	}

	public final VersionPropertyContext versionProperty() throws RecognitionException {
		VersionPropertyContext _localctx = new VersionPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_versionProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__8);
			setState(191);
			match(T__3);
			setState(192);
			match(STRING);
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

	public static class DocumentationPropertyContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(PipesParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PipesParser.STRING, i);
		}
		public DocumentationPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documentationProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterDocumentationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitDocumentationProperty(this);
		}
	}

	public final DocumentationPropertyContext documentationProperty() throws RecognitionException {
		DocumentationPropertyContext _localctx = new DocumentationPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_documentationProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__9);
			setState(195);
			match(T__3);
			setState(196);
			match(T__10);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(197);
				match(STRING);
				}
			}

			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(200);
				match(T__11);
				setState(201);
				match(STRING);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(T__12);
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

	public static class RepositoriesContext extends ParserRuleContext {
		public List<RepositoryContext> repository() {
			return getRuleContexts(RepositoryContext.class);
		}
		public RepositoryContext repository(int i) {
			return getRuleContext(RepositoryContext.class,i);
		}
		public RepositoriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repositories; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterRepositories(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitRepositories(this);
		}
	}

	public final RepositoriesContext repositories() throws RecognitionException {
		RepositoriesContext _localctx = new RepositoriesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repositories);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__13);
			setState(210);
			match(T__3);
			setState(211);
			match(T__10);
			setState(212);
			repository();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(213);
				repository();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__12);
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

	public static class RepositoryContext extends ParserRuleContext {
		public ToolRepositoryContext toolRepository() {
			return getRuleContext(ToolRepositoryContext.class,0);
		}
		public PipelineRepositoryContext pipelineRepository() {
			return getRuleContext(PipelineRepositoryContext.class,0);
		}
		public RepositoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repository; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterRepository(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitRepository(this);
		}
	}

	public final RepositoryContext repository() throws RecognitionException {
		RepositoryContext _localctx = new RepositoryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repository);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				toolRepository();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				pipelineRepository();
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

	public static class ToolRepositoryContext extends ParserRuleContext {
		public RepositoryIdContext repositoryId() {
			return getRuleContext(RepositoryIdContext.class,0);
		}
		public LocationPropertyContext locationProperty() {
			return getRuleContext(LocationPropertyContext.class,0);
		}
		public ConfigPropertyContext configProperty() {
			return getRuleContext(ConfigPropertyContext.class,0);
		}
		public ToolRepositoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toolRepository; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterToolRepository(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitToolRepository(this);
		}
	}

	public final ToolRepositoryContext toolRepository() throws RecognitionException {
		ToolRepositoryContext _localctx = new ToolRepositoryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_toolRepository);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__14);
			setState(226);
			repositoryId();
			setState(227);
			match(T__3);
			setState(228);
			match(T__4);
			setState(229);
			locationProperty();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(230);
				configProperty();
				}
			}

			setState(233);
			match(T__5);
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

	public static class PipelineRepositoryContext extends ParserRuleContext {
		public RepositoryIdContext repositoryId() {
			return getRuleContext(RepositoryIdContext.class,0);
		}
		public LocationPropertyContext locationProperty() {
			return getRuleContext(LocationPropertyContext.class,0);
		}
		public ConfigPropertyContext configProperty() {
			return getRuleContext(ConfigPropertyContext.class,0);
		}
		public PipelineRepositoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineRepository; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterPipelineRepository(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitPipelineRepository(this);
		}
	}

	public final PipelineRepositoryContext pipelineRepository() throws RecognitionException {
		PipelineRepositoryContext _localctx = new PipelineRepositoryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pipelineRepository);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__15);
			setState(236);
			repositoryId();
			setState(237);
			match(T__3);
			setState(238);
			match(T__4);
			setState(239);
			locationProperty();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(240);
				configProperty();
				}
			}

			setState(243);
			match(T__5);
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

	public static class RepositoryIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public RepositoryIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repositoryId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterRepositoryId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitRepositoryId(this);
		}
	}

	public final RepositoryIdContext repositoryId() throws RecognitionException {
		RepositoryIdContext _localctx = new RepositoryIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repositoryId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
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

	public static class LocationPropertyContext extends ParserRuleContext {
		public LocationValueContext locationValue() {
			return getRuleContext(LocationValueContext.class,0);
		}
		public LocationPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterLocationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitLocationProperty(this);
		}
	}

	public final LocationPropertyContext locationProperty() throws RecognitionException {
		LocationPropertyContext _localctx = new LocationPropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_locationProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__16);
			setState(248);
			match(T__3);
			setState(249);
			locationValue();
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

	public static class LocationValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public LocationValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterLocationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitLocationValue(this);
		}
	}

	public final LocationValueContext locationValue() throws RecognitionException {
		LocationValueContext _localctx = new LocationValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_locationValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(STRING);
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

	public static class ConfigPropertyContext extends ParserRuleContext {
		public List<ConfigContext> config() {
			return getRuleContexts(ConfigContext.class);
		}
		public ConfigContext config(int i) {
			return getRuleContext(ConfigContext.class,i);
		}
		public ConfigPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterConfigProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitConfigProperty(this);
		}
	}

	public final ConfigPropertyContext configProperty() throws RecognitionException {
		ConfigPropertyContext _localctx = new ConfigPropertyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_configProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__17);
			setState(254);
			match(T__3);
			setState(255);
			match(T__4);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(256);
				config();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			match(T__5);
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

	public static class ConfigContext extends ParserRuleContext {
		public ConfigNameContext configName() {
			return getRuleContext(ConfigNameContext.class,0);
		}
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitConfig(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			configName();
			setState(265);
			match(T__3);
			setState(266);
			configValue();
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

	public static class ConfigNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public ConfigNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterConfigName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitConfigName(this);
		}
	}

	public final ConfigNameContext configName() throws RecognitionException {
		ConfigNameContext _localctx = new ConfigNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_configName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ID);
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

	public static class ConfigValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitConfigValue(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			value();
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

	public static class OutputsContext extends ParserRuleContext {
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOutputs(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__18);
			setState(273);
			match(T__3);
			setState(274);
			match(T__4);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(275);
				output();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(T__5);
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

	public static class OutputContext extends ParserRuleContext {
		public OutputIdContext outputId() {
			return getRuleContext(OutputIdContext.class,0);
		}
		public OutputValueContext outputValue() {
			return getRuleContext(OutputValueContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			outputId();
			setState(284);
			match(T__3);
			setState(285);
			outputValue();
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

	public static class OutputIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public OutputIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOutputId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOutputId(this);
		}
	}

	public final OutputIdContext outputId() throws RecognitionException {
		OutputIdContext _localctx = new OutputIdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outputId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ID);
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

	public static class OutputValueContext extends ParserRuleContext {
		public StepIdContext stepId() {
			return getRuleContext(StepIdContext.class,0);
		}
		public OutputNameContext outputName() {
			return getRuleContext(OutputNameContext.class,0);
		}
		public OutputValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOutputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOutputValue(this);
		}
	}

	public final OutputValueContext outputValue() throws RecognitionException {
		OutputValueContext _localctx = new OutputValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_outputValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			stepId();
			setState(290);
			match(T__10);
			setState(291);
			outputName();
			setState(292);
			match(T__12);
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

	public static class OutputNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public OutputNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOutputName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOutputName(this);
		}
	}

	public final OutputNameContext outputName() throws RecognitionException {
		OutputNameContext _localctx = new OutputNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_outputName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ID);
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

	public static class StepsContext extends ParserRuleContext {
		public List<StepContext> step() {
			return getRuleContexts(StepContext.class);
		}
		public StepContext step(int i) {
			return getRuleContext(StepContext.class,i);
		}
		public StepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_steps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterSteps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitSteps(this);
		}
	}

	public final StepsContext steps() throws RecognitionException {
		StepsContext _localctx = new StepsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__19);
			setState(297);
			match(T__3);
			setState(298);
			match(T__10);
			setState(299);
			step();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(300);
				step();
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(306);
			match(T__12);
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
		public StepIdContext stepId() {
			return getRuleContext(StepIdContext.class,0);
		}
		public ExecPropertyContext execProperty() {
			return getRuleContext(ExecPropertyContext.class,0);
		}
		public ExecutionContextPropertyContext executionContextProperty() {
			return getRuleContext(ExecutionContextPropertyContext.class,0);
		}
		public InputsPropertyContext inputsProperty() {
			return getRuleContext(InputsPropertyContext.class,0);
		}
		public SpreadPropertyContext spreadProperty() {
			return getRuleContext(SpreadPropertyContext.class,0);
		}
		public StepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__20);
			setState(309);
			stepId();
			setState(310);
			match(T__3);
			setState(311);
			match(T__4);
			setState(312);
			execProperty();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(313);
				executionContextProperty();
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(316);
				inputsProperty();
				}
			}

			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(319);
				spreadProperty();
				}
			}

			setState(322);
			match(T__5);
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

	public static class StepIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public StepIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stepId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterStepId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitStepId(this);
		}
	}

	public final StepIdContext stepId() throws RecognitionException {
		StepIdContext _localctx = new StepIdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stepId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(ID);
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

	public static class ExecPropertyContext extends ParserRuleContext {
		public CommandReferenceContext commandReference() {
			return getRuleContext(CommandReferenceContext.class,0);
		}
		public PipelineReferenceContext pipelineReference() {
			return getRuleContext(PipelineReferenceContext.class,0);
		}
		public ExecPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterExecProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitExecProperty(this);
		}
	}

	public final ExecPropertyContext execProperty() throws RecognitionException {
		ExecPropertyContext _localctx = new ExecPropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_execProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__21);
			setState(327);
			match(T__3);
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(328);
				commandReference();
				}
				break;
			case 2:
				{
				setState(329);
				pipelineReference();
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

	public static class CommandReferenceContext extends ParserRuleContext {
		public RepositoryIdContext repositoryId() {
			return getRuleContext(RepositoryIdContext.class,0);
		}
		public ToolNameContext toolName() {
			return getRuleContext(ToolNameContext.class,0);
		}
		public CommandNameContext commandName() {
			return getRuleContext(CommandNameContext.class,0);
		}
		public CommandReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterCommandReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitCommandReference(this);
		}
	}

	public final CommandReferenceContext commandReference() throws RecognitionException {
		CommandReferenceContext _localctx = new CommandReferenceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_commandReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			repositoryId();
			setState(333);
			match(T__10);
			setState(334);
			toolName();
			setState(335);
			match(T__12);
			setState(336);
			match(T__10);
			setState(337);
			commandName();
			setState(338);
			match(T__12);
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

	public static class ToolNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public ToolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterToolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitToolName(this);
		}
	}

	public final ToolNameContext toolName() throws RecognitionException {
		ToolNameContext _localctx = new ToolNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_toolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(ID);
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

	public static class CommandNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public CommandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitCommandName(this);
		}
	}

	public final CommandNameContext commandName() throws RecognitionException {
		CommandNameContext _localctx = new CommandNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_commandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(ID);
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

	public static class PipelineReferenceContext extends ParserRuleContext {
		public RepositoryIdContext repositoryId() {
			return getRuleContext(RepositoryIdContext.class,0);
		}
		public PipelineNameContext pipelineName() {
			return getRuleContext(PipelineNameContext.class,0);
		}
		public PipelineReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterPipelineReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitPipelineReference(this);
		}
	}

	public final PipelineReferenceContext pipelineReference() throws RecognitionException {
		PipelineReferenceContext _localctx = new PipelineReferenceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pipelineReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			repositoryId();
			setState(345);
			match(T__10);
			setState(346);
			pipelineName();
			setState(347);
			match(T__12);
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

	public static class PipelineNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public PipelineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipelineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterPipelineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitPipelineName(this);
		}
	}

	public final PipelineNameContext pipelineName() throws RecognitionException {
		PipelineNameContext _localctx = new PipelineNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pipelineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ID);
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

	public static class ExecutionContextPropertyContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExecutionContextPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executionContextProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterExecutionContextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitExecutionContextProperty(this);
		}
	}

	public final ExecutionContextPropertyContext executionContextProperty() throws RecognitionException {
		ExecutionContextPropertyContext _localctx = new ExecutionContextPropertyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_executionContextProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__22);
			setState(352);
			match(T__3);
			setState(353);
			value();
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

	public static class InputsPropertyContext extends ParserRuleContext {
		public List<InputPropertyContext> inputProperty() {
			return getRuleContexts(InputPropertyContext.class);
		}
		public InputPropertyContext inputProperty(int i) {
			return getRuleContext(InputPropertyContext.class,i);
		}
		public InputsPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputsProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterInputsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitInputsProperty(this);
		}
	}

	public final InputsPropertyContext inputsProperty() throws RecognitionException {
		InputsPropertyContext _localctx = new InputsPropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inputsProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__23);
			setState(356);
			match(T__3);
			setState(357);
			match(T__4);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(358);
				inputProperty();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(T__5);
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

	public static class InputPropertyContext extends ParserRuleContext {
		public InputNameContext inputName() {
			return getRuleContext(InputNameContext.class,0);
		}
		public InputValueContext inputValue() {
			return getRuleContext(InputValueContext.class,0);
		}
		public InputPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterInputProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitInputProperty(this);
		}
	}

	public final InputPropertyContext inputProperty() throws RecognitionException {
		InputPropertyContext _localctx = new InputPropertyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inputProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			inputName();
			setState(367);
			match(T__3);
			setState(368);
			inputValue();
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

	public static class InputNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PipesParser.ID, 0); }
		public InputNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterInputName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitInputName(this);
		}
	}

	public final InputNameContext inputName() throws RecognitionException {
		InputNameContext _localctx = new InputNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_inputName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
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

	public static class InputValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public InputValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterInputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitInputValue(this);
		}
	}

	public final InputValueContext inputValue() throws RecognitionException {
		InputValueContext _localctx = new InputValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_inputValue);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				chain();
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

	public static class ChainContext extends ParserRuleContext {
		public StepIdContext stepId() {
			return getRuleContext(StepIdContext.class,0);
		}
		public OutputNameContext outputName() {
			return getRuleContext(OutputNameContext.class,0);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitChain(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_chain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			stepId();
			setState(377);
			match(T__10);
			setState(378);
			outputName();
			setState(379);
			match(T__12);
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

	public static class SpreadPropertyContext extends ParserRuleContext {
		public SpreadInputsToSpreadPropertyContext spreadInputsToSpreadProperty() {
			return getRuleContext(SpreadInputsToSpreadPropertyContext.class,0);
		}
		public SpreadStrategyPropertyContext spreadStrategyProperty() {
			return getRuleContext(SpreadStrategyPropertyContext.class,0);
		}
		public SpreadPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterSpreadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitSpreadProperty(this);
		}
	}

	public final SpreadPropertyContext spreadProperty() throws RecognitionException {
		SpreadPropertyContext _localctx = new SpreadPropertyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_spreadProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__24);
			setState(382);
			match(T__3);
			setState(383);
			match(T__4);
			setState(384);
			spreadInputsToSpreadProperty();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(385);
				spreadStrategyProperty();
				}
			}

			setState(388);
			match(T__5);
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

	public static class SpreadStrategyPropertyContext extends ParserRuleContext {
		public CombineStrategyContext combineStrategy() {
			return getRuleContext(CombineStrategyContext.class,0);
		}
		public SpreadStrategyPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadStrategyProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterSpreadStrategyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitSpreadStrategyProperty(this);
		}
	}

	public final SpreadStrategyPropertyContext spreadStrategyProperty() throws RecognitionException {
		SpreadStrategyPropertyContext _localctx = new SpreadStrategyPropertyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_spreadStrategyProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__25);
			setState(391);
			match(T__3);
			setState(392);
			combineStrategy();
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

	public static class StrategyValueContext extends ParserRuleContext {
		public CombineStrategyContext combineStrategy() {
			return getRuleContext(CombineStrategyContext.class,0);
		}
		public InputNameContext inputName() {
			return getRuleContext(InputNameContext.class,0);
		}
		public StrategyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strategyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterStrategyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitStrategyValue(this);
		}
	}

	public final StrategyValueContext strategyValue() throws RecognitionException {
		StrategyValueContext _localctx = new StrategyValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_strategyValue);
		try {
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				combineStrategy();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				inputName();
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

	public static class CombineStrategyContext extends ParserRuleContext {
		public OneToOneStrategyContext oneToOneStrategy() {
			return getRuleContext(OneToOneStrategyContext.class,0);
		}
		public OneToManyStrategyContext oneToManyStrategy() {
			return getRuleContext(OneToManyStrategyContext.class,0);
		}
		public CombineStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combineStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterCombineStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitCombineStrategy(this);
		}
	}

	public final CombineStrategyContext combineStrategy() throws RecognitionException {
		CombineStrategyContext _localctx = new CombineStrategyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_combineStrategy);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				oneToOneStrategy();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				oneToManyStrategy();
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

	public static class OneToOneStrategyContext extends ParserRuleContext {
		public List<StrategyValueContext> strategyValue() {
			return getRuleContexts(StrategyValueContext.class);
		}
		public StrategyValueContext strategyValue(int i) {
			return getRuleContext(StrategyValueContext.class,i);
		}
		public OneToOneStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneToOneStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOneToOneStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOneToOneStrategy(this);
		}
	}

	public final OneToOneStrategyContext oneToOneStrategy() throws RecognitionException {
		OneToOneStrategyContext _localctx = new OneToOneStrategyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_oneToOneStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__26);
			setState(403);
			match(T__27);
			setState(404);
			strategyValue();
			setState(405);
			match(T__11);
			setState(406);
			strategyValue();
			setState(407);
			match(T__28);
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

	public static class OneToManyStrategyContext extends ParserRuleContext {
		public List<StrategyValueContext> strategyValue() {
			return getRuleContexts(StrategyValueContext.class);
		}
		public StrategyValueContext strategyValue(int i) {
			return getRuleContext(StrategyValueContext.class,i);
		}
		public OneToManyStrategyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneToManyStrategy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterOneToManyStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitOneToManyStrategy(this);
		}
	}

	public final OneToManyStrategyContext oneToManyStrategy() throws RecognitionException {
		OneToManyStrategyContext _localctx = new OneToManyStrategyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_oneToManyStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(T__29);
			setState(410);
			match(T__27);
			setState(411);
			strategyValue();
			setState(412);
			match(T__11);
			setState(413);
			strategyValue();
			setState(414);
			match(T__28);
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

	public static class SpreadInputsToSpreadPropertyContext extends ParserRuleContext {
		public List<InputNameContext> inputName() {
			return getRuleContexts(InputNameContext.class);
		}
		public InputNameContext inputName(int i) {
			return getRuleContext(InputNameContext.class,i);
		}
		public SpreadInputsToSpreadPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spreadInputsToSpreadProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterSpreadInputsToSpreadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitSpreadInputsToSpreadProperty(this);
		}
	}

	public final SpreadInputsToSpreadPropertyContext spreadInputsToSpreadProperty() throws RecognitionException {
		SpreadInputsToSpreadPropertyContext _localctx = new SpreadInputsToSpreadPropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_spreadInputsToSpreadProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__30);
			setState(417);
			match(T__3);
			setState(418);
			match(T__10);
			setState(419);
			inputName();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(420);
				match(T__11);
				setState(421);
				inputName();
				}
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(427);
			match(T__12);
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

	public static class ValueContext extends ParserRuleContext {
		public DirectValueContext directValue() {
			return getRuleContext(DirectValueContext.class,0);
		}
		public IndirectValueContext indirectValue() {
			return getRuleContext(IndirectValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		try {
			setState(431);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case STRING:
			case BOOLEAN:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				directValue();
				}
				break;
			case T__1:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				indirectValue();
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

	public static class IndirectValueContext extends ParserRuleContext {
		public ParameterNameContext parameterName() {
			return getRuleContext(ParameterNameContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public IndirectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterIndirectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitIndirectValue(this);
		}
	}

	public final IndirectValueContext indirectValue() throws RecognitionException {
		IndirectValueContext _localctx = new IndirectValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_indirectValue);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				parameterName();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				variableName();
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

	public static class DirectValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(PipesParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(PipesParser.BOOLEAN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DirectValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterDirectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitDirectValue(this);
		}
	}

	public final DirectValueContext directValue() throws RecognitionException {
		DirectValueContext _localctx = new DirectValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_directValue);
		try {
			setState(441);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(BOOLEAN);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				array();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<DirectValueContext> directValue() {
			return getRuleContexts(DirectValueContext.class);
		}
		public DirectValueContext directValue(int i) {
			return getRuleContext(DirectValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener) ((PipesListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_array);
		int _la;
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(T__10);
				setState(444);
				directValue();
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(445);
					match(T__11);
					setState(446);
					directValue();
					}
					}
					setState(451);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(452);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(T__10);
				setState(455);
				match(T__12);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\5\2x\n\2\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\3\2\7\2\u0082\n\2\f\2\16\2"+
		"\u0085\13\2\3\2\5\2\u0088\n\2\3\2\7\2\u008b\n\2\f\2\16\2\u008e\13\2\3"+
		"\2\3\2\3\2\3\3\3\3\5\3\u0095\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\n\5\n\u00af"+
		"\n\n\3\n\5\n\u00b2\n\n\3\n\5\n\u00b5\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\16"+
		"\3\16\7\16\u00cd\n\16\f\16\16\16\u00d0\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17\3\17\3\17\3\20\3\20"+
		"\5\20\u00e2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ea\n\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f4\n\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0104\n\26\f\26"+
		"\16\26\u0107\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\7\32\u0117\n\32\f\32\16\32\u011a\13\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u0130\n\37\f\37\16\37\u0133\13\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \5 \u013d\n \3 \5 \u0140\n \3 \5 \u0143\n \3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3\"\5\"\u014d\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\7)\u016a\n)\f)\16)\u016d"+
		"\13)\3)\3)\3*\3*\3*\3*\3+\3+\3,\3,\5,\u0179\n,\3-\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3.\5.\u0185\n.\3.\3.\3/\3/\3/\3/\3\60\3\60\5\60\u018f\n\60\3\61\3"+
		"\61\5\61\u0193\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u01a9\n\64\f\64"+
		"\16\64\u01ac\13\64\3\64\3\64\3\65\3\65\5\65\u01b2\n\65\3\66\3\66\5\66"+
		"\u01b6\n\66\3\67\3\67\3\67\3\67\5\67\u01bc\n\67\38\38\38\38\78\u01c2\n"+
		"8\f8\168\u01c5\138\38\38\38\38\58\u01cb\n8\38\2\29\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2"+
		"\2\2\u01ba\2s\3\2\2\2\4\u0094\3\2\2\2\6\u0096\3\2\2\2\b\u009a\3\2\2\2"+
		"\n\u009d\3\2\2\2\f\u009f\3\2\2\2\16\u00a3\3\2\2\2\20\u00a5\3\2\2\2\22"+
		"\u00a7\3\2\2\2\24\u00b8\3\2\2\2\26\u00bc\3\2\2\2\30\u00c0\3\2\2\2\32\u00c4"+
		"\3\2\2\2\34\u00d3\3\2\2\2\36\u00e1\3\2\2\2 \u00e3\3\2\2\2\"\u00ed\3\2"+
		"\2\2$\u00f7\3\2\2\2&\u00f9\3\2\2\2(\u00fd\3\2\2\2*\u00ff\3\2\2\2,\u010a"+
		"\3\2\2\2.\u010e\3\2\2\2\60\u0110\3\2\2\2\62\u0112\3\2\2\2\64\u011d\3\2"+
		"\2\2\66\u0121\3\2\2\28\u0123\3\2\2\2:\u0128\3\2\2\2<\u012a\3\2\2\2>\u0136"+
		"\3\2\2\2@\u0146\3\2\2\2B\u0148\3\2\2\2D\u014e\3\2\2\2F\u0156\3\2\2\2H"+
		"\u0158\3\2\2\2J\u015a\3\2\2\2L\u015f\3\2\2\2N\u0161\3\2\2\2P\u0165\3\2"+
		"\2\2R\u0170\3\2\2\2T\u0174\3\2\2\2V\u0178\3\2\2\2X\u017a\3\2\2\2Z\u017f"+
		"\3\2\2\2\\\u0188\3\2\2\2^\u018e\3\2\2\2`\u0192\3\2\2\2b\u0194\3\2\2\2"+
		"d\u019b\3\2\2\2f\u01a2\3\2\2\2h\u01b1\3\2\2\2j\u01b5\3\2\2\2l\u01bb\3"+
		"\2\2\2n\u01ca\3\2\2\2pr\5\4\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2vx\5\22\n\2wv\3\2\2\2wx\3\2\2\2x|\3\2\2\2y{\5\4"+
		"\3\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177"+
		"\u0083\5\34\17\2\u0080\u0082\5\4\3\2\u0081\u0080\3\2\2\2\u0082\u0085\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0088\5\62\32\2\u0087\u0086\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u008c\3\2\2\2\u0089\u008b\5\4\3\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5<\37\2\u0090\u0091\7\2\2\3\u0091"+
		"\3\3\2\2\2\u0092\u0095\5\6\4\2\u0093\u0095\5\f\7\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\5\3\2\2\2\u0096\u0097\5\b\5\2\u0097\u0098\7"+
		"\3\2\2\u0098\u0099\5\n\6\2\u0099\7\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c"+
		"\7\"\2\2\u009c\t\3\2\2\2\u009d\u009e\5l\67\2\u009e\13\3\2\2\2\u009f\u00a0"+
		"\5\16\b\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\20\t\2\u00a2\r\3\2\2\2\u00a3"+
		"\u00a4\7\"\2\2\u00a4\17\3\2\2\2\u00a5\u00a6\5l\67\2\u00a6\21\3\2\2\2\u00a7"+
		"\u00a8\7\5\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00ab\7\7\2\2\u00aa\u00ac\5\24"+
		"\13\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00af\5\26\f\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3"+
		"\2\2\2\u00b0\u00b2\5\30\r\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\3\2\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\23\3\2\2\2\u00b8"+
		"\u00b9\7\t\2\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\7#\2\2\u00bb\25\3\2\2\2"+
		"\u00bc\u00bd\7\n\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7#\2\2\u00bf\27\3"+
		"\2\2\2\u00c0\u00c1\7\13\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7#\2\2\u00c3"+
		"\31\3\2\2\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c8\7\r\2"+
		"\2\u00c7\u00c9\7#\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce"+
		"\3\2\2\2\u00ca\u00cb\7\16\2\2\u00cb\u00cd\7#\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\17\2\2\u00d2\33\3\2\2\2\u00d3\u00d4"+
		"\7\20\2\2\u00d4\u00d5\7\6\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00da\5\36\20"+
		"\2\u00d7\u00d9\5\36\20\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\17\2\2\u00de\35\3\2\2\2\u00df\u00e2\5 \21\2\u00e0\u00e2"+
		"\5\"\22\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\37\3\2\2\2\u00e3"+
		"\u00e4\7\21\2\2\u00e4\u00e5\5$\23\2\u00e5\u00e6\7\6\2\2\u00e6\u00e7\7"+
		"\7\2\2\u00e7\u00e9\5&\24\2\u00e8\u00ea\5*\26\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\b\2\2\u00ec!\3\2\2\2"+
		"\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1"+
		"\7\7\2\2\u00f1\u00f3\5&\24\2\u00f2\u00f4\5*\26\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\b\2\2\u00f6#\3\2\2\2"+
		"\u00f7\u00f8\7\"\2\2\u00f8%\3\2\2\2\u00f9\u00fa\7\23\2\2\u00fa\u00fb\7"+
		"\6\2\2\u00fb\u00fc\5(\25\2\u00fc\'\3\2\2\2\u00fd\u00fe\7#\2\2\u00fe)\3"+
		"\2\2\2\u00ff\u0100\7\24\2\2\u0100\u0101\7\6\2\2\u0101\u0105\7\7\2\2\u0102"+
		"\u0104\5,\27\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\7\b\2\2\u0109+\3\2\2\2\u010a\u010b\5.\30\2\u010b\u010c\7\6\2\2"+
		"\u010c\u010d\5\60\31\2\u010d-\3\2\2\2\u010e\u010f\7\"\2\2\u010f/\3\2\2"+
		"\2\u0110\u0111\5h\65\2\u0111\61\3\2\2\2\u0112\u0113\7\25\2\2\u0113\u0114"+
		"\7\6\2\2\u0114\u0118\7\7\2\2\u0115\u0117\5\64\33\2\u0116\u0115\3\2\2\2"+
		"\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\b\2\2\u011c\63\3\2\2\2\u011d"+
		"\u011e\5\66\34\2\u011e\u011f\7\6\2\2\u011f\u0120\58\35\2\u0120\65\3\2"+
		"\2\2\u0121\u0122\7\"\2\2\u0122\67\3\2\2\2\u0123\u0124\5@!\2\u0124\u0125"+
		"\7\r\2\2\u0125\u0126\5:\36\2\u0126\u0127\7\17\2\2\u01279\3\2\2\2\u0128"+
		"\u0129\7\"\2\2\u0129;\3\2\2\2\u012a\u012b\7\26\2\2\u012b\u012c\7\6\2\2"+
		"\u012c\u012d\7\r\2\2\u012d\u0131\5> \2\u012e\u0130\5> \2\u012f\u012e\3"+
		"\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\17\2\2\u0135=\3\2\2\2"+
		"\u0136\u0137\7\27\2\2\u0137\u0138\5@!\2\u0138\u0139\7\6\2\2\u0139\u013a"+
		"\7\7\2\2\u013a\u013c\5B\"\2\u013b\u013d\5N(\2\u013c\u013b\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140\5P)\2\u013f\u013e\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u0143\5Z.\2\u0142\u0141"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\b\2\2\u0145"+
		"?\3\2\2\2\u0146\u0147\7\"\2\2\u0147A\3\2\2\2\u0148\u0149\7\30\2\2\u0149"+
		"\u014c\7\6\2\2\u014a\u014d\5D#\2\u014b\u014d\5J&\2\u014c\u014a\3\2\2\2"+
		"\u014c\u014b\3\2\2\2\u014dC\3\2\2\2\u014e\u014f\5$\23\2\u014f\u0150\7"+
		"\r\2\2\u0150\u0151\5F$\2\u0151\u0152\7\17\2\2\u0152\u0153\7\r\2\2\u0153"+
		"\u0154\5H%\2\u0154\u0155\7\17\2\2\u0155E\3\2\2\2\u0156\u0157\7\"\2\2\u0157"+
		"G\3\2\2\2\u0158\u0159\7\"\2\2\u0159I\3\2\2\2\u015a\u015b\5$\23\2\u015b"+
		"\u015c\7\r\2\2\u015c\u015d\5L\'\2\u015d\u015e\7\17\2\2\u015eK\3\2\2\2"+
		"\u015f\u0160\7\"\2\2\u0160M\3\2\2\2\u0161\u0162\7\31\2\2\u0162\u0163\7"+
		"\6\2\2\u0163\u0164\5h\65\2\u0164O\3\2\2\2\u0165\u0166\7\32\2\2\u0166\u0167"+
		"\7\6\2\2\u0167\u016b\7\7\2\2\u0168\u016a\5R*\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\b\2\2\u016fQ\3\2\2\2\u0170\u0171"+
		"\5T+\2\u0171\u0172\7\6\2\2\u0172\u0173\5V,\2\u0173S\3\2\2\2\u0174\u0175"+
		"\7\"\2\2\u0175U\3\2\2\2\u0176\u0179\5h\65\2\u0177\u0179\5X-\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0177\3\2\2\2\u0179W\3\2\2\2\u017a\u017b\5@!\2\u017b\u017c"+
		"\7\r\2\2\u017c\u017d\5:\36\2\u017d\u017e\7\17\2\2\u017eY\3\2\2\2\u017f"+
		"\u0180\7\33\2\2\u0180\u0181\7\6\2\2\u0181\u0182\7\7\2\2\u0182\u0184\5"+
		"f\64\2\u0183\u0185\5\\/\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\7\b\2\2\u0187[\3\2\2\2\u0188\u0189\7\34\2\2"+
		"\u0189\u018a\7\6\2\2\u018a\u018b\5`\61\2\u018b]\3\2\2\2\u018c\u018f\5"+
		"`\61\2\u018d\u018f\5T+\2\u018e\u018c\3\2\2\2\u018e\u018d\3\2\2\2\u018f"+
		"_\3\2\2\2\u0190\u0193\5b\62\2\u0191\u0193\5d\63\2\u0192\u0190\3\2\2\2"+
		"\u0192\u0191\3\2\2\2\u0193a\3\2\2\2\u0194\u0195\7\35\2\2\u0195\u0196\7"+
		"\36\2\2\u0196\u0197\5^\60\2\u0197\u0198\7\16\2\2\u0198\u0199\5^\60\2\u0199"+
		"\u019a\7\37\2\2\u019ac\3\2\2\2\u019b\u019c\7 \2\2\u019c\u019d\7\36\2\2"+
		"\u019d\u019e\5^\60\2\u019e\u019f\7\16\2\2\u019f\u01a0\5^\60\2\u01a0\u01a1"+
		"\7\37\2\2\u01a1e\3\2\2\2\u01a2\u01a3\7!\2\2\u01a3\u01a4\7\6\2\2\u01a4"+
		"\u01a5\7\r\2\2\u01a5\u01aa\5T+\2\u01a6\u01a7\7\16\2\2\u01a7\u01a9\5T+"+
		"\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\17\2\2"+
		"\u01aeg\3\2\2\2\u01af\u01b2\5l\67\2\u01b0\u01b2\5j\66\2\u01b1\u01af\3"+
		"\2\2\2\u01b1\u01b0\3\2\2\2\u01b2i\3\2\2\2\u01b3\u01b6\5\b\5\2\u01b4\u01b6"+
		"\5\16\b\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6k\3\2\2\2\u01b7"+
		"\u01bc\7#\2\2\u01b8\u01bc\7%\2\2\u01b9\u01bc\7$\2\2\u01ba\u01bc\5n8\2"+
		"\u01bb\u01b7\3\2\2\2\u01bb\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba"+
		"\3\2\2\2\u01bcm\3\2\2\2\u01bd\u01be\7\r\2\2\u01be\u01c3\5l\67\2\u01bf"+
		"\u01c0\7\16\2\2\u01c0\u01c2\5l\67\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\3"+
		"\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01c7\7\17\2\2\u01c7\u01cb\3\2\2\2\u01c8\u01c9\7"+
		"\r\2\2\u01c9\u01cb\7\17\2\2\u01ca\u01bd\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"o\3\2\2\2%sw|\u0083\u0087\u008c\u0094\u00ab\u00ae\u00b1\u00b4\u00c8\u00ce"+
		"\u00da\u00e1\u00e9\u00f3\u0105\u0118\u0131\u013c\u013f\u0142\u014c\u016b"+
		"\u0178\u0184\u018e\u0192\u01aa\u01b1\u01b5\u01bb\u01c3\u01ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}