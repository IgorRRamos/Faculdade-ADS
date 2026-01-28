package com.saudacao.mensagemSaudacao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class SaudacaoController {

    @RequestMapping("/mensagem")
    public String saudacao(@RequestParam String nome){

        return "Olá " + nome + " seja bem vindo!";
    }

}
