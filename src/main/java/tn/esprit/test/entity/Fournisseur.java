package tn.esprit.test.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;// Clé primaire
    private String codeFournisseur;
    private String libelleFournisseur;
    @ManyToMany(mappedBy = "fournisseurs")
    List<Produit> produits;
}
