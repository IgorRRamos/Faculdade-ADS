package com.igorramos.arquitetura.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.MappedSuperclass;

@Getter
@Setter

@MappedSuperclass
public class ModelPessoa {
    private String nome;
    private String senha;

    public ModelPessoa() {
    }

    public ModelPessoa(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
}
