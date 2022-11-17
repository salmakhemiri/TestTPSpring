package tn.esprit.test.services;

import tn.esprit.test.entity.Client;

import java.util.List;

public interface IClientService {

    public Client addClient(Client c);

    public Client updateClient(Client c);

    public void deleteClient(Long id);

    public List<Client> retrieveAllClients();

    public Client retrieveClient(Long id);
}
