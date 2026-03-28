package com.arquitetura.byFeatures.emprestimos.exceptions;

public class NaoEncontrado extends RuntimeException {
    public NaoEncontrado(Long livroId) {
        super("Livro: " + livroId + " não encontrado.");
    }
}
