package com.arquitetura.aula1.controllers;

import com.arquitetura.aula1.dtos.ClienteDTO;
import com.arquitetura.aula1.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable long id){
        return service.findById(id);
    }

}
