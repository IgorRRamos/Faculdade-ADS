package com.controller_A4.saudacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/saudacao")
public class SaudacaoController {

    @GetMapping("/{nome}")
    public Map<String, String> saudar(@PathVariable String nome){
        Map<String, String> resposta = new HashMap<>();
        resposta.put("mensagem", "Olá, " + nome + "!");
        resposta.put("status", "sucesso");

        return resposta;
    }
}
