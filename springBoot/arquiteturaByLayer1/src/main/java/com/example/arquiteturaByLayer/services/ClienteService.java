package com.example.arquiteturaByLayer.services;

import com.example.arquiteturaByLayer.dtos.ClienteDTO;
import com.example.arquiteturaByLayer.entities.Cliente;
import com.example.arquiteturaByLayer.repositorys.ClienteRepository;
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
