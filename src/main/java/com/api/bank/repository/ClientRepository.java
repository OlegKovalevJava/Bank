package com.api.bank.repository;

import com.api.bank.entity.Client;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {

    List<Client> findByBalance(Long balance);

}