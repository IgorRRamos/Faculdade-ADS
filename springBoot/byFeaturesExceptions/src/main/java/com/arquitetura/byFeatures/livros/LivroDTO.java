package com.arquitetura.byFeatures.livros;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LivroDTO {
    private long id;
    private String nome;
    private String tittle;

    public LivroDTO(long id, String nome, String tittle) {
        this.id = id;
        this.nome = nome;
        this.tittle = tittle;
    }

    public LivroDTO(){}

    public LivroDTO(Livro livro) {
        id = livro.getId();
        nome = livro.getNome();
        tittle = livro.getTittle();
    }
}
