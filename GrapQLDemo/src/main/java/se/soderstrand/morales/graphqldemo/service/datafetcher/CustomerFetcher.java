package se.soderstrand.morales.graphqldemo.service.datafetcher;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.soderstrand.morales.graphqldemo.model.Customer;
import se.soderstrand.morales.graphqldemo.repository.CustomerRepository;

@Component
public class CustomerFetcher implements DataFetcher<Customer>{

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerFetcher(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer get(DataFetchingEnvironment dataFetchingEnvironment) {
        Long id = dataFetchingEnvironment.getArgument("id");
        return customerRepository.getOne(id);
    }
}
