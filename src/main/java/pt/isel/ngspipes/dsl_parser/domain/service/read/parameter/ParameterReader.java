package pt.isel.ngspipes.dsl_parser.domain.service.read.parameter;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.repository.RepositoryReader;
import pt.isel.ngspipes.dsl_parser.domain.service.read.step.StepReader;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.ParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IParameterValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IInputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.input.IParameterInputDescriptor;

import java.util.Collection;
import java.util.LinkedList;

public class ParameterReader {

    private RepositoryReader repositoryService = new RepositoryReader();
    private StepReader stepService = new StepReader();



    public Collection<IParameterDescriptor> parse(PipesParser.RootContext context) throws ParserException {
        if(context == null)
            throw new IllegalArgumentException("Context cannot be null!");

        Collection<IParameterDescriptor> declaredParameters = parseDeclaredParameters(context);
        Collection<IParameterDescriptor> notDeclaredParameters = parseNotDeclaredParameters(context);

        Collection<IParameterDescriptor> parameters = new LinkedList<>();
        parameters.addAll(declaredParameters);
        parameters.addAll(notDeclaredParameters);

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

    private Collection<IParameterDescriptor> parseNotDeclaredParameters(PipesParser.RootContext context) throws ParserException {
        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        parameters.addAll(parseNotDeclaredRepositoryParameters(context));
        parameters.addAll(parseNotDeclaredStepsParameters(context));

        return parameters;
    }

    private Collection<IParameterDescriptor> parseNotDeclaredRepositoryParameters(PipesParser.RootContext context) throws ParserException {
        Collection<IRepositoryDescriptor> repositoriesDescriptor = repositoryService.parse(context.repositories().repository(), context);

        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        IParameterValueDescriptor parameterValueDescriptor;
        String parameterName;
        for(IRepositoryDescriptor repositoryDescriptor : repositoriesDescriptor) {
            for(IValueDescriptor valueDescriptor : repositoryDescriptor.getConfiguration().values()) {
                if(valueDescriptor instanceof IParameterValueDescriptor) {
                    parameterValueDescriptor = (IParameterValueDescriptor) valueDescriptor;
                    parameterName = parameterValueDescriptor.getParameterName();

                    if(!isDeclared(context, parameterName))
                        parameters.add(new ParameterDescriptor(parameterName,null));
                }
            }
        }

        return parameters;
    }

    private Collection<IParameterDescriptor> parseNotDeclaredStepsParameters(PipesParser.RootContext context) throws ParserException {
        Collection<IStepDescriptor> stepsDescriptor = stepService.parse(context.steps().step(), context);

        Collection<IParameterDescriptor> parameters = new LinkedList<>();

        IParameterValueDescriptor parameterValueDescriptor;
        IParameterInputDescriptor parameterInputDescriptor;
        String parameterName;
        for(IStepDescriptor stepDescriptor : stepsDescriptor) {

            if(stepDescriptor.getExecutionContext() instanceof IParameterValueDescriptor) {
                parameterValueDescriptor = (IParameterValueDescriptor) stepDescriptor.getExecutionContext();
                parameterName = parameterValueDescriptor.getParameterName();

                if(!isDeclared(context, parameterName))
                    parameters.add(new ParameterDescriptor(parameterName,null));
            }

            for(IInputDescriptor inputDescriptor : stepDescriptor.getInputs()) {
                if(inputDescriptor instanceof IParameterInputDescriptor) {
                    parameterInputDescriptor = (IParameterInputDescriptor) inputDescriptor;
                    parameterName = parameterInputDescriptor.getParameterName();

                    if(!isDeclared(context, parameterName))
                        parameters.add(new ParameterDescriptor(parameterName,null));
                }
            }

        }

        return parameters;
    }

    private static boolean isDeclared(PipesParser.RootContext context, String parameterName) {
        if(context.valueDeclaration() == null)
            return false;

        for(PipesParser.ValueDeclarationContext valueDeclarationContext : context.valueDeclaration()){
            if(valueDeclarationContext.parameterDeclaration() != null) {
                PipesParser.ParameterDeclarationContext parameterDeclarationContext = valueDeclarationContext.parameterDeclaration();
                String name = parameterDeclarationContext.parameterName().ID().getText();

                if(name.equals(parameterName))
                    return true;
            }
        }

        return false;
    }

}
