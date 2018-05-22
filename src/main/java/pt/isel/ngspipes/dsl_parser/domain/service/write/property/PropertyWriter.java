package pt.isel.ngspipes.dsl_parser.domain.service.write.property;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

public class PropertyWriter {

    public String getAsString(IPipelineDescriptor pipeline) {
        if(pipeline == null)
            throw new IllegalArgumentException("Pipeline cannot be null!");

        String propertiesContent = getPropertiesContent(pipeline);

        return "Properties : " + propertiesContent;
    }

    private String getPropertiesContent(IPipelineDescriptor pipeline) {
        if( pipeline.getAuthor() == null &&
            pipeline.getDescription() == null &&
            pipeline.getVersion() == null &&
            (pipeline.getDocumentation() == null || (pipeline.getDocumentation() != null && pipeline.getDocumentation().isEmpty())))
            return "{ }";

        StringBuilder sb = new StringBuilder("{\n");

        if(pipeline.getAuthor() != null)
            sb.append("\tauthor : ").append(ParserUtils.embrace(pipeline.getAuthor())).append("\n");

        if(pipeline.getDescription() != null)
            sb.append("\tdescription : ").append(ParserUtils.embrace(pipeline.getDescription())).append("\n");

        if(pipeline.getVersion() != null)
            sb.append("\tversion : ").append(ParserUtils.embrace(pipeline.getVersion())).append("\n");

        if(pipeline.getDocumentation() != null){
            sb.append("\tdocumentation : [");

            for(String doc : pipeline.getDocumentation())
                sb.append(ParserUtils.embrace(doc)).append(", ");

            sb.replace(sb.length()-", ".length(), sb.length(), "");

            sb.append("]\n");
        }

        return sb.toString();
    }

}
