package com.example.arquiteturaByLayer.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@MappedSuperclass
public class ModelPessoa {
    private String nome;
    private String cpf;
    private int idade;

    public ModelPessoa(){}

    public ModelPessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }


}
