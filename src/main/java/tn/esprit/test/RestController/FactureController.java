package tn.esprit.test.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entity.Facture;
import tn.esprit.test.entity.Produit;
import tn.esprit.test.services.IFactureService;
import tn.esprit.test.services.IProduitService;

import javax.websocket.server.PathParam;
import java.util.List;
@RestController
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    IFactureService factureService;

    @GetMapping("/retrieveAllFactures")
    public List<Facture> retrieveAllFactures()
    {
        return factureService.retrieveAllFactures();
    }

    @DeleteMapping("/delete/{id}")
    public void cancelFacture(@PathVariable Long id){ factureService.cancelFacture(id);
    }
    @GetMapping("/retrieveFacture")
    public Facture retrieveProduit(@PathVariable Long id){
        return factureService.retrieveFacture(id);
    }

    @GetMapping("/findbyClient/{idClient}")
    List<Facture> getFacturesByClient(@PathVariable Long idClient){
        return factureService.getFacturesByClient(idClient);
    }
    @PostMapping("/addFacture")
    Facture addFacture(@RequestBody Facture f, @PathVariable Long idClient){
        return factureService.addFacture(f,idClient);
    }
}
