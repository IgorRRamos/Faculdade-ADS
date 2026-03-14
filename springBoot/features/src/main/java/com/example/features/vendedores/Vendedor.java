package com.example.features.vendedores;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "VENDEDORES")

public class Vendedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String senha;

    public Vendedor(){}

    public Vendedor(long id, String nome, String senha){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
}
