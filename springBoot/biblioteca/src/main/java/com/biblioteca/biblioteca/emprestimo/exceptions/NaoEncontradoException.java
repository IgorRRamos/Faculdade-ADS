package com.biblioteca.biblioteca.emprestimo.exceptions;

public class NaoEncontradoException extends RuntimeException{
    public NaoEncontradoException(Long id){
        super("Livro " + id + " não encontrado.");
    }
}
