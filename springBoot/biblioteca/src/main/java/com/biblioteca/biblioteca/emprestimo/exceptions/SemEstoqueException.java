package com.biblioteca.biblioteca.emprestimo.exceptions;

public class SemEstoqueException extends RuntimeException{
    public SemEstoqueException (Long livroId){
        super("Livro " + livroId + " não possui no estoque.");
    }
}
