package com.java;

public class Transacao {

	private double saldo;
	
	
	public Transacao() {
		
	}
	
	public Transacao (double saldo) {
		this.setSaldo (saldo);
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
