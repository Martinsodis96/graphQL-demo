package se.soderstrand.morales.graphqldemo.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String brand;
    private String category;
    private Double price;
    private Double discount;
    private Double percentageDiscount;

    @ManyToMany(mappedBy = "products")
    private Set<SalesOrder> salesOrders;
}
