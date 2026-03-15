package com.example.arquiteturaByLayer.controllers;

import com.example.arquiteturaByLayer.dtos.ClienteDTO;
import com.example.arquiteturaByLayer.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")

public class ClienteContrroller {
    @Autowired
    ClienteService service;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable long id){
        return service.findById(id);
    }
}
