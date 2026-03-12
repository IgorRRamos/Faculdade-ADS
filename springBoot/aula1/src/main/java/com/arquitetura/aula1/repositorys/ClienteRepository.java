package com.arquitetura.aula1.repositorys;

import com.arquitetura.aula1.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
