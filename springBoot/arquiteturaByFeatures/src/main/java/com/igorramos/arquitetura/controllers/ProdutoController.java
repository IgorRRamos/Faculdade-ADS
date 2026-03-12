package com.igorramos.arquitetura.controllers;

import com.igorramos.arquitetura.dtos.ProdutoDTO;
import com.igorramos.arquitetura.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping(value = "/{id}")
    public ProdutoDTO findById(@PathVariable int id) {
        return produtoService.findById(id);
    }
}
