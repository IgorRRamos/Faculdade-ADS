package com.example.arquiteturaByLayer.dtos;

import com.example.arquiteturaByLayer.entities.Produto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ProdutoDTO {
    private long id;
    private String nome;
    private int  quantidade;
    private String tipo;

    public ProdutoDTO(){}
    public ProdutoDTO(long id, String nome, int quantidade, String tipo){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
    }
    public ProdutoDTO(Produto produto){
        id = produto.getId();
        nome = produto.getNome();
        quantidade = produto.getQuantidade();
        tipo = produto.getTipo();
    }
}
