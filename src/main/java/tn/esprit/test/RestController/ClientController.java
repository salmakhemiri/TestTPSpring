package tn.esprit.test.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test.entity.Client;
import tn.esprit.test.services.IClientService;

import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

@Autowired
    IClientService clientService;

    @GetMapping("/retrieveAllClients")
    public List<Client> retrieveAllClients()
    {
        return clientService.retrieveAllClients();
    }

    @PostMapping("/AddClient")
    public Client AddClient( @RequestBody Client c )
    {
        return clientService.addClient(c) ;
    }


    @PutMapping("/UpdateClient")
    public Client UpdateClient(@RequestBody Client c)
    {
        return clientService.updateClient(c);
    }

    @DeleteMapping("/remove-client/{client-id}")
    public void deleteClient(@PathVariable("client-id") Long id) {
        clientService.deleteClient(id);
    }

    @GetMapping("/retrieveClient")
    public Client retrieveClient(@PathVariable Long id){
        return clientService.retrieveClient(id);
    }
}
