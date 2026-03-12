package com.igorramos.arquitetura.dtos;

import com.igorramos.arquitetura.entities.Vendedor;
import com.igorramos.arquitetura.repositorys.VendedorRepositorio;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VendedorDTO {
    private Long id;
    private String nome;

    public VendedorDTO() {}

    public VendedorDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public VendedorDTO(Vendedor vendedor) {
        this.id = vendedor.getId();
        this.nome = vendedor.getNome();
    }


}
