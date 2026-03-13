package com.example.byFeatures.vendedores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class VendedorService {
    @Autowired
    VendedoresRepository repository;

    public VendedoresDTO findById(long id){
        Vendedor vendedor = repository.findById(id).get();
        VendedoresDTO dto = new VendedoresDTO(vendedor);
        return dto;
    }
}
