package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.DetailProduit;

public interface DetailProduitRepository extends JpaRepository<DetailProduit, Long> {
}
