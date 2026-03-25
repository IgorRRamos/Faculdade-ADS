package com.biblioteca.biblioteca.emprestimo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    boolean existsByClienteIdAndStatus(Long clienteId, Emprestimo.StatusEmprestimo status);
}
