package com.arquitetura.arquiteturaByLayer.models;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@MappedSuperclass
public class ModelProduto {
    private String nome;
    private int quantidade;
    private String tipo;

    public ModelProduto(){}

    public ModelProduto(String nome, int quantidade, String tipo){
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

}
