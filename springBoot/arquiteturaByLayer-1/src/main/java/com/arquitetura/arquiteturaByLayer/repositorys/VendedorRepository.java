package com.arquitetura.arquiteturaByLayer.repositorys;

import com.arquitetura.arquiteturaByLayer.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
