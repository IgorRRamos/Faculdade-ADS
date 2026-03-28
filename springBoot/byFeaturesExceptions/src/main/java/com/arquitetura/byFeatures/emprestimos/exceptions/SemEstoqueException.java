package com.arquitetura.byFeatures.emprestimos.exceptions;

public class SemEstoqueException extends RuntimeException {
    public SemEstoqueException(Long livroId) {
        super("Livro: " + livroId + " Sem estoque.");
    }
}
