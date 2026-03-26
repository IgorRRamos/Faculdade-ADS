package com.biblioteca.sistema_biblioteca.emprestimos;

import com.biblioteca.sistema_biblioteca.clientes.Cliente;
import com.biblioteca.sistema_biblioteca.produtos.Livro;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter

@Entity
@Table(name = "EMPRESTIMOS")

public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
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
