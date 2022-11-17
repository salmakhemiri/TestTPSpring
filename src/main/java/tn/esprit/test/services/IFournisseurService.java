package tn.esprit.test.services;

import tn.esprit.test.entity.Facture;
import tn.esprit.test.entity.Fournisseur;

import java.util.List;

public interface IFournisseurService {
    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);

    public void assignFournisseurToProduit(Long fournisseurId, Long produitId);



}
