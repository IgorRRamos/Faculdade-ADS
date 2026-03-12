package com.arquitetura.aula1.entities;

import com.arquitetura.aula1.models.ModelPessoa;
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

    public Cliente() {}

    public Cliente(long id, String nome, String senha) {
        super(nome, senha);
        this.id = id;
    }
}
