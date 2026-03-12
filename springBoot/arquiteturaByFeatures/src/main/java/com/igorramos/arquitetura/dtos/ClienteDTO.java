package com.igorramos.arquitetura.dtos;

import com.igorramos.arquitetura.entities.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ClienteDTO {
    private long id;
    private String nome;
    private double saldo;

    public ClienteDTO(){}

    public ClienteDTO(long id, String nome, double saldo){
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }
    public ClienteDTO(Cliente cliente){
        this.nome = cliente.getNome();
        this.id = cliente.getId();
        this.saldo = cliente.getSaldo();
    }

}
