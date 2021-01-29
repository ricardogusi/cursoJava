package com.example.exerciciossb.models;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;

	private String nome;

	public Produto() {

	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
