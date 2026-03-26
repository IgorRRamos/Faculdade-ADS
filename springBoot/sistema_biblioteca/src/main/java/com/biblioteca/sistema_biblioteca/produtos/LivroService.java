package com.biblioteca.sistema_biblioteca.produtos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {
    @Autowired
    LivroRepository produtosRepository;

    public LivroDTO findById(long id){
        Livro livro = produtosRepository.findById(id).get();
        LivroDTO dto = new LivroDTO(livro);
        return dto;
    }
}
