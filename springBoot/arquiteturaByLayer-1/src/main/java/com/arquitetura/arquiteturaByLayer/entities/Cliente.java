package com.arquitetura.arquiteturaByLayer.entities;

import com.arquitetura.arquiteturaByLayer.models.ModelPessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "CLIENTES")

public class Cliente extends ModelPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Cliente(){}

    public Cliente(String nome, int idade, long id){
        super(nome, idade);
        this.id = id;
    }
}
