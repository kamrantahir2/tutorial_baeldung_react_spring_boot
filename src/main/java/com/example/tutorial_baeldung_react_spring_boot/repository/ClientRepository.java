package com.example.tutorial_baeldung_react_spring_boot.repository;

import com.example.tutorial_baeldung_react_spring_boot.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}