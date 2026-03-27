package com.arquitetura.byFeatures.pessoas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ClienteDTO findById(long id){
        Cliente cliente = clienteRepository.findById(id).get();
        ClienteDTO dto = new ClienteDTO(cliente);
        return dto;
    }
}
