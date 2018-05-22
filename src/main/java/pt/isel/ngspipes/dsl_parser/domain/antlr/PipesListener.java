package pt.isel.ngspipes.dsl_parser.domain.antlr;// Generated from Pipes.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PipesParser}.
 */
public interface PipesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PipesParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PipesParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PipesParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterValueDeclaration(PipesParser.ValueDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#valueDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitValueDeclaration(PipesParser.ValueDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(PipesParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(PipesParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(PipesParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(PipesParser.ParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#parameterValue}.
	 * @param ctx the parse tree
	 */
	void enterParameterValue(PipesParser.ParameterValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#parameterValue}.
	 * @param ctx the parse tree
	 */
	void exitParameterValue(PipesParser.ParameterValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PipesParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PipesParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(PipesParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(PipesParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(PipesParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(PipesParser.VariableValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(PipesParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(PipesParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#authorProperty}.
	 * @param ctx the parse tree
	 */
	void enterAuthorProperty(PipesParser.AuthorPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#authorProperty}.
	 * @param ctx the parse tree
	 */
	void exitAuthorProperty(PipesParser.AuthorPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#descriptionProperty}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionProperty(PipesParser.DescriptionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#descriptionProperty}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionProperty(PipesParser.DescriptionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#versionProperty}.
	 * @param ctx the parse tree
	 */
	void enterVersionProperty(PipesParser.VersionPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#versionProperty}.
	 * @param ctx the parse tree
	 */
	void exitVersionProperty(PipesParser.VersionPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#documentationProperty}.
	 * @param ctx the parse tree
	 */
	void enterDocumentationProperty(PipesParser.DocumentationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#documentationProperty}.
	 * @param ctx the parse tree
	 */
	void exitDocumentationProperty(PipesParser.DocumentationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#repositories}.
	 * @param ctx the parse tree
	 */
	void enterRepositories(PipesParser.RepositoriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#repositories}.
	 * @param ctx the parse tree
	 */
	void exitRepositories(PipesParser.RepositoriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#repository}.
	 * @param ctx the parse tree
	 */
	void enterRepository(PipesParser.RepositoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#repository}.
	 * @param ctx the parse tree
	 */
	void exitRepository(PipesParser.RepositoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#toolRepository}.
	 * @param ctx the parse tree
	 */
	void enterToolRepository(PipesParser.ToolRepositoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#toolRepository}.
	 * @param ctx the parse tree
	 */
	void exitToolRepository(PipesParser.ToolRepositoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#pipelineRepository}.
	 * @param ctx the parse tree
	 */
	void enterPipelineRepository(PipesParser.PipelineRepositoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#pipelineRepository}.
	 * @param ctx the parse tree
	 */
	void exitPipelineRepository(PipesParser.PipelineRepositoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#repositoryId}.
	 * @param ctx the parse tree
	 */
	void enterRepositoryId(PipesParser.RepositoryIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#repositoryId}.
	 * @param ctx the parse tree
	 */
	void exitRepositoryId(PipesParser.RepositoryIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#locationProperty}.
	 * @param ctx the parse tree
	 */
	void enterLocationProperty(PipesParser.LocationPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#locationProperty}.
	 * @param ctx the parse tree
	 */
	void exitLocationProperty(PipesParser.LocationPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#locationValue}.
	 * @param ctx the parse tree
	 */
	void enterLocationValue(PipesParser.LocationValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#locationValue}.
	 * @param ctx the parse tree
	 */
	void exitLocationValue(PipesParser.LocationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#configProperty}.
	 * @param ctx the parse tree
	 */
	void enterConfigProperty(PipesParser.ConfigPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#configProperty}.
	 * @param ctx the parse tree
	 */
	void exitConfigProperty(PipesParser.ConfigPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(PipesParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(PipesParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#configName}.
	 * @param ctx the parse tree
	 */
	void enterConfigName(PipesParser.ConfigNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#configName}.
	 * @param ctx the parse tree
	 */
	void exitConfigName(PipesParser.ConfigNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#configValue}.
	 * @param ctx the parse tree
	 */
	void enterConfigValue(PipesParser.ConfigValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#configValue}.
	 * @param ctx the parse tree
	 */
	void exitConfigValue(PipesParser.ConfigValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(PipesParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(PipesParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(PipesParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(PipesParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#outputId}.
	 * @param ctx the parse tree
	 */
	void enterOutputId(PipesParser.OutputIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#outputId}.
	 * @param ctx the parse tree
	 */
	void exitOutputId(PipesParser.OutputIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#outputValue}.
	 * @param ctx the parse tree
	 */
	void enterOutputValue(PipesParser.OutputValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#outputValue}.
	 * @param ctx the parse tree
	 */
	void exitOutputValue(PipesParser.OutputValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#outputName}.
	 * @param ctx the parse tree
	 */
	void enterOutputName(PipesParser.OutputNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#outputName}.
	 * @param ctx the parse tree
	 */
	void exitOutputName(PipesParser.OutputNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#steps}.
	 * @param ctx the parse tree
	 */
	void enterSteps(PipesParser.StepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#steps}.
	 * @param ctx the parse tree
	 */
	void exitSteps(PipesParser.StepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#step}.
	 * @param ctx the parse tree
	 */
	void enterStep(PipesParser.StepContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#step}.
	 * @param ctx the parse tree
	 */
	void exitStep(PipesParser.StepContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#stepId}.
	 * @param ctx the parse tree
	 */
	void enterStepId(PipesParser.StepIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#stepId}.
	 * @param ctx the parse tree
	 */
	void exitStepId(PipesParser.StepIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#execProperty}.
	 * @param ctx the parse tree
	 */
	void enterExecProperty(PipesParser.ExecPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#execProperty}.
	 * @param ctx the parse tree
	 */
	void exitExecProperty(PipesParser.ExecPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#commandReference}.
	 * @param ctx the parse tree
	 */
	void enterCommandReference(PipesParser.CommandReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#commandReference}.
	 * @param ctx the parse tree
	 */
	void exitCommandReference(PipesParser.CommandReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#toolName}.
	 * @param ctx the parse tree
	 */
	void enterToolName(PipesParser.ToolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#toolName}.
	 * @param ctx the parse tree
	 */
	void exitToolName(PipesParser.ToolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#commandName}.
	 * @param ctx the parse tree
	 */
	void enterCommandName(PipesParser.CommandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#commandName}.
	 * @param ctx the parse tree
	 */
	void exitCommandName(PipesParser.CommandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#pipelineReference}.
	 * @param ctx the parse tree
	 */
	void enterPipelineReference(PipesParser.PipelineReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#pipelineReference}.
	 * @param ctx the parse tree
	 */
	void exitPipelineReference(PipesParser.PipelineReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#pipelineName}.
	 * @param ctx the parse tree
	 */
	void enterPipelineName(PipesParser.PipelineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#pipelineName}.
	 * @param ctx the parse tree
	 */
	void exitPipelineName(PipesParser.PipelineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#executionContextProperty}.
	 * @param ctx the parse tree
	 */
	void enterExecutionContextProperty(PipesParser.ExecutionContextPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#executionContextProperty}.
	 * @param ctx the parse tree
	 */
	void exitExecutionContextProperty(PipesParser.ExecutionContextPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#inputsProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputsProperty(PipesParser.InputsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#inputsProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputsProperty(PipesParser.InputsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#inputProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputProperty(PipesParser.InputPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#inputProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputProperty(PipesParser.InputPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#inputName}.
	 * @param ctx the parse tree
	 */
	void enterInputName(PipesParser.InputNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#inputName}.
	 * @param ctx the parse tree
	 */
	void exitInputName(PipesParser.InputNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#inputValue}.
	 * @param ctx the parse tree
	 */
	void enterInputValue(PipesParser.InputValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#inputValue}.
	 * @param ctx the parse tree
	 */
	void exitInputValue(PipesParser.InputValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#chain}.
	 * @param ctx the parse tree
	 */
	void enterChain(PipesParser.ChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#chain}.
	 * @param ctx the parse tree
	 */
	void exitChain(PipesParser.ChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#spreadProperty}.
	 * @param ctx the parse tree
	 */
	void enterSpreadProperty(PipesParser.SpreadPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#spreadProperty}.
	 * @param ctx the parse tree
	 */
	void exitSpreadProperty(PipesParser.SpreadPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#spreadStrategyProperty}.
	 * @param ctx the parse tree
	 */
	void enterSpreadStrategyProperty(PipesParser.SpreadStrategyPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#spreadStrategyProperty}.
	 * @param ctx the parse tree
	 */
	void exitSpreadStrategyProperty(PipesParser.SpreadStrategyPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#strategyValue}.
	 * @param ctx the parse tree
	 */
	void enterStrategyValue(PipesParser.StrategyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#strategyValue}.
	 * @param ctx the parse tree
	 */
	void exitStrategyValue(PipesParser.StrategyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#combineStrategy}.
	 * @param ctx the parse tree
	 */
	void enterCombineStrategy(PipesParser.CombineStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#combineStrategy}.
	 * @param ctx the parse tree
	 */
	void exitCombineStrategy(PipesParser.CombineStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#oneToOneStrategy}.
	 * @param ctx the parse tree
	 */
	void enterOneToOneStrategy(PipesParser.OneToOneStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#oneToOneStrategy}.
	 * @param ctx the parse tree
	 */
	void exitOneToOneStrategy(PipesParser.OneToOneStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#oneToManyStrategy}.
	 * @param ctx the parse tree
	 */
	void enterOneToManyStrategy(PipesParser.OneToManyStrategyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#oneToManyStrategy}.
	 * @param ctx the parse tree
	 */
	void exitOneToManyStrategy(PipesParser.OneToManyStrategyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#spreadInputsToSpreadProperty}.
	 * @param ctx the parse tree
	 */
	void enterSpreadInputsToSpreadProperty(PipesParser.SpreadInputsToSpreadPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#spreadInputsToSpreadProperty}.
	 * @param ctx the parse tree
	 */
	void exitSpreadInputsToSpreadProperty(PipesParser.SpreadInputsToSpreadPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(PipesParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(PipesParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#indirectValue}.
	 * @param ctx the parse tree
	 */
	void enterIndirectValue(PipesParser.IndirectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#indirectValue}.
	 * @param ctx the parse tree
	 */
	void exitIndirectValue(PipesParser.IndirectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#directValue}.
	 * @param ctx the parse tree
	 */
	void enterDirectValue(PipesParser.DirectValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#directValue}.
	 * @param ctx the parse tree
	 */
	void exitDirectValue(PipesParser.DirectValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PipesParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PipesParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PipesParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PipesParser.ArrayContext ctx);
}