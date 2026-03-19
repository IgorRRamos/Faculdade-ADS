package com.arquitetura.arquiteturaByLayer.controllers;

import com.arquitetura.arquiteturaByLayer.dtos.ClienteDTO;
import com.arquitetura.arquiteturaByLayer.services.ClienteService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")

@Getter
@Setter

public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable long id){
        return service.findById(id);
    }
}
