package com.A11.springcontroller_A11.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teste")
public class UsuarioController {

    @GetMapping
    public String mensagem (){
        return "Oi eu sou o Goku!";
    }

}
