package com.arquitetura.arquiteturaByLayer.repositorys;

import com.arquitetura.arquiteturaByLayer.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
