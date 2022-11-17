package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entity.Client;
import tn.esprit.test.repositories.ClientRepository;

import java.util.List;
import java.util.Date;
@Service
public class IClientServiceIMP implements IClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client addClient(Client c){return clientRepository.save(c);};

    public Client updateClient(Client c) {return clientRepository.save(c);};

    public void deleteClient(Long id) {
        Client client=clientRepository.findById(id).orElse(null);
        clientRepository.deleteById(id);};

    public List<Client> retrieveAllClients() {return null;}

    @Override
    public Client retrieveClient(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

}
