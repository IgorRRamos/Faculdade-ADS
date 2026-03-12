package com.igorramos.arquitetura.repositorys;

import com.igorramos.arquitetura.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepositorio extends JpaRepository<Vendedor, Long> {
}
