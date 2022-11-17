package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Facture;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture, Long> {
    public List<Facture> findByClient_IdClient(Long id);
}
