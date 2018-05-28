package se.soderstrand.morales.graphqldemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class SalesOrder {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime orderDate;
    private String deliveryAddress;
    private Boolean delivered;
    private String campaignDiscount;

    @ManyToOne
    private Customer customer;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "sales_order_product",
            joinColumns = { @JoinColumn(name = "sales_order_id") },
            inverseJoinColumns = { @JoinColumn(name = "product_id") }
    )
    private Set<Product> products;
}
