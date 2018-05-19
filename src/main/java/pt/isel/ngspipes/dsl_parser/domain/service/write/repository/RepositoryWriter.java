package pt.isel.ngspipes.dsl_parser.domain.service.write.repository;

import pt.isel.ngspipes.dsl_parser.domain.ParserUtils;
import pt.isel.ngspipes.dsl_parser.transversal.ParserException;
import pt.isel.ngspipes.pipeline_descriptor.repository.IPipelineRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.IToolRepositoryDescriptor;
import pt.isel.ngspipes.pipeline_descriptor.repository.value.IValueDescriptor;

import java.util.Collection;
import java.util.Map;

public class RepositoryWriter {

    public String getAsString(Collection<IRepositoryDescriptor> repositories) throws ParserException {
        if(repositories == null)
            throw new IllegalArgumentException("Repositories cannot be null!");

        String repositoriesContent = getRepositoriesContent(repositories);

        return "Repositories : " + repositoriesContent;
    }

    private String getRepositoriesContent(Collection<IRepositoryDescriptor> repositories) throws ParserException {
        if(repositories.isEmpty())
            return "[ ]";

        StringBuilder sb = new StringBuilder("[\n");

        String repositoryStr;
        for (IRepositoryDescriptor repository : repositories) {
            repositoryStr = getAsString(repository);
            repositoryStr = ParserUtils.indent(repositoryStr, 1);
            sb.append(repositoryStr).append("\n");
        }

        sb.append("]");

        return sb.toString();
    }

    public String getAsString(IRepositoryDescriptor repository) throws ParserException {
        if(repository == null)
            throw new IllegalArgumentException("Repository cannot be null!");

        String type = getType(repository);
        String id = repository.getId();
        String repositoryContent = getRepositoryContent(repository);

        return type + " " + id + " : " + repositoryContent;
    }

    private String getType(IRepositoryDescriptor repository) throws ParserException {
        if(repository instanceof IToolRepositoryDescriptor)
            return "ToolRepository";
        else if(repository instanceof IPipelineRepositoryDescriptor)
            return "PipelineRepository";

        throw new ParserException("Unknown Repository Descriptor type!");
    }

    private String getRepositoryContent(IRepositoryDescriptor repository) throws ParserException {
        StringBuilder sb = new StringBuilder("{\n");

        String location = ParserUtils.embrace(repository.getLocation());
        sb.append("\tlocation : ").append(location).append("\n");

        String configContent = getConfigContent(repository.getConfiguration());
        configContent = ParserUtils.indent(configContent,1).trim();
        sb.append("\tconfig : ").append(configContent).append("\n");

        sb.append("}");

        return sb.toString();
    }

    private String getConfigContent(Map<String, IValueDescriptor> configuration) throws ParserException {
        if(configuration.isEmpty())
            return "{ }";

        StringBuilder sb = new StringBuilder("{\n");

        IValueDescriptor valueDescriptor;
        String value;
        for(String key : configuration.keySet()) {
            valueDescriptor = configuration.get(key);
            value = ParserUtils.getValueAsString(valueDescriptor);
            sb.append("\t").append(key).append(" : ").append(value).append("\n");
        }

        sb.append("}");

        return sb.toString();
    }

}
