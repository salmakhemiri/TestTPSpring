package tn.esprit.test.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Produit implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit; ;// Clé primaire
    private String codeProduit;
    private String libelleProduit;
    private Float prixUnitaire;

    @OneToOne(mappedBy = "produit")
    private DetailProduit detailProduit ;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Rayon rayon;

    @ManyToMany
    List<Fournisseur> fournisseurs;

    @OneToMany(mappedBy = "produit")
    private List<DetailFacture> detailFactures;

}
