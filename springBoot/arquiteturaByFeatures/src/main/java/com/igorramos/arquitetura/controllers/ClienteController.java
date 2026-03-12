package com.igorramos.arquitetura.controllers;

import com.igorramos.arquitetura.dtos.ClienteDTO;
import com.igorramos.arquitetura.entities.Cliente;
import com.igorramos.arquitetura.services.ClienteService;
import lombok.Getter;
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
    public ClienteDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
