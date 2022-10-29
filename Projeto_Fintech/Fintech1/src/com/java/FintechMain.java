package com.java;

public class FintechMain {

	public static void main(String[] args) {
		
		TransacaoDespesas conta1 = new TransacaoDespesas();
		conta1.setSaldo(100);

		conta1.despesa(40);
		
		System.out.println("O saldo atualizado da conta1: "+ conta1.getSaldo());
		
		
		TransacaoReceita conta2 = new TransacaoReceita();
		conta2.setSaldo(200.34);
		conta2.receita(345);
		
		System.out.println("O saldo atualizado da conta2: "+ conta2.getSaldo());
		
		
	
	}
}
