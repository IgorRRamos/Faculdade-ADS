package com.biblioteca.sistema_biblioteca.produtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class LivroDTO {
    private long id;
    private String nome;
    private String tittle;
    private int quantidade;

    public LivroDTO(long id, String nome, String tittle, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.tittle = tittle;
        this.quantidade = quantidade;
    }
    public LivroDTO(Livro livro) {
        id = livro.getId();
        nome = livro.getNome();
        tittle = livro.getTittle();
        quantidade = livro.getQuantidade();
    }
    public LivroDTO() {}
}
