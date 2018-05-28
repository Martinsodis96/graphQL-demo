package se.soderstrand.morales.graphqldemo.model;

import lombok.*;

import javax.persistence.*;

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
    private String category;
    private String brand;
    @ManyToOne
    private SalesOrder salesOrder;
}
