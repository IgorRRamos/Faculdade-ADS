package com.example.byFeatures.produtos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUTOS")

@Getter
@Setter

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int quantidade;

    public Produto(){}

    public Produto(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
}
