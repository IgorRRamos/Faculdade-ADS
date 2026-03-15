package com.example.arquiteturaByLayer.repositorys;

import com.example.arquiteturaByLayer.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
