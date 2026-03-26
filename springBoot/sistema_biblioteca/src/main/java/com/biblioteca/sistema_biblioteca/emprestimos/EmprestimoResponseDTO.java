package com.biblioteca.sistema_biblioteca.emprestimos;

import java.time.LocalDate;

public record EmprestimoResponseDTO (
        Long id,
        String nomeCliente,
        String tituloLivro,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        String status
){}
