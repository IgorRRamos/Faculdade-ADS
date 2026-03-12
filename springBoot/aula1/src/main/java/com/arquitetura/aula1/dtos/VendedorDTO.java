package com.arquitetura.aula1.dtos;
import com.arquitetura.aula1.entities.Vendedor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VendedorDTO {
    private long id;
    private String nome;

    public VendedorDTO(){}

    public VendedorDTO(long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public VendedorDTO(Vendedor vendedor){
        this.id = vendedor.getId();
        this.nome = vendedor.getNome();
    }
}
