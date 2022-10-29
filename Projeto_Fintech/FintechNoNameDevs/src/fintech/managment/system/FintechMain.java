package fintech.managment.system;

import fintech.managment.system.TransacaoDespesas;

public class FintechMain {

	public static void main(String[] args) {
		
		TransacaoDespesas despesas = new TransacaoDespesas();
		despesas.setSaldo(100);	
		despesas.retirar(30);
		
		System.out.println(despesas.getSaldo());
	}
}
