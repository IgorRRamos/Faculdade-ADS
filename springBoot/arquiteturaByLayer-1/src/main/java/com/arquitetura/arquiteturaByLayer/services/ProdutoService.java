package com.arquitetura.arquiteturaByLayer.services;

import com.arquitetura.arquiteturaByLayer.dtos.ProdutoDTO;
import com.arquitetura.arquiteturaByLayer.entities.Produto;
import com.arquitetura.arquiteturaByLayer.repositorys.ProdutoRepository;
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
