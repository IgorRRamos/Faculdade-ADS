package com.arquitetura.aula1.dtos;

import com.arquitetura.aula1.entities.Cliente;
import com.arquitetura.aula1.repositorys.ClienteRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClienteDTO {
    private long id;
    private String nome;

    public  ClienteDTO(){}

    public ClienteDTO(long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public ClienteDTO(Cliente cliente){
        this.id = cliente.getId();
        this.nome = cliente.getNome();
    }
}
