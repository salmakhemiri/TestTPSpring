package tn.esprit.test.entity;

import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;// Clé primaire
    private Integer qteStock;
    private Integer qteMin;
    private String libelleStock;

    @OneToMany(mappedBy = "stock")
    List<Produit> produits;
}
