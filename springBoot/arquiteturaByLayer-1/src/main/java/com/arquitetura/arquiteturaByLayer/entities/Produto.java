package com.arquitetura.arquiteturaByLayer.entities;

import com.arquitetura.arquiteturaByLayer.models.ModelProduto;
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

    public Produto(){}

    public Produto(String nome, int quantidade, String tipo, long id){
        super(nome, quantidade, tipo);
        this.id = id;
    }
}
