package pt.isel.ngspipes.dsl_parser.domain.service.read;

import pt.isel.ngspipes.dsl_parser.domain.antlr.PipesParser;
import pt.isel.ngspipes.dsl_parser.domain.service.read.output.OutputReader;
import pt.isel.ngspipes.dsl_parser.domain.service.read.parameter.ParameterReader;
import pt.isel.ngspipes.dsl_parser.domain.service.read.repository.RepositoryReader;
import pt.isel.ngspipes.dsl_parser.domain.service.read.step.StepReader;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.PipelineDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.step.IStepDescriptor;

import java.util.Collection;

public class PipelineReader {

    private ParameterReader parameterReader = new ParameterReader();
    private OutputReader outputReader = new OutputReader();
    private RepositoryReader repositoryReader = new RepositoryReader();
    private StepReader stepReader = new StepReader();



    public IPipelineDescriptor parse(PipesParser.RootContext context) throws ParserException {
        Collection<IParameterDescriptor> parameters = parseParameters(context);
        Collection<IOutputDescriptor> outputs = parseOutputs(context);
        Collection<IRepositoryDescriptor> repositories = parseRepositories(context);
        Collection<IStepDescriptor> steps = parseSteps(context);

        return new PipelineDescriptor(null, null, null, null, null, null, parameters, outputs, repositories, steps);
    }

    private Collection<IOutputDescriptor> parseOutputs(PipesParser.RootContext context) {
        return outputReader.parse(context.outputs().output());
    }

    private Collection<IRepositoryDescriptor> parseRepositories(PipesParser.RootContext context) throws ParserException {
        return repositoryReader.parse(context.repositories().repository(), context);
    }

    private Collection<IParameterDescriptor> parseParameters(PipesParser.RootContext context) throws ParserException {
        return parameterReader.parse(context);
    }

    private Collection<IStepDescriptor> parseSteps(PipesParser.RootContext context) throws ParserException {
        return stepReader.parse(context.steps().step(), context);
    }

}
