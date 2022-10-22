package com.example.fundamentospringboot.controllers;

import com.example.fundamentospringboot.model.entidades.Produto;
import com.example.fundamentospringboot.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome){
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);

        return produto;
    }
}
