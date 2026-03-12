package com.arquitetura.aula1.entities;

import com.arquitetura.aula1.models.ModelProduto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name = "PRODUTOS")
public class Produto extends ModelProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Produto() {}

    public Produto(long id,String nome, int quantidade) {
        super(nome, quantidade);
        this.id = id;
    }
}
