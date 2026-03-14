package com.example.features.produtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProdutoDTO {
    private long id;
    private String nome;
    private int quantidade;

    public ProdutoDTO(){}

    public ProdutoDTO(long id, String nome, int quantidade){
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public ProdutoDTO(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.quantidade = produto.getQuantidade();
    }
}
