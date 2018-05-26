package se.soderstrand.morales.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.soderstrand.morales.graphqldemo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
