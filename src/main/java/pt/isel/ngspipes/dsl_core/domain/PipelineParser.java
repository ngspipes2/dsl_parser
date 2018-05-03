package pt.isel.ngspipes.dsl_core.domain;

import pt.isel.ngspipes.dsl_core.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_core.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.PipelineDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;

import java.util.Collection;

public class PipelineParser {

    private ParameterParser parameterParser = new ParameterParser();
    private OutputParser outputParser = new OutputParser();
    private RepositoryParser repositoryParser = new RepositoryParser();
    private StepParser stepParser = new StepParser();



    public IPipelineDescriptor parse(PipesParser.RootContext context) throws ParserException {
        Collection<IParameterDescriptor> parameters = parseParameters(context);
        Collection<IOutputDescriptor> outputs = parseOutputs(context);
        Collection<IRepositoryDescriptor> repositories = parseRepositories(context);
        Collection<IStepDescriptor> steps = parseSteps(context);

        return new PipelineDescriptor(null, null, null, null, null, null, parameters, outputs, repositories, steps);
    }

    private Collection<IOutputDescriptor> parseOutputs(PipesParser.RootContext context) {
        return outputParser.parseAll(context.outputs().output());
    }

    private Collection<IRepositoryDescriptor> parseRepositories(PipesParser.RootContext context) throws ParserException {
        return repositoryParser.parseAll(context.repositories().repository(), context);
    }

    private Collection<IParameterDescriptor> parseParameters(PipesParser.RootContext context) throws ParserException {
        return parameterParser.parseAll(context);
    }

    private Collection<IStepDescriptor> parseSteps(PipesParser.RootContext context) throws ParserException {
        return stepParser.parseAll(context.steps().step(), context);
    }

}
