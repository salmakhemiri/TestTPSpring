package tn.esprit.test.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DetailProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit;// Clé primaire
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    @Enumerated(EnumType.STRING)
    private CategorieProduit categorieProduit;

    @OneToOne
    @JoinColumn(name = "produit_idProduit", referencedColumnName = "idProduit")

    private Produit produit;





}
