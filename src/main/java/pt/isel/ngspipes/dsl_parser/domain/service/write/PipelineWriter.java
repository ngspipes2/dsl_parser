package pt.isel.ngspipes.dsl_parser.domain.service.write;

import pt.isel.ngspipes.dsl_parser.domain.service.write.output.OutputWriter;
import pt.isel.ngspipes.dsl_parser.domain.service.write.parameter.ParameterWriter;
import pt.isel.ngspipes.dsl_parser.domain.service.write.property.PropertyWriter;
import pt.isel.ngspipes.dsl_parser.domain.service.write.repository.RepositoryWriter;
import pt.isel.ngspipes.dsl_parser.domain.service.write.step.StepWriter;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

public class PipelineWriter {

    private PropertyWriter propertyWriter = new PropertyWriter();
    private ParameterWriter parameterWriter = new ParameterWriter();
    private RepositoryWriter repositoryWriter = new RepositoryWriter();
    private OutputWriter outputWriter = new OutputWriter();
    private StepWriter stepWriter = new StepWriter();



    public String getAsString(IPipelineDescriptor pipelineDescriptor) throws ParserException {
        if(pipelineDescriptor == null)
            throw new IllegalArgumentException("PipelineDescriptor cannot be null!");

        StringBuilder sb = new StringBuilder();

        String properties = getPropertiesAsString(pipelineDescriptor);
        String parameters = getParametersAsString(pipelineDescriptor);
        String repositories = getRepositoriesAsString(pipelineDescriptor);
        String outputs = getOutputsAsString(pipelineDescriptor);
        String steps = getStepsAsString(pipelineDescriptor);

        sb.append(properties).append("\n\n");
        sb.append(parameters).append("\n\n");
        sb.append(repositories).append("\n\n");
        sb.append(outputs).append("\n\n");
        sb.append(steps);

        return sb.toString();
    }

    private String getPropertiesAsString(IPipelineDescriptor pipelineDescriptor) {
        return propertyWriter.getAsString(pipelineDescriptor);
    }

    private String getParametersAsString(IPipelineDescriptor pipelineDescriptor) {
        return parameterWriter.getAsString(pipelineDescriptor.getParameters());
    }

    private String getRepositoriesAsString(IPipelineDescriptor pipelineDescriptor) throws ParserException {
        return repositoryWriter.getAsString(pipelineDescriptor.getRepositories());
    }

    private String getOutputsAsString(IPipelineDescriptor pipelineDescriptor) {
        return outputWriter.getAsString(pipelineDescriptor.getOutputs());
    }

    private String getStepsAsString(IPipelineDescriptor pipelineDescriptor) throws ParserException {
        return stepWriter.getAsString(pipelineDescriptor.getSteps());
    }

}
