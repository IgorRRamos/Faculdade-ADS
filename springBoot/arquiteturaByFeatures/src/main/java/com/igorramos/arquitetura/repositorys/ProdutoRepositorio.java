package com.igorramos.arquitetura.repositorys;

import com.igorramos.arquitetura.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {
}
