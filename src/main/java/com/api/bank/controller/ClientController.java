package com.api.bank.controller;

import com.api.bank.entity.Client;
import com.api.bank.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addClient(@RequestBody Client client) {
        this.clientService.addClient(client);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void deleteClient(@RequestBody Client client) {
        this.clientService.deleteClient(client);
    }
}