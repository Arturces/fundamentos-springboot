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
    public Cliente ObterclientePorId1(@PathVariable  Long id){
        return new Cliente(id, "Artur", "056,501,405-61");
    }

    @GetMapping
    public Cliente obterClienteporId2(@RequestParam(name = "id", defaultValue = "1") Long id){
        return new Cliente(id,"César", "239.704.305-00"); 
    }
}
