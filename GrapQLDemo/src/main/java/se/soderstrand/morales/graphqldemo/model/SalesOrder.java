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
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "salesOrder")
    private Set<Product> products;
}
