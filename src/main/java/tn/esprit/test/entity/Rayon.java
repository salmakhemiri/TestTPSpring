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
public class Rayon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRayon;// Clé primaire
    private String codeRayon;
    private String libelleRayon;

    @OneToMany(mappedBy = "rayon")
    List<Produit> produits;
}

