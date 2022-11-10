package com.fiap.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TestException {
	public static void main(String[] args) {
		/*
		try {
			//trecho onde a exceção pode acontecer
			int val = 10 / 0;
			System.out.println(val);
		} catch (Exception e) { //Captura da exceção
			//tratamento da exceção
			e.printStackTrace();
		}*/
		
		
		//Exceções Unchecked
		/*
		try {
			
			int val = 10/0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
		} catch (ArithmeticException e) {
			
			System.out.println("Não é possível realizar uma divisão por zero1");
			
			//Mensagem com a lista de erros
			System.out.println(e.getMessage());
			//Imprime a pilha de erro da exceção
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Não é possível acessar a posição 4 do array!");
			
		} catch (NullPointerException e) {
			
			System.out.println("Não foi possível retornar o lenth, variável nome não instanciada!");
			
		} catch (NumberFormatException e) {
			
			System.out.println("Não foi possível realizar a conversão!");
			
		} catch (Exception e) {			
			
			System.out.println("Erro na execução do programa!");
			
		}
		//finally {
		//System.out.printin("Sempre passará aqui!);
		//}*/
		
		/*
		Scanner sc = new Scanner(System.in);
			try {
				//Lê os dois números
				System.out.println("Por favor, digite o primeiro número: ");
				int numero1 = sc.nextInt();
				System.out.println("Agora digite o segundo número: ");
				int numero2 = sc.nextInt();
				//Realiza a divisão
				int divisao = numero1 / numero2;
				//Exibe o resultado
				System.out.println("O resultado é: " + divisao);
			} catch (ArithmeticException e) {
				System.err.println("Erro ao dividir por zero!");
			} catch (InputMismatchException e) {
				System.err.println("Erro de entrada de dados!");
			} finally {
				System.out.println("Finalizando a execução do programa!");
				sc.close();
			}*/
		
		
		//Cria uma nova instância de conta
		Conta cc = new ContaCorrente();
		try {
			cc.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
