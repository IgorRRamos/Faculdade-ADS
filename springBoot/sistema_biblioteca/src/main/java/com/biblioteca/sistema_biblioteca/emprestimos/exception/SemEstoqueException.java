package com.biblioteca.sistema_biblioteca.emprestimos.exception;

public class SemEstoqueException extends RuntimeException {
    public SemEstoqueException(Long livroId) {
        super("Livro : " + livroId + " Não possui no estoque.");
    }
}
