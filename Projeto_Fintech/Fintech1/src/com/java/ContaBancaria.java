package com.java;

public class ContaBancaria {
	private int numero;
	private int agencia;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int num, int ag, double saldo) {
		this.setNumero(num);
		this.setAgencia(ag);
		this.setSaldo(saldo);
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
