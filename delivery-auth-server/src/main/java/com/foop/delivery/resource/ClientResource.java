package com.foop.delivery.resource;

import com.foop.delivery.model.Client;
import com.foop.delivery.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientResource {
    private final ClientRepository clientRepository;

    @GetMapping
    public List<Client> list(){
        return this.clientRepository.findAll();
    }
}
