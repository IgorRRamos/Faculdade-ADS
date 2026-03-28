package com.arquitetura.byFeatures.emprestimos.exceptions;

public class JaPossuiException extends RuntimeException {
    public JaPossuiException(Long clienteId) {
        super("Cliente: " + clienteId + " Já possui emprestimos");
    }
}
