package com.biblioteca.biblioteca.emprestimo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emprestimos")
@RequiredArgsConstructor

public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    @PostMapping
    public ResponseEntity<EmprestimoResponseDTO> alugar(@RequestBody EmprestimoRequestDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(emprestimoService.alugar(dto));
    }

    @PatchMapping("/{id}/devolver")
    public ResponseEntity<EmprestimoResponseDTO> devolver(@PathVariable long id){
        return ResponseEntity.ok(emprestimoService.devolver(id));
    }

}
