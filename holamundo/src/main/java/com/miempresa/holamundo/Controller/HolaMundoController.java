package com.miempresa.holamundo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
    @GetMapping("/")
    public String saludar() {
        return "¡Hola mundo desde Spring Boot!";
    }
    
}
