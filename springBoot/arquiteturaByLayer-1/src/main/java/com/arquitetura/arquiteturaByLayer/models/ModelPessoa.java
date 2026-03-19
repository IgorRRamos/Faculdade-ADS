package com.arquitetura.arquiteturaByLayer.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@MappedSuperclass
public class ModelPessoa {
    private String nome;
    private int idade;

    public ModelPessoa(){}

    public ModelPessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
