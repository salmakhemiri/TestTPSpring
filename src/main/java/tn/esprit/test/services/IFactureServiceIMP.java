package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entity.Client;
import tn.esprit.test.entity.Facture;
import tn.esprit.test.entity.Fournisseur;
import tn.esprit.test.repositories.ClientRepository;
import tn.esprit.test.repositories.FactureRepository;


import java.util.List;
@Service
public class IFactureServiceIMP implements IFactureService {
    @Autowired
    FactureRepository factureRepository;

    @Autowired
    ClientRepository clientRepository;

    public List<Facture> retrieveAllFactures() {return null;}

    @Override
    public void cancelFacture(Long id) {
        Facture facture=factureRepository.findById(id).orElse(null);
        if(facture!=null )
        {
            facture.setActive(false);
        }

    }
    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return factureRepository.findByClient_IdClient(idClient);
    }

    @Override
    public Facture addFacture(Facture f, Long idClient) {
        Client client= clientRepository.findById(idClient).orElse(null);
        f.setClient(client);
        return factureRepository.save(f);
    }

}
