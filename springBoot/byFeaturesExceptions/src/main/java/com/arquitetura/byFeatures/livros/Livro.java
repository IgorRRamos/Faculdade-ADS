package com.arquitetura.byFeatures.livros;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "LIVROS")

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String tittle;
    private int quantidade;

    public Livro(long id, String nome, String tittle, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.tittle = tittle;
        this.quantidade = quantidade;
    }

    public Livro() {
    }
}

