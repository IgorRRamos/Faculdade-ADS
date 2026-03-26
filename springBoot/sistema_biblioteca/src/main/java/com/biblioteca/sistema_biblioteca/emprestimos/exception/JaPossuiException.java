package com.biblioteca.sistema_biblioteca.emprestimos.exception;

public class JaPossuiException extends RuntimeException {
    public JaPossuiException(Long clienteId) {
        super("Cliente: " + clienteId + " Já possui emprestimo.");
    }
}
