package com.igorramos.arquitetura.services;

import com.igorramos.arquitetura.dtos.VendedorDTO;
import com.igorramos.arquitetura.entities.Vendedor;
import com.igorramos.arquitetura.repositorys.VendedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {
    @Autowired
    VendedorRepositorio vendedorRepo;

    public VendedorDTO findById(long id){
        Vendedor vendedor = vendedorRepo.findById(id).get();
        VendedorDTO dto = new VendedorDTO(vendedor);
        return dto;
    }
}
