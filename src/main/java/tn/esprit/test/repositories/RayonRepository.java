package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entity.Rayon;

public interface RayonRepository extends JpaRepository<Rayon, Long> {
}
