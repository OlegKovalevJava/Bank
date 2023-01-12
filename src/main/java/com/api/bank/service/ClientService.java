package com.api.bank.service;


import com.api.bank.entity.Client;
import com.api.bank.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public void addClient(Client client) {
        this.clientRepository.save(client);
    }

    public void deleteClient(Client client) {
        this.clientRepository.delete(client);
    }



}