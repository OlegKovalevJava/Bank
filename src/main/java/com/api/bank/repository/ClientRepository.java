package com.api.bank.repository;

import com.api.bank.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ClientRepository extends JpaRepository<Client, Long> {

    BigDecimal getBalanceById(Long id);

}