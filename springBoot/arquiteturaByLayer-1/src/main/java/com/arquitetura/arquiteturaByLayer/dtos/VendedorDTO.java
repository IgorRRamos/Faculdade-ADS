package com.arquitetura.arquiteturaByLayer.dtos;

import com.arquitetura.arquiteturaByLayer.entities.Vendedor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VendedorDTO {
    private long id;
    private String nome;
    private int idade;

    public VendedorDTO(){}

    public VendedorDTO(long id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public VendedorDTO(Vendedor vendedor){
        id = vendedor.getId();
        nome = vendedor.getNome();
        idade = vendedor.getIdade();
    }
}
