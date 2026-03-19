package com.arquitetura.arquiteturaByLayer.services;

import com.arquitetura.arquiteturaByLayer.dtos.ClienteDTO;
import com.arquitetura.arquiteturaByLayer.entities.Cliente;
import com.arquitetura.arquiteturaByLayer.repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository repository;

    public ClienteDTO findById(long id){
        Cliente cliente = repository.findById(id).get();
        ClienteDTO dto = new ClienteDTO(cliente);
        return dto;
    }
}
