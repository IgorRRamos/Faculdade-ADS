package com.igorramos.arquitetura.controllers;

import com.igorramos.arquitetura.dtos.VendedorDTO;
import com.igorramos.arquitetura.entities.Vendedor;
import com.igorramos.arquitetura.repositorys.VendedorRepositorio;
import com.igorramos.arquitetura.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendedores")
public class VendedorController {
    @Autowired
    VendedorService vendedorService;

    @GetMapping(value = "/{id}")
    public VendedorDTO findById(@PathVariable long id) {
        return vendedorService.findById(id);
    }
}
