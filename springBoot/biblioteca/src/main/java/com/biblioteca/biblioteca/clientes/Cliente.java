package com.biblioteca.biblioteca.clientes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "CLIENTES")

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String senha;

    public Cliente() {
    }

    public Cliente(long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
}
