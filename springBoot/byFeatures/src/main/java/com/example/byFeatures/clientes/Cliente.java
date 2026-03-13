package com.example.byFeatures.clientes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENTES")

@Getter
@Setter

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String senha;

    public Cliente() {}

    public Cliente(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }


}
