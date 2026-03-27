package com.arquitetura.byFeatures.livros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LivroService {
    @Autowired
    LivroRepository livroRepository;

    public LivroDTO findById(long id){
        Livro livro = livroRepository.findById(id).get();
        LivroDTO dto = new LivroDTO(livro);
        return dto;
    }
}
