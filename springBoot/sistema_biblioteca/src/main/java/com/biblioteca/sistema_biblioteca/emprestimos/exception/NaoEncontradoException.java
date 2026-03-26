package com.biblioteca.sistema_biblioteca.emprestimos.exception;

public class NaoEncontradoException extends RuntimeException {
    public NaoEncontradoException(Long livroId) {
        super("Livro: " + livroId + " não encontrado.");
    }
}
