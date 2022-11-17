package tn.esprit.test.entity;

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

public class Facture  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;// Clé primaire
    private Float montantRemise;
    private Float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;
    Boolean active ;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "facture")
    private List<DetailFacture> detailFactures;
}
