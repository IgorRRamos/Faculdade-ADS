package com.igorramos.arquitetura.entities;

import com.igorramos.arquitetura.models.ModelPessoa;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "VENDEDORES")

public class Vendedor extends ModelPessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int vendas;

    public Vendedor() {
    }

    public Vendedor(long id, String nome, String senha, int vendas) {
        super(nome, senha);
        this.id = id;
        this.vendas = vendas;
    }
}
