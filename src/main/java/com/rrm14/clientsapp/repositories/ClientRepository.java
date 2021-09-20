package com.rrm14.clientsapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rrm14.clientsapp.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
