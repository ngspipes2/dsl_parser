package pt.isel.ngspipes.dsl_parser.domain;

import pt.isel.ngspipes.dsl_parser.domain.service.read.PipelineReader;
import pt.isel.ngspipes.dsl_parser.domain.service.write.PipelineWriter;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.IPipelineDescriptor;

public class NGSPipesParser {

    private PipelineReader pipelineReader = new PipelineReader();
    private PipelineWriter pipelineWriter = new PipelineWriter();



    public IPipelineDescriptor getFromString(String pipelineDescription) throws ParserException {
        if(pipelineDescription == null)
            throw new IllegalArgumentException("PipelineDescription cannot be null!");

        return pipelineReader.parse(ParserUtils.getRootContext(pipelineDescription));
    }

    public String getAsString(IPipelineDescriptor pipelineDescriptor) throws ParserException {
        if(pipelineDescriptor == null)
            throw new IllegalArgumentException("PipelineDescriptor cannot be null!");

        return pipelineWriter.getAsString(pipelineDescriptor);
    }

}
