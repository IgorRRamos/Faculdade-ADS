package com.p20.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exemplo")
public class ExemploController {

    @GetMapping(value = "/{áme}")
    public String exemplo(@PathVariable("nome") String nome){
        return "Olá " + nome;
    }

}
