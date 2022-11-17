package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entity.Produit;
import tn.esprit.test.entity.Stock;
import tn.esprit.test.repositories.ProduitRepository;
import tn.esprit.test.repositories.StockRepository;

import java.util.List;

@Service
public class IProduitServiceIMP implements IProduitService{

    @Autowired
    ProduitRepository produitRepository;
    StockRepository stockRepository;

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock){return produitRepository.save(p);};


    public List<Produit> retrieveAllProduits(){return null;}

    @Override
    public Produit retrieveProduit(Long idProduit){
        return produitRepository.findById(idProduit).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit produit=produitRepository.findById(idProduit).orElse(null);
        Stock stock=stockRepository.findById(idStock).orElse(null);
        if(produit!=null && stock!=null){
            produit.setStock(stock);
            produitRepository.save(produit);
        }
    }

}

