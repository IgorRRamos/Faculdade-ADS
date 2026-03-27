package com.arquitetura.byFeatures.pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ClienteController {
    @Autowired
    ClienteService clienteService;

    public ClienteDTO findById(long id){
        return clienteService.findById(id);
    }
}
