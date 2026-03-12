package com.arquitetura.aula1.services;

import com.arquitetura.aula1.dtos.ProdutoDTO;
import com.arquitetura.aula1.entities.Produto;
import com.arquitetura.aula1.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoDTO findById(long id){
        Produto produto = produtoRepository.findById(id).get();
        ProdutoDTO dto = new ProdutoDTO(produto);
        return dto;
    }
}
