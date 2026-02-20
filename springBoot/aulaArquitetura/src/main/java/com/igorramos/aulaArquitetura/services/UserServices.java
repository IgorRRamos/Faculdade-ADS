package com.igorramos.aulaArquitetura.services;

import com.igorramos.aulaArquitetura.Entities.User;
import com.igorramos.aulaArquitetura.dto.UserDTO;
import com.igorramos.aulaArquitetura.repositorys.UserRepositorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    UserRepositorys repository;

    public UserDTO findById(long id) {
        User entity = repository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }

}

