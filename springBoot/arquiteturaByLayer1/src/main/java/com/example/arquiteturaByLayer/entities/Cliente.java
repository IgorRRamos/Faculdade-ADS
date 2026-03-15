package com.example.arquiteturaByLayer.entities;

import com.example.arquiteturaByLayer.models.ModelPessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name  = "CLIENTES")

@Getter
@Setter

public class Cliente extends ModelPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String senha;

    public Cliente(){}
    public Cliente(long id, String senha, String nome, String cpf, int idade){
        super(nome, cpf, idade);
        this.id = id;
        this.senha = senha;
    }
}
