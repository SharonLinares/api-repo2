package com.linar.api2.api;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hola-que-hace")
public class HolaMundo {

    @GetMapping
    public String holaMundo() {
        return "Hola - Sharon!";
    }

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola - Sharon! ¿Cómo estas?";
    }

    @GetMapping("/saludo/{nombre}")
    public String saludo(@PathVariable(name = "nombre") final String nombre) {
        return "Hola - "  + nombre + "! ¿Cómo estas?";
    }

    @GetMapping("/quien-soy")
    public String quienSoy(@RequestParam(name = "nombre") final String nombre) {
        return "Soy: " + nombre;
    }

}

