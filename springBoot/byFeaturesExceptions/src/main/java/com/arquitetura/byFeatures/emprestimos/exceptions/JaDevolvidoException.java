package com.arquitetura.byFeatures.emprestimos.exceptions;

public class JaDevolvidoException extends RuntimeException {
    public JaDevolvidoException(Long livroId) {
        super("Livro: " + livroId + " Já devolvido.");
    }
}
