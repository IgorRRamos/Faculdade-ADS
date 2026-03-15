package com.example.arquiteturaByLayer.repositorys;

import com.example.arquiteturaByLayer.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
}
