package com.java;

public class TransacaoDespesas extends Transacao {
	
	private double valor;
	
	
	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	public void despesa(double valor) {
		this.setSaldo(this.getSaldo()- valor);
	}
}
