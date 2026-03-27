package com.arquitetura.byFeatures.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LivroController {
    @Autowired
    LivroService livroService;

    public LivroDTO findById(long id){
        return livroService.findById(id);
    }
}
