package com.example.byFeatures.vendedores;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VendedoresDTO {
    private long id;
    private String nome;

    public  VendedoresDTO(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public VendedoresDTO(Vendedor vendedor){
        this.nome = vendedor.getNome();
        this.id = vendedor.getId();
    }
}
