package com.example.arquiteturaByLayer.entities;

import com.example.arquiteturaByLayer.models.ModelPessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "VENDEDORES")

@Getter
@Setter

public class Vendedor extends ModelPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String senha;

    public Vendedor(){}

    public Vendedor(long id, String senha, String nome, String cpf, int idade){
        super(nome, cpf, idade);
        this.id = id;
        this.senha = senha;
    }
}
