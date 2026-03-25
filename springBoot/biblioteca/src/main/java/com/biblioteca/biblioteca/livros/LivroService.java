package com.biblioteca.biblioteca.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LivroService {
    @Autowired
    LivroRepository repository;

    public LivroDTO findById(long id){
        Livro livro = repository.findById(id).get();
        LivroDTO dto = new LivroDTO(livro);
        return dto;
    }
}
