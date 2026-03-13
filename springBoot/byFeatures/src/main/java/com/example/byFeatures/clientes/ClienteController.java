package com.example.byFeatures.clientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")

public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable long id){
        return clienteService.findById(id);
    }
}
