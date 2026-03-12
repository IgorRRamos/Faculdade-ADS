package com.igorramos.arquitetura.entities;

import com.igorramos.arquitetura.models.ModelPessoa;
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
    private double saldo;

    public Cliente() {
    }

    public Cliente(long id, String nome, String senha, double saldo) {
        super(nome, senha);
        this.saldo = saldo;
        this.id = id;
    }
}
