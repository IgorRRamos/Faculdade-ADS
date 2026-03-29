package com.arquitetura.byFeatures.emprestimos;

import java.time.LocalDate;

public record EmprestimoResponseDTO(
        Long id,
        String nomeCliente,
        String tittle,
        LocalDate dataEmprestimo,
        LocalDate dataDevolucao,
        String status
) {}
