package com.api.bank.repository;

import com.api.bank.entity.ClientBalance;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientBalance, Long> {
}