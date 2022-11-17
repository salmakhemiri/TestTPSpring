package tn.esprit.test.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entity.Fournisseur;
import tn.esprit.test.services.IFournisseurService;

import java.util.List;

@RequestMapping("/fournisseur")
@RestController
public class FournisseurController {
    @Autowired
    IFournisseurService fournisseurServiceInt;
    @GetMapping()
    public List<Fournisseur> retrieveAllFournisseurs(){
        return fournisseurServiceInt.retrieveAllFournisseurs();
    }
    @PostMapping("/add")
    public Fournisseur addFournisseur (@RequestBody Fournisseur f){
        return fournisseurServiceInt.addFournisseur(f);
    }
    @PutMapping("/edit")
    public Fournisseur updateFournisseur (@RequestBody Fournisseur f){
        return fournisseurServiceInt.updateFournisseur(f);
    }
    @GetMapping("/{id}")
    public Fournisseur retrieveFournisseur (@PathVariable Long id){
        return fournisseurServiceInt.retrieveFournisseur(id);
    }

    @PutMapping("/assign/{idFournisseur}/{idProduit}")
    public void assignFournisseurToProduit(@PathVariable Long fournisseurId,@PathVariable Long produitId){
        fournisseurServiceInt.assignFournisseurToProduit( fournisseurId,  produitId);
    }


}


