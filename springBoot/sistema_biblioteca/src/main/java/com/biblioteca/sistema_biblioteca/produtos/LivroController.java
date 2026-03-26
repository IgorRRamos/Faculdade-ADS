package com.biblioteca.sistema_biblioteca.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")

public class LivroController {
    @Autowired
    LivroService LivroService;

    @GetMapping(value = "/{id}")
    public LivroDTO findById(@PathVariable long id){
        return LivroService.findById(id);
    }
}
