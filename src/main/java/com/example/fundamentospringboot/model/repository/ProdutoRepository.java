package com.example.fundamentospringboot.model.repository;

import com.example.fundamentospringboot.model.entidades.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer > {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
