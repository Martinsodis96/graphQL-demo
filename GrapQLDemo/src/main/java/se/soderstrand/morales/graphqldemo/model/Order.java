package se.soderstrand.morales.graphqldemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Order {

    @Id
    private Long id;
    private LocalDateTime orderDate;
  //  private Customer customer;
//    private Set<Product> product;
}
