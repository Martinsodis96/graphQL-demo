package se.soderstrand.morales.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import se.soderstrand.morales.graphqldemo.model.SalesOrder;

@RepositoryRestResource
public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {
}
