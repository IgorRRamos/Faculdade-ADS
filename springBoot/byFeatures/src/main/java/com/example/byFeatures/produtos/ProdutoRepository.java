package com.example.byFeatures.produtos;

import com.example.byFeatures.vendedores.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
