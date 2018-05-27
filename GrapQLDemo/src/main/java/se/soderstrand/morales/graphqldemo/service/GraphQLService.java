package se.soderstrand.morales.graphqldemo.service;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import se.soderstrand.morales.graphqldemo.service.datafetcher.AllCustomersFetcher;
import se.soderstrand.morales.graphqldemo.service.datafetcher.CustomerFetcher;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;


@Service
public class GraphQLService {

    @Value("classpath:customer.graphql")
    Resource resource;

    private final CustomerFetcher customerFetcher;

    private GraphQL graphQL;

    @Autowired
    public GraphQLService(CustomerFetcher customerFetcher) {
        this.customerFetcher = customerFetcher;
    }

    @PostConstruct
    public void loadSchema() throws IOException {
        File schemaFile = resource.getFile();
        TypeDefinitionRegistry typeDefinitionRegistry = new SchemaParser().parse(schemaFile);
        RuntimeWiring wiring = buildRuntimeWiring();
        GraphQLSchema schema = new SchemaGenerator().makeExecutableSchema(typeDefinitionRegistry, wiring);
        graphQL = GraphQL.newGraphQL(schema).build();
    }

    private RuntimeWiring buildRuntimeWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .type("Query", typeWiring -> typeWiring
                        .dataFetcher("customer", customerFetcher))
                .build();
    }

    public GraphQL getGraphQL(){
        return graphQL;
    }
}
