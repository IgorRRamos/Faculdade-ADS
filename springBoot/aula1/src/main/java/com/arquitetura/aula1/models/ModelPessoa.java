package com.arquitetura.aula1.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@MappedSuperclass
public class ModelPessoa {
    private String nome;
    private String senha;

    public ModelPessoa() {}

    public ModelPessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
}
