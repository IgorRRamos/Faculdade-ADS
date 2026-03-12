package com.igorramos.arquitetura.services;

import com.igorramos.arquitetura.dtos.ProdutoDTO;
import com.igorramos.arquitetura.entities.Produto;
import com.igorramos.arquitetura.repositorys.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepositorio produtoRepo;

    public ProdutoDTO findById(long id){
        Produto produto = produtoRepo.findById(id).get();
        ProdutoDTO dto = new ProdutoDTO(produto);
        return dto;
    }
}
