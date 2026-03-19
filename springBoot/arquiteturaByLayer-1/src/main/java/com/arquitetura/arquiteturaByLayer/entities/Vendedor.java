package com.arquitetura.arquiteturaByLayer.entities;

import com.arquitetura.arquiteturaByLayer.models.ModelPessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "VENDEDORES")

public class Vendedor extends ModelPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Vendedor(){}

    public Vendedor(String nome, int idade, long id){
        super(nome, idade);
        this.id = id;
    }

}
