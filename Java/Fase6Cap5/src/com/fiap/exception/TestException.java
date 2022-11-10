package com.fiap.exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TestException {
	public static void main(String[] args) {
		/*
		try {
			//trecho onde a exce��o pode acontecer
			int val = 10 / 0;
			System.out.println(val);
		} catch (Exception e) { //Captura da exce��o
			//tratamento da exce��o
			e.printStackTrace();
		}*/
		
		
		//Exce��es Unchecked
		/*
		try {
			
			int val = 10/0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
		} catch (ArithmeticException e) {
			
			System.out.println("N�o � poss�vel realizar uma divis�o por zero1");
			
			//Mensagem com a lista de erros
			System.out.println(e.getMessage());
			//Imprime a pilha de erro da exce��o
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("N�o � poss�vel acessar a posi��o 4 do array!");
			
		} catch (NullPointerException e) {
			
			System.out.println("N�o foi poss�vel retornar o lenth, vari�vel nome n�o instanciada!");
			
		} catch (NumberFormatException e) {
			
			System.out.println("N�o foi poss�vel realizar a convers�o!");
			
		} catch (Exception e) {			
			
			System.out.println("Erro na execu��o do programa!");
			
		}
		//finally {
		//System.out.printin("Sempre passar� aqui!);
		//}*/
		
		/*
		Scanner sc = new Scanner(System.in);
			try {
				//L� os dois n�meros
				System.out.println("Por favor, digite o primeiro n�mero: ");
				int numero1 = sc.nextInt();
				System.out.println("Agora digite o segundo n�mero: ");
				int numero2 = sc.nextInt();
				//Realiza a divis�o
				int divisao = numero1 / numero2;
				//Exibe o resultado
				System.out.println("O resultado �: " + divisao);
			} catch (ArithmeticException e) {
				System.err.println("Erro ao dividir por zero!");
			} catch (InputMismatchException e) {
				System.err.println("Erro de entrada de dados!");
			} finally {
				System.out.println("Finalizando a execu��o do programa!");
				sc.close();
			}*/
		
		
		//Cria uma nova inst�ncia de conta
		Conta cc = new ContaCorrente();
		try {
			cc.sacar(20);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
	}
}
