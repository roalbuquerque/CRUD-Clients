package com.albuquerque.dsCatalogClients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.albuquerque.dsCatalogClients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
