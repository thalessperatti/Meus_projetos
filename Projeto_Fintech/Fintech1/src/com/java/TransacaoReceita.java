package com.java;

public class TransacaoReceita extends Transacao {
	
private double valor;
	
	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	public void receita(double valor) {
		this.setSaldo(this.getSaldo()+ valor);
	}
}
