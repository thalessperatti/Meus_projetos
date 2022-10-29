package br.com.letscode;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		
		/* HelloWorld (aula 2)
		String nome;
		nome = "Thales";
		System.out.println("Ol�, " + nome);
		*/
		
		/* vari�veis (aula 3)
		int a;
		int b = 2;
		a = 3;
		int soma = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		float divisao = (float) a / b;
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		*/
		
		/* (aula 4)
		//booleans
		boolean fimDeSemana = false;
		boolean fazendoSol = true;
		boolean vamosAPraia = fimDeSemana && fazendoSol;
						
		//Tabela verdade
		// Operador && (AND)
		//true && true = true
		//true && false = false
		//false && true = false
		//false && false = false
		
		//Operador || (OR)
		//true || true = true 
		//true || false = true
		//false || true = true
		//false|| false = false
		
		System.out.println(vamosAPraia);
		//Operador tern�rio
		String mensagem = fimDeSemana ? "� fim de semana" : "N�o � fim de semana";
		System.out.println(mensagem);
		*/
		
		/*
		//Estruturas Condicionais (aula 5)
		//if(se)-else(se n�o)
		int nota = 0;
		String graduacao;
		
		//nota maior ou igual 70, ent�o aprovado
		//ex. 1
		if (nota >= 70) {
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("N�o aprovado.");
		}
		//ex.2
		//A = 80, B = 70, C = 60, D = 0
		if (nota >=80) {
			graduacao = "A";
		} else if (nota < 80 && nota >= 70) {
			graduacao = "B";
		} else if (nota < 70 && nota >= 60) {
			graduacao = "C";
		} else if (nota < 60 && nota >= 0) {
			graduacao = "D";
		} else {
			graduacao = "";
		}
		
		switch (graduacao) {
			case "A":
			case "B":
				System.out.println("Aluno aprovado");
				break;
			case "C":
			case "D":
				System.out.println("N�o aprovado");
				break;
			default:
				System.out.println("Gradua��o inv�lida");
		}*/
		
		/*
		//Manipula��o de Strings e Datas (aula 6)
		//Ol�, [nome]. Hoje � [dia-da-semana], BOM DIA
		
		String nome = "Thales";
		//System.out.println(nome.toUpperCase()); //tudo mai�sculo
		//System.out.println(nome.toLowerCase()); //tudo min�sculo
		//System.out.println(nome.length()); //qtde de caracteres
		
		//String nomeOutro = "thales";
		//System.out.println(nome.equals(nomeOutro)); //compara��o com o outro objeto
		//System.out.println(nome.equalsIgnoreCase(nomeOutro)); //n�o leva em considera��o o case sensitive
		
		
		//ISO 8601 (padr�o de data mundial)
		LocalDate hoje = LocalDate.now(); //para o Java reconhecer ser� necess�rio importar
		Locale brasil = new Locale("pt","BR"); //para o java reconhecer ser� necess�rio importar
		//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		if (agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom Dia";
		} else if (agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa Tarde";
		} else if (agora.getHour() <= 18 && agora.getHour() < 24) {
			saudacao = "Boa Noite";
		} else {
			saudacao = "";
		}
		
		System.out.printf("Ol�, %s. Hoje � %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
		*/
		
		/*
		//La�os Num�ricos (aula 7)
		//1 2 3 4 5 6 7 8 9 10
		//para uma vari�vel que inicia em 1, e vai at� 10, mudando 1-por-1, fa�a:
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		//para uma vari�vel que inicia em 1, e vai at� 10, mudando 2 em 2, fa�a:
		for (int x = 1; x <= 10; x += 2) {
			System.out.println(x);
		}
		
		//criando uma taboada com la�os aninhados
		for (int y = 1; y <= 10; y++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + "x" + y + " = " + j * y);
			}
		}
		*/
		
		
		/*
		//vetores ou arrays (aula 8)
			
		int[] numeros = new int[5]; //o array tem at� 5 posi��es
		//posi��es = [0][1][2][3][4]
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		String[] letras = new String[5];
		//posi��es = [0][1][2][3][4]
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		letras[3] = "X";
		letras[4] = "Z";
		for (int j = 0; j < letras.length; j++) {
			System.out.println(letras[j]);
		}
		
		String[] letras1 = {"T", "H", "A", "L", "E", "S"};
		for (int k = 0; k < letras1.length; k++) {
			System.out.println(letras1[k]);
		}
		
		System.out.println(Arrays.toString(letras)); //impress�o em formato de array
		System.out.println(Arrays.toString(letras1)); //impress�o em formato de array
		
				
		int[] numeros = {9,10,12,25,2};
		int maior = numeros[0];
		int menor = numeros[0];
		int media = 0;
		
		for (int i=0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			media += numeros[i];
		}
		
		System.out.println("Maior: "+ maior);
		System.out.println("Menor: "+ menor);
		System.out.println("M�dia: " + media/numeros.length);
		*/
		
		
		//fun��es (aula 9)
		/*
		//ex.1 - nome
		String nomeOriginal = "Let's Code";
		saudacao(nomeOriginal);
		*/
		/*
		//ex. 2 - contas
		int resultado = soma(2,3);
		System.out.println(resultado);
		*/
	
	//fun��es (aula 9)
	/*
	//ex.1 - nome
	public static void saudacao(String nomeParametro) {
		System.out.println("Hello, " + nomeParametro);
	}*/
	/*
	//ex.2 - contas
	public static int soma(int a, int b) {
		return a + b;
		*/

	}
}
