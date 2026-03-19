package com.arquitetura.arquiteturaByLayer.repositorys;

import com.arquitetura.arquiteturaByLayer.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
