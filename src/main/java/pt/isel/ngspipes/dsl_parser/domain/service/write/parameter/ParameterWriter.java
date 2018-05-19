package pt.isel.ngspipes.dsl_parser.domain.service.write.parameter;

import pt.isel.ngspipes.pipeline_descriptor.parameter.IParameterDescriptor;

import java.util.Collection;

public class ParameterWriter {

    public String getAsString(Collection<IParameterDescriptor> parameters) {
        if(parameters == null)
            throw new IllegalArgumentException("Parameters cannot be null!");

        StringBuilder sb = new StringBuilder();

        for(IParameterDescriptor parameter : parameters)
            if(parameter.getDefaultValue() != null)
                sb.append(getAsString(parameter)).append("\n");

        return sb.toString().trim();
    }

    public String getAsString(IParameterDescriptor parameter) {
        if(parameter == null)
            throw new IllegalArgumentException("Parameter cannot be null!");

        String value;
        if(parameter.getDefaultValue() instanceof String)
            value = "\"" + parameter.getDefaultValue().toString() + "\"";
        else
            value = parameter.getDefaultValue().toString();

        return parameter.getName() + " = " + value;
    }

}
