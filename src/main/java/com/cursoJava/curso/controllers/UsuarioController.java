package com.cursoJava.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UsuarioController {


    @RequestMapping()
    public String prueba(){
        return "prueba";
    }

}
