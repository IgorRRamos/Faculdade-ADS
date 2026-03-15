package com.example.arquiteturaByLayer.repositorys;

import com.example.arquiteturaByLayer.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
