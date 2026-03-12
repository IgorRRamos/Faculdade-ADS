package com.arquitetura.aula1.models;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.MappedSuperclass;

@Getter
@Setter

@MappedSuperclass
public class ModelProduto {
    private String nome;
    private int quantidade;

    public ModelProduto(){}

    public ModelProduto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
