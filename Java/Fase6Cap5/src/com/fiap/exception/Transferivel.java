package com.fiap.exception;

public interface Transferivel {
	
	public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor);
	public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor);
	
	default boolean realizarTransferenciaInterna(int nrAgenciaDestino, int nrContaDestino, double valor) {
		
		//regra de negócio
		return true;
	}

}
