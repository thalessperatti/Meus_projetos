package com.fiap.exception;

public class ContaCorrente extends Conta implements Transferivel{
	
	private double limite;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}
	
	@Override
	public double verificarSaldo() {
		return saldo + limite;
	}

	@Override
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
		return false;
	}

	@Override
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
		return false;
	}

}
