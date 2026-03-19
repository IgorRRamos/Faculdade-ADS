package com.arquitetura.arquiteturaByLayer.dtos;

import com.arquitetura.arquiteturaByLayer.entities.Produto;
import com.arquitetura.arquiteturaByLayer.repositorys.ProdutoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter

public class ProdutoDTO {
    private long id;
    private String nome;
    private int quantidade;
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
