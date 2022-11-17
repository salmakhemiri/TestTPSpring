package tn.esprit.test.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.test.entity.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {
}
