package com.example.arquiteturaByLayer.services;

import com.example.arquiteturaByLayer.dtos.VendedorDTO;
import com.example.arquiteturaByLayer.entities.Vendedor;
import com.example.arquiteturaByLayer.repositorys.VendedorRepository;
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
