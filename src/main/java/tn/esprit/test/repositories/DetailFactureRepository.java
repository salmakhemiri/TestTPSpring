package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.DetailFacture;

public interface DetailFactureRepository extends JpaRepository<DetailFacture, Long> {
}
