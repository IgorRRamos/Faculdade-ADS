package com.arquitetura.byFeatures.emprestimos;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/emprestimos")

@RequiredArgsConstructor
public class EmprestimoController {
    private final EmprestimoService service;

    @PostMapping
    public ResponseEntity<EmprestimoResponseDTO> alugar(@RequestBody EmprestimoRequestDTO dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.alugar(dto));
    }

    @PatchMapping("/{id}/devolver")
    public ResponseEntity<EmprestimoResponseDTO> devolver(@PathVariable long id){
        return ResponseEntity.ok(service.devolver(id));
    }
}
