package se.soderstrand.morales.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;
import se.soderstrand.morales.graphqldemo.model.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
}
