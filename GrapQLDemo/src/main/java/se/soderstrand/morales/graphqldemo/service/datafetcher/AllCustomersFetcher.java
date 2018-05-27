package se.soderstrand.morales.graphqldemo.service.datafetcher;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import se.soderstrand.morales.graphqldemo.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class AllCustomersFetcher implements DataFetcher<List<Customer>> {

    @Override
    public List<Customer> get(DataFetchingEnvironment dataFetchingEnvironment) {
        return new ArrayList<Customer>();
    }
}
