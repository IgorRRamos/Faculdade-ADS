package com.arquitetura.arquiteturaByLayer.dtos;

import com.arquitetura.arquiteturaByLayer.entities.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClienteDTO {
    private long id;
    private String nome;
    private int idade;

    public ClienteDTO(){}

    public ClienteDTO(long id, String nome, int idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public ClienteDTO(Cliente cliente){
        id = cliente.getId();
        nome = cliente.getNome();
        idade = cliente.getIdade();
    }
}
