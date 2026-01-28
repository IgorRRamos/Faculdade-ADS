package com.saudacao.mensagemSaudacao_A3.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/saudacao")
public class SaudacaoController {

    @GetMapping("/{nome}")
    public String mensagem(@PathVariable String nome){
        return "Olá " + nome + " Seja bem vindo!";
    }
}
