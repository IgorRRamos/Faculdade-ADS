package com.biblioteca.sistema_biblioteca.emprestimos.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExceptionHandler extends RuntimeException {

    @ExceptionHandler({
            JaDevolvidoException.class,
            JaPossuiException.class,
            SemEstoqueException.class
    })
    public ResponseEntity<String> handleConflito(RuntimeException e){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }

    @ExceptionHandler(NaoEncontradoException.class)
    public ResponseEntity<String> handlerNaoEncontrado(RuntimeException e){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }
}
