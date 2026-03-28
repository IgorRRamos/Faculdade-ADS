package com.arquitetura.byFeatures.emprestimos;

import com.arquitetura.byFeatures.livros.Livro;
import com.arquitetura.byFeatures.pessoas.Cliente;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "EMPRESTIMOS")

@Getter
@Setter

public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "clienteId", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "livroId", nullable = false)
    private Livro livro;

    @Column(nullable = false)
    private LocalDate dataEmprestimo;

    private LocalDate dataDevolucao;

    @Enumerated(EnumType.STRING)
    private StatusEmprestimo status;

    public enum StatusEmprestimo{
        ATIVO, DEVOLVIDO
    }
}
