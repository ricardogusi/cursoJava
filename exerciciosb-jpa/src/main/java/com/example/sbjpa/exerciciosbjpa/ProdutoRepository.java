package com.example.sbjpa.exerciciosbjpa;

import org.springframework.data.repository.CrudRepository;

import Model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
