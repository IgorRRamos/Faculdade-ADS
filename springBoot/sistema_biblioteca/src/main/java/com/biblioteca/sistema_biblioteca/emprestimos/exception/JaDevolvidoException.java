package com.biblioteca.sistema_biblioteca.emprestimos.exception;

public class JaDevolvidoException extends RuntimeException {
    public JaDevolvidoException(Long livroId) {
        super("Livro: " + livroId + " já devolvido.");
    }
}
