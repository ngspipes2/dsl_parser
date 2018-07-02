package pt.isel.ngspipes.dsl_parser.domain.service.write.output;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.pipeline_descriptor.output.IOutputDescriptor;

import java.util.Collection;

public class OutputWriter {

    public String getAsString(Collection<IOutputDescriptor> outputs) {
        String outputContent = getOutputsContent(outputs);

        return "Outputs : " + outputContent;
    }

    private String getOutputsContent(Collection<IOutputDescriptor> outputs) {
        if(outputs == null || outputs.isEmpty())
            return "{ }";

        StringBuilder sb = new StringBuilder("{\n");

        String outputStr;
        for(IOutputDescriptor output : outputs) {
            outputStr = getAsString(output);
            outputStr = ParserUtils.indent(outputStr, 1);
            sb.append(outputStr).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

    public String getAsString(IOutputDescriptor output) {
        if(output == null)
            throw new IllegalArgumentException("Output cannot be null!");

        String name = output.getName();
        String stepId = output.getStepId();
        String outputName = output.getOutputName();

        return name + " : " + stepId + "[" + outputName + "]";
    }

}
