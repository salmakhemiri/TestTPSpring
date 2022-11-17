package tn.esprit.test.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetailFacture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;// Clé primaire
    private Integer qte;
    private Float prixTotal;
    private Integer pourcentageRemise;
    private Integer montantRemise;

    @ManyToOne
    private Produit produit;

    @ManyToOne
    private Facture facture;



}
