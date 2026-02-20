package com.igorramos.aulaArquitetura.dto;

import com.igorramos.aulaArquitetura.Entities.User;

public class UserDTO {
    private String nome;
    private long id;

    public UserDTO(){}

    public UserDTO(String nome, long id) {
        this.nome = nome;
        this.id = id;
    }

    public UserDTO(User user){
        nome = user.getNome();
        id = user.getId();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
