package com.biblioteca.biblioteca.emprestimo;

import java.time.LocalDate;

public record EmprestimoResponseDTO (
        Long id,
        String nomeCliente,
        String tituloLivro,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        String status
) {}
