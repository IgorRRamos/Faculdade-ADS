package com.igorramos.arquitetura.services;

import com.igorramos.arquitetura.dtos.ClienteDTO;
import com.igorramos.arquitetura.entities.Cliente;
import com.igorramos.arquitetura.repositorys.ClientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    ClientesRepositorio clienteRepo;

    public ClienteDTO findById(long id){
        Cliente cliente = clienteRepo.findById(id).get();
        ClienteDTO dto = new ClienteDTO(cliente);
        return dto;
    }
}
