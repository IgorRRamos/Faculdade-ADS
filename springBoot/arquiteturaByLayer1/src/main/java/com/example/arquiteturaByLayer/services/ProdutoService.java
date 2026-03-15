package com.example.arquiteturaByLayer.services;

import com.example.arquiteturaByLayer.dtos.ProdutoDTO;
import com.example.arquiteturaByLayer.entities.Produto;
import com.example.arquiteturaByLayer.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProdutoService {
    @Autowired
    ProdutoRepository repository;

    public ProdutoDTO findById(long id){
        Produto produto = repository.findById(id).get();
        ProdutoDTO dto = new ProdutoDTO(produto);
        return dto;
    }
}
