package com.arquitetura.aula1.entities;

import com.arquitetura.aula1.models.ModelPessoa;
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

    public Vendedor() {}

    public Vendedor(long id, int vendas) {
        this.id = id;
        this.vendas = vendas;
    }
}
