package com.arquitetura.aula1.services;

import com.arquitetura.aula1.dtos.VendedorDTO;
import com.arquitetura.aula1.entities.Vendedor;
import com.arquitetura.aula1.repositorys.ProdutoRepository;
import com.arquitetura.aula1.repositorys.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository vendedorRepository;

    public VendedorDTO findById(long id){
        Vendedor vendedor = vendedorRepository.findById(id).get();
        VendedorDTO dto = new VendedorDTO(vendedor);
        return dto;
    }

}
