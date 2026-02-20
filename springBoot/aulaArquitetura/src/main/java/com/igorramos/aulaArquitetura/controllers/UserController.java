package com.igorramos.aulaArquitetura.controllers;

import com.igorramos.aulaArquitetura.dto.UserDTO;
import com.igorramos.aulaArquitetura.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices services;

    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable long id){
        return services.findById(id);
    }

}
