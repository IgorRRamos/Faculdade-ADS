package com.example.byFeatures.clientes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClienteDTO {
    private Long id;
    private String nome;

    public ClienteDTO(){}

    public ClienteDTO(long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public ClienteDTO(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
    }
}
