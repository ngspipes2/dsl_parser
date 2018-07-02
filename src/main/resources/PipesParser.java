// Generated from Pipes.g4 by ANTLR 4.7.1
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
		public RepositoriesContext repositories() {
			return getRuleContext(RepositoriesContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public StepsContext steps() {
			return getRuleContext(StepsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitRoot(this);
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
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
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
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					valueDeclaration();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(125);
				repositories();
				}
			}

			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(128);
					valueDeclaration();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(134);
				outputs();
				}
			}

			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==ID) {
				{
				{
				setState(137);
				valueDeclaration();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(143);
				steps();
				}
			}

			setState(146);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterValueDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitValueDeclaration(this);
		}
	}

	public final ValueDeclarationContext valueDeclaration() throws RecognitionException {
		ValueDeclarationContext _localctx = new ValueDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valueDeclaration);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				parameterDeclaration();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitParameterDeclaration(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			parameterName();
			setState(153);
			match(T__0);
			setState(154);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitParameterName(this);
		}
	}

	public final ParameterNameContext parameterName() throws RecognitionException {
		ParameterNameContext _localctx = new ParameterNameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__1);
			setState(157);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterParameterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitParameterValue(this);
		}
	}

	public final ParameterValueContext parameterValue() throws RecognitionException {
		ParameterValueContext _localctx = new ParameterValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			variableName();
			setState(162);
			match(T__0);
			setState(163);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitVariableValue(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__2);
			setState(170);
			match(T__3);
			setState(171);
			match(T__4);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(172);
				authorProperty();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(175);
				descriptionProperty();
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(178);
				versionProperty();
				}
			}

			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(181);
				documentationProperty();
				}
			}

			setState(184);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterAuthorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitAuthorProperty(this);
		}
	}

	public final AuthorPropertyContext authorProperty() throws RecognitionException {
		AuthorPropertyContext _localctx = new AuthorPropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_authorProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__6);
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

	public static class DescriptionPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public DescriptionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterDescriptionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitDescriptionProperty(this);
		}
	}

	public final DescriptionPropertyContext descriptionProperty() throws RecognitionException {
		DescriptionPropertyContext _localctx = new DescriptionPropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_descriptionProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__7);
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

	public static class VersionPropertyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PipesParser.STRING, 0); }
		public VersionPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterVersionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitVersionProperty(this);
		}
	}

	public final VersionPropertyContext versionProperty() throws RecognitionException {
		VersionPropertyContext _localctx = new VersionPropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_versionProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__8);
			setState(195);
			match(T__3);
			setState(196);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterDocumentationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitDocumentationProperty(this);
		}
	}

	public final DocumentationPropertyContext documentationProperty() throws RecognitionException {
		DocumentationPropertyContext _localctx = new DocumentationPropertyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_documentationProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__9);
			setState(199);
			match(T__3);
			setState(200);
			match(T__10);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(201);
				match(STRING);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(202);
					match(T__11);
					setState(203);
					match(STRING);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(211);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterRepositories(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitRepositories(this);
		}
	}

	public final RepositoriesContext repositories() throws RecognitionException {
		RepositoriesContext _localctx = new RepositoriesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_repositories);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__13);
			setState(214);
			match(T__3);
			setState(215);
			match(T__10);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(216);
				repository();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterRepository(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitRepository(this);
		}
	}

	public final RepositoryContext repository() throws RecognitionException {
		RepositoryContext _localctx = new RepositoryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_repository);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				toolRepository();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterToolRepository(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitToolRepository(this);
		}
	}

	public final ToolRepositoryContext toolRepository() throws RecognitionException {
		ToolRepositoryContext _localctx = new ToolRepositoryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_toolRepository);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__14);
			setState(229);
			repositoryId();
			setState(230);
			match(T__3);
			setState(231);
			match(T__4);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(232);
				locationProperty();
				}
			}

			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(235);
				configProperty();
				}
			}

			setState(238);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterPipelineRepository(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitPipelineRepository(this);
		}
	}

	public final PipelineRepositoryContext pipelineRepository() throws RecognitionException {
		PipelineRepositoryContext _localctx = new PipelineRepositoryContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pipelineRepository);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__15);
			setState(241);
			repositoryId();
			setState(242);
			match(T__3);
			setState(243);
			match(T__4);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(244);
				locationProperty();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(247);
				configProperty();
				}
			}

			setState(250);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterRepositoryId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitRepositoryId(this);
		}
	}

	public final RepositoryIdContext repositoryId() throws RecognitionException {
		RepositoryIdContext _localctx = new RepositoryIdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_repositoryId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterLocationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitLocationProperty(this);
		}
	}

	public final LocationPropertyContext locationProperty() throws RecognitionException {
		LocationPropertyContext _localctx = new LocationPropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_locationProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__16);
			setState(255);
			match(T__3);
			setState(256);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterLocationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitLocationValue(this);
		}
	}

	public final LocationValueContext locationValue() throws RecognitionException {
		LocationValueContext _localctx = new LocationValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_locationValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterConfigProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitConfigProperty(this);
		}
	}

	public final ConfigPropertyContext configProperty() throws RecognitionException {
		ConfigPropertyContext _localctx = new ConfigPropertyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_configProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__17);
			setState(261);
			match(T__3);
			setState(262);
			match(T__4);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(263);
				config();
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitConfig(this);
		}
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			configName();
			setState(272);
			match(T__3);
			setState(273);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterConfigName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitConfigName(this);
		}
	}

	public final ConfigNameContext configName() throws RecognitionException {
		ConfigNameContext _localctx = new ConfigNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_configName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitConfigValue(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOutputs(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__18);
			setState(280);
			match(T__3);
			setState(281);
			match(T__4);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(282);
				output();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			outputId();
			setState(291);
			match(T__3);
			setState(292);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOutputId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOutputId(this);
		}
	}

	public final OutputIdContext outputId() throws RecognitionException {
		OutputIdContext _localctx = new OutputIdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_outputId);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOutputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOutputValue(this);
		}
	}

	public final OutputValueContext outputValue() throws RecognitionException {
		OutputValueContext _localctx = new OutputValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_outputValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			stepId();
			setState(297);
			match(T__10);
			setState(298);
			outputName();
			setState(299);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOutputName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOutputName(this);
		}
	}

	public final OutputNameContext outputName() throws RecognitionException {
		OutputNameContext _localctx = new OutputNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_outputName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterSteps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitSteps(this);
		}
	}

	public final StepsContext steps() throws RecognitionException {
		StepsContext _localctx = new StepsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_steps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__19);
			setState(304);
			match(T__3);
			setState(305);
			match(T__10);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(306);
				step();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitStep(this);
		}
	}

	public final StepContext step() throws RecognitionException {
		StepContext _localctx = new StepContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_step);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__20);
			setState(315);
			stepId();
			setState(316);
			match(T__3);
			setState(317);
			match(T__4);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(318);
				execProperty();
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(321);
				executionContextProperty();
				}
			}

			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(324);
				inputsProperty();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(327);
				spreadProperty();
				}
			}

			setState(330);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterStepId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitStepId(this);
		}
	}

	public final StepIdContext stepId() throws RecognitionException {
		StepIdContext _localctx = new StepIdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stepId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterExecProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitExecProperty(this);
		}
	}

	public final ExecPropertyContext execProperty() throws RecognitionException {
		ExecPropertyContext _localctx = new ExecPropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_execProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__21);
			setState(335);
			match(T__3);
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(336);
				commandReference();
				}
				break;
			case 2:
				{
				setState(337);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterCommandReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitCommandReference(this);
		}
	}

	public final CommandReferenceContext commandReference() throws RecognitionException {
		CommandReferenceContext _localctx = new CommandReferenceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_commandReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			repositoryId();
			setState(341);
			match(T__10);
			setState(342);
			toolName();
			setState(343);
			match(T__12);
			setState(344);
			match(T__10);
			setState(345);
			commandName();
			setState(346);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterToolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitToolName(this);
		}
	}

	public final ToolNameContext toolName() throws RecognitionException {
		ToolNameContext _localctx = new ToolNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_toolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterCommandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitCommandName(this);
		}
	}

	public final CommandNameContext commandName() throws RecognitionException {
		CommandNameContext _localctx = new CommandNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_commandName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterPipelineReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitPipelineReference(this);
		}
	}

	public final PipelineReferenceContext pipelineReference() throws RecognitionException {
		PipelineReferenceContext _localctx = new PipelineReferenceContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pipelineReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			repositoryId();
			setState(353);
			match(T__10);
			setState(354);
			pipelineName();
			setState(355);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterPipelineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitPipelineName(this);
		}
	}

	public final PipelineNameContext pipelineName() throws RecognitionException {
		PipelineNameContext _localctx = new PipelineNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_pipelineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterExecutionContextProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitExecutionContextProperty(this);
		}
	}

	public final ExecutionContextPropertyContext executionContextProperty() throws RecognitionException {
		ExecutionContextPropertyContext _localctx = new ExecutionContextPropertyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_executionContextProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__22);
			setState(360);
			match(T__3);
			setState(361);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterInputsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitInputsProperty(this);
		}
	}

	public final InputsPropertyContext inputsProperty() throws RecognitionException {
		InputsPropertyContext _localctx = new InputsPropertyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_inputsProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__23);
			setState(364);
			match(T__3);
			setState(365);
			match(T__4);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(366);
				inputProperty();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterInputProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitInputProperty(this);
		}
	}

	public final InputPropertyContext inputProperty() throws RecognitionException {
		InputPropertyContext _localctx = new InputPropertyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_inputProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			inputName();
			setState(375);
			match(T__3);
			setState(376);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterInputName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitInputName(this);
		}
	}

	public final InputNameContext inputName() throws RecognitionException {
		InputNameContext _localctx = new InputNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_inputName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterInputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitInputValue(this);
		}
	}

	public final InputValueContext inputValue() throws RecognitionException {
		InputValueContext _localctx = new InputValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_inputValue);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitChain(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_chain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			stepId();
			setState(385);
			match(T__10);
			setState(386);
			outputName();
			setState(387);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterSpreadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitSpreadProperty(this);
		}
	}

	public final SpreadPropertyContext spreadProperty() throws RecognitionException {
		SpreadPropertyContext _localctx = new SpreadPropertyContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_spreadProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__24);
			setState(390);
			match(T__3);
			setState(391);
			match(T__4);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(392);
				spreadInputsToSpreadProperty();
				}
			}

			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(395);
				spreadStrategyProperty();
				}
			}

			setState(398);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterSpreadStrategyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitSpreadStrategyProperty(this);
		}
	}

	public final SpreadStrategyPropertyContext spreadStrategyProperty() throws RecognitionException {
		SpreadStrategyPropertyContext _localctx = new SpreadStrategyPropertyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_spreadStrategyProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__25);
			setState(401);
			match(T__3);
			setState(402);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterStrategyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitStrategyValue(this);
		}
	}

	public final StrategyValueContext strategyValue() throws RecognitionException {
		StrategyValueContext _localctx = new StrategyValueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_strategyValue);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				combineStrategy();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterCombineStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitCombineStrategy(this);
		}
	}

	public final CombineStrategyContext combineStrategy() throws RecognitionException {
		CombineStrategyContext _localctx = new CombineStrategyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_combineStrategy);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				oneToOneStrategy();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOneToOneStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOneToOneStrategy(this);
		}
	}

	public final OneToOneStrategyContext oneToOneStrategy() throws RecognitionException {
		OneToOneStrategyContext _localctx = new OneToOneStrategyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_oneToOneStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__26);
			setState(413);
			match(T__27);
			setState(414);
			strategyValue();
			setState(415);
			match(T__11);
			setState(416);
			strategyValue();
			setState(417);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterOneToManyStrategy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitOneToManyStrategy(this);
		}
	}

	public final OneToManyStrategyContext oneToManyStrategy() throws RecognitionException {
		OneToManyStrategyContext _localctx = new OneToManyStrategyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_oneToManyStrategy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__29);
			setState(420);
			match(T__27);
			setState(421);
			strategyValue();
			setState(422);
			match(T__11);
			setState(423);
			strategyValue();
			setState(424);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterSpreadInputsToSpreadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitSpreadInputsToSpreadProperty(this);
		}
	}

	public final SpreadInputsToSpreadPropertyContext spreadInputsToSpreadProperty() throws RecognitionException {
		SpreadInputsToSpreadPropertyContext _localctx = new SpreadInputsToSpreadPropertyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_spreadInputsToSpreadProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__30);
			setState(427);
			match(T__3);
			setState(428);
			match(T__10);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(429);
				inputName();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(430);
					match(T__11);
					setState(431);
					inputName();
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(439);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_value);
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case STRING:
			case BOOLEAN:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				directValue();
				}
				break;
			case T__1:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterIndirectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitIndirectValue(this);
		}
	}

	public final IndirectValueContext indirectValue() throws RecognitionException {
		IndirectValueContext _localctx = new IndirectValueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_indirectValue);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				parameterName();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterDirectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitDirectValue(this);
		}
	}

	public final DirectValueContext directValue() throws RecognitionException {
		DirectValueContext _localctx = new DirectValueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_directValue);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(BOOLEAN);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
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
			if ( listener instanceof PipesListener ) ((PipesListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PipesListener ) ((PipesListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(T__10);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << STRING) | (1L << BOOLEAN) | (1L << NUMBER))) != 0)) {
				{
				setState(456);
				directValue();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(457);
					match(T__11);
					setState(458);
					directValue();
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(466);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u01d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\7\2r\n\2\f\2\16\2u\13\2\3"+
		"\2\5\2x\n\2\3\2\7\2{\n\2\f\2\16\2~\13\2\3\2\5\2\u0081\n\2\3\2\7\2\u0084"+
		"\n\2\f\2\16\2\u0087\13\2\3\2\5\2\u008a\n\2\3\2\7\2\u008d\n\2\f\2\16\2"+
		"\u0090\13\2\3\2\5\2\u0093\n\2\3\2\3\2\3\3\3\3\5\3\u0099\n\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\n\u00b0\n\n\3\n\5\n\u00b3\n\n\3\n\5\n\u00b6\n\n\3\n\5\n\u00b9\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00cf\n\16\f\16\16\16\u00d2\13\16\5\16\u00d4"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00dc\n\17\f\17\16\17\u00df\13"+
		"\17\3\17\3\17\3\20\3\20\5\20\u00e5\n\20\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00ec\n\21\3\21\5\21\u00ef\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00f8\n\22\3\22\5\22\u00fb\n\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u010b\n\26\f\26\16\26\u010e\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\7\32\u011e\n\32\f\32\16\32\u0121\13\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\7"+
		"\37\u0136\n\37\f\37\16\37\u0139\13\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u0142"+
		"\n \3 \5 \u0145\n \3 \5 \u0148\n \3 \5 \u014b\n \3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3\"\5\"\u0155\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0172\n)\f)\16)\u0175\13)\3)\3)\3"+
		"*\3*\3*\3*\3+\3+\3,\3,\5,\u0181\n,\3-\3-\3-\3-\3-\3.\3.\3.\3.\5.\u018c"+
		"\n.\3.\5.\u018f\n.\3.\3.\3/\3/\3/\3/\3\60\3\60\5\60\u0199\n\60\3\61\3"+
		"\61\5\61\u019d\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u01b3\n\64\f\64"+
		"\16\64\u01b6\13\64\5\64\u01b8\n\64\3\64\3\64\3\65\3\65\5\65\u01be\n\65"+
		"\3\66\3\66\5\66\u01c2\n\66\3\67\3\67\3\67\3\67\5\67\u01c8\n\67\38\38\3"+
		"8\38\78\u01ce\n8\f8\168\u01d1\138\58\u01d3\n8\38\38\38\2\29\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjln\2\2\2\u01cb\2s\3\2\2\2\4\u0098\3\2\2\2\6\u009a\3\2\2\2\b\u009e"+
		"\3\2\2\2\n\u00a1\3\2\2\2\f\u00a3\3\2\2\2\16\u00a7\3\2\2\2\20\u00a9\3\2"+
		"\2\2\22\u00ab\3\2\2\2\24\u00bc\3\2\2\2\26\u00c0\3\2\2\2\30\u00c4\3\2\2"+
		"\2\32\u00c8\3\2\2\2\34\u00d7\3\2\2\2\36\u00e4\3\2\2\2 \u00e6\3\2\2\2\""+
		"\u00f2\3\2\2\2$\u00fe\3\2\2\2&\u0100\3\2\2\2(\u0104\3\2\2\2*\u0106\3\2"+
		"\2\2,\u0111\3\2\2\2.\u0115\3\2\2\2\60\u0117\3\2\2\2\62\u0119\3\2\2\2\64"+
		"\u0124\3\2\2\2\66\u0128\3\2\2\28\u012a\3\2\2\2:\u012f\3\2\2\2<\u0131\3"+
		"\2\2\2>\u013c\3\2\2\2@\u014e\3\2\2\2B\u0150\3\2\2\2D\u0156\3\2\2\2F\u015e"+
		"\3\2\2\2H\u0160\3\2\2\2J\u0162\3\2\2\2L\u0167\3\2\2\2N\u0169\3\2\2\2P"+
		"\u016d\3\2\2\2R\u0178\3\2\2\2T\u017c\3\2\2\2V\u0180\3\2\2\2X\u0182\3\2"+
		"\2\2Z\u0187\3\2\2\2\\\u0192\3\2\2\2^\u0198\3\2\2\2`\u019c\3\2\2\2b\u019e"+
		"\3\2\2\2d\u01a5\3\2\2\2f\u01ac\3\2\2\2h\u01bd\3\2\2\2j\u01c1\3\2\2\2l"+
		"\u01c7\3\2\2\2n\u01c9\3\2\2\2pr\5\4\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tw\3\2\2\2us\3\2\2\2vx\5\22\n\2wv\3\2\2\2wx\3\2\2\2x|\3\2\2"+
		"\2y{\5\4\3\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2\177\u0081\5\34\17\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0085\3\2\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\5\62\32\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\u008e\3\2\2\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0093\5<\37\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\2\2\3\u0095\3\3\2\2\2"+
		"\u0096\u0099\5\6\4\2\u0097\u0099\5\f\7\2\u0098\u0096\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\5\3\2\2\2\u009a\u009b\5\b\5\2\u009b\u009c\7\3\2\2\u009c"+
		"\u009d\5\n\6\2\u009d\7\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\"\2\2"+
		"\u00a0\t\3\2\2\2\u00a1\u00a2\5l\67\2\u00a2\13\3\2\2\2\u00a3\u00a4\5\16"+
		"\b\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\20\t\2\u00a6\r\3\2\2\2\u00a7\u00a8"+
		"\7\"\2\2\u00a8\17\3\2\2\2\u00a9\u00aa\5l\67\2\u00aa\21\3\2\2\2\u00ab\u00ac"+
		"\7\5\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\7\7\2\2\u00ae\u00b0\5\24\13\2"+
		"\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3"+
		"\5\26\f\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2"+
		"\u00b4\u00b6\5\30\r\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00b9\5\32\16\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2"+
		"\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\b\2\2\u00bb\23\3\2\2\2\u00bc\u00bd"+
		"\7\t\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7#\2\2\u00bf\25\3\2\2\2\u00c0"+
		"\u00c1\7\n\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c3\7#\2\2\u00c3\27\3\2\2\2"+
		"\u00c4\u00c5\7\13\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\7#\2\2\u00c7\31"+
		"\3\2\2\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00d3\7\r\2\2\u00cb"+
		"\u00d0\7#\2\2\u00cc\u00cd\7\16\2\2\u00cd\u00cf\7#\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\17\2\2\u00d6\33\3\2\2\2\u00d7\u00d8"+
		"\7\20\2\2\u00d8\u00d9\7\6\2\2\u00d9\u00dd\7\r\2\2\u00da\u00dc\5\36\20"+
		"\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\17\2\2"+
		"\u00e1\35\3\2\2\2\u00e2\u00e5\5 \21\2\u00e3\u00e5\5\"\22\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\37\3\2\2\2\u00e6\u00e7\7\21\2\2\u00e7"+
		"\u00e8\5$\23\2\u00e8\u00e9\7\6\2\2\u00e9\u00eb\7\7\2\2\u00ea\u00ec\5&"+
		"\24\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00ef\5*\26\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\b\2\2\u00f1!\3\2\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00f4"+
		"\5$\23\2\u00f4\u00f5\7\6\2\2\u00f5\u00f7\7\7\2\2\u00f6\u00f8\5&\24\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\5*"+
		"\26\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\7\b\2\2\u00fd#\3\2\2\2\u00fe\u00ff\7\"\2\2\u00ff%\3\2\2\2\u0100"+
		"\u0101\7\23\2\2\u0101\u0102\7\6\2\2\u0102\u0103\5(\25\2\u0103\'\3\2\2"+
		"\2\u0104\u0105\7#\2\2\u0105)\3\2\2\2\u0106\u0107\7\24\2\2\u0107\u0108"+
		"\7\6\2\2\u0108\u010c\7\7\2\2\u0109\u010b\5,\27\2\u010a\u0109\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2"+
		"\2\2\u010e\u010c\3\2\2\2\u010f\u0110\7\b\2\2\u0110+\3\2\2\2\u0111\u0112"+
		"\5.\30\2\u0112\u0113\7\6\2\2\u0113\u0114\5\60\31\2\u0114-\3\2\2\2\u0115"+
		"\u0116\7\"\2\2\u0116/\3\2\2\2\u0117\u0118\5h\65\2\u0118\61\3\2\2\2\u0119"+
		"\u011a\7\25\2\2\u011a\u011b\7\6\2\2\u011b\u011f\7\7\2\2\u011c\u011e\5"+
		"\64\33\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7\b"+
		"\2\2\u0123\63\3\2\2\2\u0124\u0125\5\66\34\2\u0125\u0126\7\6\2\2\u0126"+
		"\u0127\58\35\2\u0127\65\3\2\2\2\u0128\u0129\7\"\2\2\u0129\67\3\2\2\2\u012a"+
		"\u012b\5@!\2\u012b\u012c\7\r\2\2\u012c\u012d\5:\36\2\u012d\u012e\7\17"+
		"\2\2\u012e9\3\2\2\2\u012f\u0130\7\"\2\2\u0130;\3\2\2\2\u0131\u0132\7\26"+
		"\2\2\u0132\u0133\7\6\2\2\u0133\u0137\7\r\2\2\u0134\u0136\5> \2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\17\2\2\u013b=\3\2\2\2"+
		"\u013c\u013d\7\27\2\2\u013d\u013e\5@!\2\u013e\u013f\7\6\2\2\u013f\u0141"+
		"\7\7\2\2\u0140\u0142\5B\"\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0144\3\2\2\2\u0143\u0145\5N(\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2"+
		"\2\u0145\u0147\3\2\2\2\u0146\u0148\5P)\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b\5Z.\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\b\2\2\u014d?\3\2\2\2"+
		"\u014e\u014f\7\"\2\2\u014fA\3\2\2\2\u0150\u0151\7\30\2\2\u0151\u0154\7"+
		"\6\2\2\u0152\u0155\5D#\2\u0153\u0155\5J&\2\u0154\u0152\3\2\2\2\u0154\u0153"+
		"\3\2\2\2\u0155C\3\2\2\2\u0156\u0157\5$\23\2\u0157\u0158\7\r\2\2\u0158"+
		"\u0159\5F$\2\u0159\u015a\7\17\2\2\u015a\u015b\7\r\2\2\u015b\u015c\5H%"+
		"\2\u015c\u015d\7\17\2\2\u015dE\3\2\2\2\u015e\u015f\7\"\2\2\u015fG\3\2"+
		"\2\2\u0160\u0161\7\"\2\2\u0161I\3\2\2\2\u0162\u0163\5$\23\2\u0163\u0164"+
		"\7\r\2\2\u0164\u0165\5L\'\2\u0165\u0166\7\17\2\2\u0166K\3\2\2\2\u0167"+
		"\u0168\7\"\2\2\u0168M\3\2\2\2\u0169\u016a\7\31\2\2\u016a\u016b\7\6\2\2"+
		"\u016b\u016c\5h\65\2\u016cO\3\2\2\2\u016d\u016e\7\32\2\2\u016e\u016f\7"+
		"\6\2\2\u016f\u0173\7\7\2\2\u0170\u0172\5R*\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2"+
		"\2\2\u0175\u0173\3\2\2\2\u0176\u0177\7\b\2\2\u0177Q\3\2\2\2\u0178\u0179"+
		"\5T+\2\u0179\u017a\7\6\2\2\u017a\u017b\5V,\2\u017bS\3\2\2\2\u017c\u017d"+
		"\7\"\2\2\u017dU\3\2\2\2\u017e\u0181\5h\65\2\u017f\u0181\5X-\2\u0180\u017e"+
		"\3\2\2\2\u0180\u017f\3\2\2\2\u0181W\3\2\2\2\u0182\u0183\5@!\2\u0183\u0184"+
		"\7\r\2\2\u0184\u0185\5:\36\2\u0185\u0186\7\17\2\2\u0186Y\3\2\2\2\u0187"+
		"\u0188\7\33\2\2\u0188\u0189\7\6\2\2\u0189\u018b\7\7\2\2\u018a\u018c\5"+
		"f\64\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018f\5\\/\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0191\7\b\2\2\u0191[\3\2\2\2\u0192\u0193\7\34\2\2\u0193\u0194"+
		"\7\6\2\2\u0194\u0195\5`\61\2\u0195]\3\2\2\2\u0196\u0199\5`\61\2\u0197"+
		"\u0199\5T+\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u0199_\3\2\2\2\u019a"+
		"\u019d\5b\62\2\u019b\u019d\5d\63\2\u019c\u019a\3\2\2\2\u019c\u019b\3\2"+
		"\2\2\u019da\3\2\2\2\u019e\u019f\7\35\2\2\u019f\u01a0\7\36\2\2\u01a0\u01a1"+
		"\5^\60\2\u01a1\u01a2\7\16\2\2\u01a2\u01a3\5^\60\2\u01a3\u01a4\7\37\2\2"+
		"\u01a4c\3\2\2\2\u01a5\u01a6\7 \2\2\u01a6\u01a7\7\36\2\2\u01a7\u01a8\5"+
		"^\60\2\u01a8\u01a9\7\16\2\2\u01a9\u01aa\5^\60\2\u01aa\u01ab\7\37\2\2\u01ab"+
		"e\3\2\2\2\u01ac\u01ad\7!\2\2\u01ad\u01ae\7\6\2\2\u01ae\u01b7\7\r\2\2\u01af"+
		"\u01b4\5T+\2\u01b0\u01b1\7\16\2\2\u01b1\u01b3\5T+\2\u01b2\u01b0\3\2\2"+
		"\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b8"+
		"\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\7\17\2\2\u01bag\3\2\2\2\u01bb\u01be\5l\67\2"+
		"\u01bc\u01be\5j\66\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2\2\2\u01bei\3"+
		"\2\2\2\u01bf\u01c2\5\b\5\2\u01c0\u01c2\5\16\b\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2k\3\2\2\2\u01c3\u01c8\7#\2\2\u01c4\u01c8\7%\2\2\u01c5"+
		"\u01c8\7$\2\2\u01c6\u01c8\5n8\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8m\3\2\2\2\u01c9\u01d2"+
		"\7\r\2\2\u01ca\u01cf\5l\67\2\u01cb\u01cc\7\16\2\2\u01cc\u01ce\5l\67\2"+
		"\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01ca\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\7\17\2\2\u01d5o\3\2\2\2"+
		",sw|\u0080\u0085\u0089\u008e\u0092\u0098\u00af\u00b2\u00b5\u00b8\u00d0"+
		"\u00d3\u00dd\u00e4\u00eb\u00ee\u00f7\u00fa\u010c\u011f\u0137\u0141\u0144"+
		"\u0147\u014a\u0154\u0173\u0180\u018b\u018e\u0198\u019c\u01b4\u01b7\u01bd"+
		"\u01c1\u01c7\u01cf\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}