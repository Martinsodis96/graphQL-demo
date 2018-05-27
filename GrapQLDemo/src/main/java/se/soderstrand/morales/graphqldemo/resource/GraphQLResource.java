package se.soderstrand.morales.graphqldemo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.soderstrand.morales.graphqldemo.service.GraphQLService;

@RestController
@RequestMapping("/graphql")
public class GraphQLResource {

    private final GraphQLService graphQLService;

    @Autowired
    public GraphQLResource(GraphQLService graphQLService) {
        this.graphQLService = graphQLService;
    }

    @PostMapping
    public ResponseEntity<Object> getCustomer(@RequestBody String query) {
        return new ResponseEntity<>(graphQLService.getGraphQL().execute(query), HttpStatus.OK);
    }
}
