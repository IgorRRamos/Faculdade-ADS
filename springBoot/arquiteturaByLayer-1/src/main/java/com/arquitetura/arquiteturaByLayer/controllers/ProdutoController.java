package com.arquitetura.arquiteturaByLayer.controllers;

import com.arquitetura.arquiteturaByLayer.dtos.ProdutoDTO;
import com.arquitetura.arquiteturaByLayer.services.ProdutoService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")

@Getter
@Setter

public class ProdutoController {
    @Autowired
    ProdutoService service;

    @GetMapping(value = "/{id}")
    public ProdutoDTO findById(@PathVariable long id){
        return service.findById(id);
    }

}
