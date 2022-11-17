package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {
}
