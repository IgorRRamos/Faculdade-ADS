package com.biblioteca.biblioteca.emprestimo.exceptions;

public class JaDevolvidoException extends RuntimeException{
    public JaDevolvidoException(Long id) {
        super("Livro " + id + " já devolvido.");
    }
}
