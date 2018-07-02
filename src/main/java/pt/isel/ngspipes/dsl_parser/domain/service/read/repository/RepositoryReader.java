package pt.isel.ngspipes.dsl_parser.domain.service.read.repository;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.*;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.ParameterValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.SimpleValueDescriptor;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RepositoryReader {

    public Collection<IRepositoryDescriptor> parse(PipesParser.RepositoriesContext repositoriesContext, PipesParser.RootContext context) throws ParserException {
        if(repositoriesContext == null)
            return new LinkedList<>();

        return parse(repositoriesContext.repository(), context);
    }

    public Collection<IRepositoryDescriptor> parse(Collection<PipesParser.RepositoryContext> repositoriesContext, PipesParser.RootContext context) throws ParserException {
        if(context == null)
            throw new IllegalArgumentException("Context cannot be null!");

        if(repositoriesContext == null)
            return new LinkedList<>();

        Collection<IRepositoryDescriptor> repositoriesDescriptor = new LinkedList<>();

        for(PipesParser.RepositoryContext repositoryContext : repositoriesContext)
            repositoriesDescriptor.add(parse(repositoryContext, context));

        return repositoriesDescriptor;
    }

    public IRepositoryDescriptor parse(PipesParser.RepositoryContext repositoryContext, PipesParser.RootContext context) throws ParserException {
        if(repositoryContext == null || context == null)
            throw new IllegalArgumentException("Neither repositoryContext nor context can be null!");

        if(repositoryContext.toolRepository() != null)
            return parseToolRepository(context, repositoryContext.toolRepository());

        if(repositoryContext.pipelineRepository() != null)
            return parsePipelineRepository(context, repositoryContext.pipelineRepository());

        throw new ParserException("Unknown repository type. Repository must be of type tool or pipeline!");
    }

    private IToolRepositoryDescriptor parseToolRepository(PipesParser.RootContext context, PipesParser.ToolRepositoryContext toolRepositoryContext) throws ParserException {
        String id = toolRepositoryContext.repositoryId().ID().getText();
        String location = null;

        if(toolRepositoryContext.locationProperty() != null)
            location = ParserUtils.trimQuotes(toolRepositoryContext.locationProperty().locationValue().STRING().getText());

        Map<String, IValueDescriptor> config = parseConfig(context, toolRepositoryContext.configProperty());

        return new ToolRepositoryDescriptor(id, location, config);
    }

    private IPipelineRepositoryDescriptor parsePipelineRepository(PipesParser.RootContext context, PipesParser.PipelineRepositoryContext pipelineRepositoryContext) throws ParserException {
        String id = pipelineRepositoryContext.repositoryId().ID().getText();
        String location = null;

        if(pipelineRepositoryContext.locationProperty() != null)
            location = ParserUtils.trimQuotes(pipelineRepositoryContext.locationProperty().locationValue().STRING().getText());

        Map<String, IValueDescriptor> config = parseConfig(context, pipelineRepositoryContext.configProperty());

        return new PipelineRepositoryDescriptor(id, location, config);
    }

    private Map<String, IValueDescriptor> parseConfig(PipesParser.RootContext context, PipesParser.ConfigPropertyContext configPropertyContext) throws ParserException {
        if(configPropertyContext == null)
            return new HashMap<>();

        Map<String, IValueDescriptor> config = new HashMap<>();

        String configName;
        IValueDescriptor configValue;
        for(PipesParser.ConfigContext configContext : configPropertyContext.config()) {
            configName = configContext.configName().ID().getText();
            configValue = parseConfigValue(configContext.configValue(), context);

            config.put(configName, configValue);
        }

        return config;
    }

    private IValueDescriptor parseConfigValue(PipesParser.ConfigValueContext configValueContext, PipesParser.RootContext context) throws ParserException {
        if(configValueContext.value().directValue() != null)
            return parseConfigDirectValue(configValueContext.value().directValue(), context);

        if(configValueContext.value().indirectValue() != null)
            return parseConfigIndirectValue(configValueContext.value().indirectValue(), context);

        throw new ParserException("Invalid ConfigValue. Value must be direct or indirect type!");
    }

    private IValueDescriptor parseConfigDirectValue(PipesParser.DirectValueContext directValueContext, PipesParser.RootContext context) throws ParserException {
        return new SimpleValueDescriptor(ParserUtils.parseDirectValue(directValueContext));
    }

    private IValueDescriptor parseConfigIndirectValue(PipesParser.IndirectValueContext indirectValueContext, PipesParser.RootContext context) throws ParserException {
        if(indirectValueContext.parameterName() != null)
            return parseParameterValue(indirectValueContext.parameterName(), context);

        if(indirectValueContext.variableName() != null)
            return parseVariableValue(indirectValueContext.variableName(), context);

        throw new ParserException("Invalid ConfigIndirectValue. IndirectValue must be a variable or a parameter!");
    }

    private IValueDescriptor parseParameterValue(PipesParser.ParameterNameContext parameterNameContext, PipesParser.RootContext context) {
        String parameterName = parameterNameContext.ID().getText();
        return new ParameterValueDescriptor(parameterName);
    }

    private IValueDescriptor parseVariableValue(PipesParser.VariableNameContext variableNameContext, PipesParser.RootContext context) throws ParserException {
        String variableName = variableNameContext.ID().getText();
        Object variableValue = ParserUtils.getVariableValue(context.valueDeclaration(), variableName);
        return new SimpleValueDescriptor(variableValue);
    }

}
