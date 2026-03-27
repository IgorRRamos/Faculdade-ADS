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

    public Livro(long id, String nome, String tittle) {
        this.id = id;
        this.nome = nome;
        this.tittle = tittle;
    }

    public Livro() {
    }
}

