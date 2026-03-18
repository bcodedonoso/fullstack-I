package com.holamundo.cl.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundoController {

    @GetMapping("/hola")
    public String getMethodName() {
        return new String("hola mundo");

    }
}
