package com.java;

public class Usuario {
	
	private int id;
	private String nome;
	private int cpf;
	
	public Usuario() {
		
	}
	
	public Usuario (int id, String nome, int cpf) {		
		this.setId(id);
		this.setNome(nome);
		this.setCpf(cpf);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


}
