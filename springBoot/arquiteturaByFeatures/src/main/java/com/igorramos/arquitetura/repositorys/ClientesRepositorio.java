package com.igorramos.arquitetura.repositorys;

import com.igorramos.arquitetura.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepositorio extends JpaRepository<Cliente, Long> {
}
