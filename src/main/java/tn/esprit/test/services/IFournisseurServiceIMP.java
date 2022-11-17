package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entity.Fournisseur;
import tn.esprit.test.entity.Produit;
import tn.esprit.test.repositories.FournisseurRepository;
import tn.esprit.test.repositories.ProduitRepository;

import java.util.List;

@Service
public class IFournisseurServiceIMP implements IFournisseurService{
    @Autowired
    FournisseurRepository fournisseurRepository;

    @Autowired
    ProduitRepository produitRepository;
    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit = produitRepository.findById(produitId).orElse(null);
        if(fournisseur!=null && produit!=null){
            fournisseur.getProduits().add(produit);
            produit.getFournisseurs().add(fournisseur);
            fournisseurRepository.save(fournisseur);
            produitRepository.save(produit);
        }
    }
}


