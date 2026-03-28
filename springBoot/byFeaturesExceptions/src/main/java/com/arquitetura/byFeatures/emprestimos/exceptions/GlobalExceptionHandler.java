package com.arquitetura.byFeatures.emprestimos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler extends RuntimeException {
    @ExceptionHandler({
            JaDevolvidoException.class,
            NaoEncontrado.class,
            SemEstoqueException.class
    })
    public ResponseEntity<String> handleconflito(RuntimeException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }

    @ExceptionHandler({JaPossuiException.class})
    public ResponseEntity<String> handlerNaoEncontrado(RuntimeException e){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }
}
