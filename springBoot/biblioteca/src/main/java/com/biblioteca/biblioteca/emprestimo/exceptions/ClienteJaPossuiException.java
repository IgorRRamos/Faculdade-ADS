package com.biblioteca.biblioteca.emprestimo.exceptions;

public class ClienteJaPossuiException extends RuntimeException{
    public ClienteJaPossuiException(Long clienteId){
        super("Cliente " + clienteId + " já possui livro.");
    }
}
