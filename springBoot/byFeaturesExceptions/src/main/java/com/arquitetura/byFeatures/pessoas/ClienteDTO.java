package com.arquitetura.byFeatures.pessoas;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
    private long id;
    private String nome;

    public ClienteDTO(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public ClienteDTO() {
    }
    public ClienteDTO(Cliente cliente) {
        id = cliente.getId();
        nome = cliente.getNome();
    }
}
