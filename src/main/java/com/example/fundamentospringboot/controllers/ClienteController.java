package com.example.fundamentospringboot.controllers;

import com.example.fundamentospringboot.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28L, "Artur", "056.501.405-61");
    }

    @GetMapping("/{id}")
    public Cliente ObterCLientePorId1(@PathVariable  Long id){
        return new Cliente(id, "Artur", "056,501,405-61");
    }
}
