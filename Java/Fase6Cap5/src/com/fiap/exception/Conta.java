package com.fiap.exception;

public abstract class Conta {
	
	protected double saldo;
	public static final int BANCO = 33;
	
	
	public void depositar(double valor) {
		
		if (valor < 0) {
			throw new ValorInvalidoException();
		}
		saldo = saldo + valor;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		
		if (valor > saldo){
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}
	
	public abstract double verificarSaldo();

}
