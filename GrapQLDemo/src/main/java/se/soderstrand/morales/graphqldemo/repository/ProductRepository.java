package se.soderstrand.morales.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.soderstrand.morales.graphqldemo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
