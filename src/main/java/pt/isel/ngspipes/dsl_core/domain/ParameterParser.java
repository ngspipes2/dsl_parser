package pt.isel.ngspipes.dsl_core.domain;

import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.ParameterDescriptor;

import java.util.Collection;
import java.util.LinkedList;

public class ParameterParser {

    public Collection<IParameterDescriptor> parseAll(PipesParser.RootContext context) throws ParserException {
        Collection<IParameterDescriptor> declaredParameters = parseDeclaredParameters(context);
        Collection<IParameterDescriptor> notDeclaredParameters = parseNotDeclaredParameters(context);

        Collection<IParameterDescriptor> parameters = new LinkedList<>();
        parameters.addAll(declaredParameters);

        boolean present;
        for(IParameterDescriptor notDeclaredParameter : notDeclaredParameters) {
            present = false;

            for(IParameterDescriptor declaredParameter : declaredParameters) {
                if(declaredParameter.getName().equals(notDeclaredParameter.getName())) {
                    present = true;
                    break;
                }
            }

            if(!present)
                parameters.add(notDeclaredParameter);
        }

        return parameters;
    }

    private Collection<IParameterDescriptor> parseDeclaredParameters(PipesParser.RootContext context) throws ParserException {
        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        PipesParser.ParameterDeclarationContext parameterDeclarationContext;
        String parameterName;
        Object defaultValue;
        for(PipesParser.ValueDeclarationContext valueDeclarationContext : context.valueDeclaration()) {
            if(valueDeclarationContext.parameterDeclaration() != null) {
                parameterDeclarationContext = valueDeclarationContext.parameterDeclaration();
                parameterName = parameterDeclarationContext.parameterName().ID().getText();
                defaultValue = ParserUtils.parseDirectValue(parameterDeclarationContext.parameterValue().directValue());

                parameters.add(new ParameterDescriptor(parameterName, defaultValue));
            }
        }

        return parameters;
    }

    private Collection<IParameterDescriptor> parseNotDeclaredParameters(PipesParser.RootContext context) {
        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        parameters.addAll(parseNotDeclaredRepositoryParameters(context));
        parameters.addAll(parseNotDeclaredStepsParameters(context));

        return parameters;
    }

    private Collection<IParameterDescriptor> parseNotDeclaredRepositoryParameters(PipesParser.RootContext context) {
        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        PipesParser.ValueContext valueContext;
        String parameterName;
        for(PipesParser.RepositoryContext repository : context.repositories().repository()){
            if(repository.toolRepository() != null && repository.toolRepository().configProperty()!= null) {
                for(PipesParser.ConfigContext config : repository.toolRepository().configProperty().config()) {
                    valueContext = config.configValue().value();

                    if(valueContext.indirectValue() != null) {
                        if(valueContext.indirectValue().parameterName() != null) {
                            parameterName = valueContext.indirectValue().parameterName().ID().getText();
                            parameters.add(new ParameterDescriptor(parameterName,null));
                        }
                    }
                }
            }

            if(repository.pipelineRepository() != null && repository.pipelineRepository().configProperty()!= null) {
                for(PipesParser.ConfigContext config : repository.pipelineRepository().configProperty().config()) {
                    valueContext = config.configValue().value();

                    if(valueContext.indirectValue() != null) {
                        if(valueContext.indirectValue().parameterName() != null) {
                            parameterName = valueContext.indirectValue().parameterName().ID().getText();
                            parameters.add(new ParameterDescriptor(parameterName,null));
                        }
                    }
                }
            }
        }

        return parameters;
    }

    private Collection<IParameterDescriptor> parseNotDeclaredStepsParameters(PipesParser.RootContext context) {
        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        String parameterName;
        for(PipesParser.StepContext step : context.steps().step()) {
            if(step.executionContextProperty().value().indirectValue() != null) {
                if(step.executionContextProperty().value().indirectValue().parameterName() != null){
                    parameterName = step.executionContextProperty().value().indirectValue().parameterName().ID().getText();
                    parameters.add(new ParameterDescriptor(parameterName, null));
                }
            }

            if(step.inputsProperty() != null) {
                for(PipesParser.InputPropertyContext input : step.inputsProperty().inputProperty()) {
                    if(input.inputValue().value() != null)
                        if(input.inputValue().value().indirectValue() != null)
                            if(input.inputValue().value().indirectValue().parameterName() != null) {
                                parameterName = input.inputValue().value().indirectValue().parameterName().ID().getText();
                                parameters.add(new ParameterDescriptor(parameterName, null));
                            }
                }
            }
        }

        return parameters;
    }

}
