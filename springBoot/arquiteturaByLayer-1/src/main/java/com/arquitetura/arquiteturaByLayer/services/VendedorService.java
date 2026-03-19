package com.arquitetura.arquiteturaByLayer.services;

import com.arquitetura.arquiteturaByLayer.dtos.VendedorDTO;
import com.arquitetura.arquiteturaByLayer.entities.Vendedor;
import com.arquitetura.arquiteturaByLayer.repositorys.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VendedorService {
    @Autowired
    VendedorRepository repository;

    public VendedorDTO findById(long id){
        Vendedor vendedor = repository.findById(id).get();
        VendedorDTO dto = new VendedorDTO(vendedor);
        return dto;
    }
}
