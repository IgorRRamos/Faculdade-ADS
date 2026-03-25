package com.biblioteca.biblioteca.clientes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClienteDTO {
    private long id;
    private String nome;
    private String senha;

    public ClienteDTO(long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    public ClienteDTO(){}

    public ClienteDTO(Cliente cliente){
        id = cliente.getId();
        nome = cliente.getNome();
        senha = cliente.getSenha();
    }
}
