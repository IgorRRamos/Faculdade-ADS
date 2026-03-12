package com.arquitetura.aula1.repositorys;

import com.arquitetura.aula1.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
