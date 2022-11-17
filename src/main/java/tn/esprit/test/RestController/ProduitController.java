package tn.esprit.test.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entity.Produit;
import tn.esprit.test.services.IProduitService;

import javax.websocket.server.PathParam;
import java.util.List;
@RestController
@RequestMapping("/produit")
public class ProduitController {

    @Autowired
    IProduitService produitService;

    @GetMapping("/retrieveAllProduits")
    public List<Produit> retrieveAllProduits()
    {
        return produitService.retrieveAllProduits();
    }

    @PostMapping("/addProduit")
    public Produit addProduit(@RequestBody Produit p, @PathVariable Long idRayon, @PathVariable Long idStock)
    {
        return produitService.addProduit(p,idRayon, idStock) ;
    }


    @GetMapping("/retrieveProduit")
    public Produit retrieveProduit(@PathVariable Long idProduit){
        return produitService.retrieveProduit(idProduit);
    }

    @PutMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit,@PathVariable Long idStock){
        produitService.assignProduitToStock(idProduit,idStock);
    }
}

