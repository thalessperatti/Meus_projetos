package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;
import br.com.fiap.banco.ContaCorrente;

public class Teste {
	public static void main(String[] args) {
		//Conta conta = new Conta();
		/* cap6
		conta.depositar(50);
		conta.setAgencia(123);
		conta.setNumero(321);
		
		conta.depositar(100);
		
		System.out.println(conta.getSaldo());
		
		Conta poupanca = new Conta(254,123,1000);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.getSaldo());
		*/
		
		//cap8
		Conta conta1 = new Conta();
		conta1.depositar(1000);
		conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		
		System.out.println("Conta1: " + conta1.getSaldo());
		System.out.println("Conta2: " + conta2.getSaldo());
		System.out.println("Conta3: " + conta3.getSaldo());
		
	}
}
