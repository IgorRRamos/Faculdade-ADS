package com.example.arquiteturaByLayer.entities;

import com.example.arquiteturaByLayer.models.ModelProduto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUTOS")

@Setter
@Getter

public class Produto extends ModelProduto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Produto(){}

    public Produto(long id, String nome, int quantidade, String tipo){
        super(nome, quantidade, tipo);
    }
}
