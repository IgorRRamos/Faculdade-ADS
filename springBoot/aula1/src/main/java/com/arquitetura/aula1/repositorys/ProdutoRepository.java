package com.arquitetura.aula1.repositorys;

import com.arquitetura.aula1.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
