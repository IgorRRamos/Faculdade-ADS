package com.example.arquiteturaByLayer.controllers;

import com.example.arquiteturaByLayer.dtos.ProdutoDTO;
import com.example.arquiteturaByLayer.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")

public class ProdutoController {
    @Autowired
    ProdutoService service;

    @GetMapping(value = "/{id}")
    public ProdutoDTO findById(@PathVariable long id){
        return service.findById(id);
    }
}
