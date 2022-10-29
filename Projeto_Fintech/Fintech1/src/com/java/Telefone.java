package com.java;

public class Telefone {		
		
	private int prefixo;
	private int numero;	
	
	public Telefone() {
		
	}
	
	public Telefone(int pref, int tel) {
		this.setPrefixo(pref);
		this.setNumero(tel);
	}
	
	public int getPrefixo() {
		return prefixo;
	}



	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}
}
