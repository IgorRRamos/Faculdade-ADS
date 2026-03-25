package com.biblioteca.biblioteca.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/livros")


public class LivroController {
    @Autowired
    LivroService service;

    @GetMapping(value = "/{id}")
    public LivroDTO findById(@PathVariable long id){
        return service.findById(id);
    }
}
