package com.biblioteca.sistema_biblioteca.produtos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
