package com.arquitetura.arquiteturaByLayer.controllers;

import com.arquitetura.arquiteturaByLayer.dtos.VendedorDTO;
import com.arquitetura.arquiteturaByLayer.services.VendedorService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendedores")

@Getter
@Setter

public class VendedorController {
    @Autowired
    VendedorService service;

    @GetMapping(value = "/{id}")
    public VendedorDTO findById(@PathVariable long id){
        return service.findById(id);
    }
}
