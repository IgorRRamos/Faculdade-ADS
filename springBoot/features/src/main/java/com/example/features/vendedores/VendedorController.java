package com.example.features.vendedores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendedores")

public class VendedorController {
    @Autowired
    VendedorService service;

    @GetMapping(value = "/{id}")
    public VendedorDTO findById(@PathVariable long id){
        return service.findById(id);
    }
}
