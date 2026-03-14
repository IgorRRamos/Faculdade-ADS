package com.example.features.produtos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUTOS")

@Getter
@Setter

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private int quantidade;

    public Produto(){}

    public Produto(long id, String nome, int quantidade){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
