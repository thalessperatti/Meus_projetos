package com.fiap.view;

import java.util.Scanner;

import com.fiap.entity.Produto;

public class Caixa {
	
	public static void main(String[] args) {
		
//		int qtdProdutos = 5;
//		int registro = 0;
		
		/*
		while (registro < qtdProdutos) {
			registro++;
			System.out.println("O produto n�mero " + registro + " foi registrado");
		}*/
		
		/*
		do {
			registro++;
			System.out.println("O caixa registrou o produto " + registro);
		} while (registro < qtdProdutos); 
		*/
		
		/*
		for (int i = 1; i <= qtdProdutos; i++) {
			
			System.out.println("O caixa registrou o produto " + i);
		}*/
		
		/*
		Scanner sc = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Digite um n�mero");
			int n1 = sc.nextInt();
			System.out.println("Digite outro n�mero");
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println("A soma � " + soma);
			System.out.println("Deseja somar outr n�mero? (s/n)");
			opcao = sc.next();
		} while(opcao.equals("s"));
		sc.close(); */
			
			
//		float valores[] = new float[5];
//		
//		valores[0] = 10;
//		valores[1] = 20;
//		valores[2] = 30;
//		valores[3] = 40;
//		valores[4] = 50;
		
//		float[] valores = {10, 20, 30, 40, 50};
//		float[] valores2 = new float[] {10,20,30,40,50};
// 		
//		System.out.println(valores[4]);
//		System.out.println(valores2[4]);

		
		/*
		//arrays (ligado a classe Produto)
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Lim�o");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Ma�a");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0] = prod1;
		produtos[1] = prod2;
		
//		for (int i=0; i < produtos.length; i++) {
//			System.out.println(produtos[i].toString());
//		}	
//		for (Produto prod: produtos) {
//			System.out.println(prod.toString());
//		}
		
		// 10 corredores com tr�s prateleiras cada
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[0][1] = prod1;
		localizacaoProduto[1][1] = prod2;
		
		System.out.println(localizacaoProduto[0][1].getNome());
		*/
		
		/*
		//Programa para informar a nota de 10 alunos e calcular a m�dia
		Scanner sc = new Scanner(System.in);
		float[] notas = new float[10];
		for (int i=0; i < notas.length; i++) {
			System.out.println("Digite a nota do aluno: ");
			notas[i] = sc.nextFloat();
		}
		sc.close();
		
		float totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			totalNotas = totalNotas + notas[i];
		}
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A m�dia dos alunos � " + mediaNotas);
		*/
		
		/*
		//compara��o de strings com o operador ==
		//Ex1.: strings instanciadas
		String nome = new String("FIAP");
		String nome2 = new String("Fiap");
		
		if (nome == nome2) {
			System.out.println("No exemplo 1 as strings s�o iguais.");
		} else {
			System.out.println("No exemplo 1 as strings s�o diferentes");
		}
		//Ex2.: strings n�o instanciadas
		String nome3 = "FIAP";
		String nome4 = "FIAP";
		
		if (nome3 == nome4) {
			System.out.println("No exemplo 2 as strings s�o iguais.");
		} else {
			System.out.println("No exemplo 2 as strings s�o diferentes.");
		}*/
		
		/*
		//compara��o de strings com m�todos (equals / equalsIgnoreCase)
		String nome = "Ma�a";
		String nome2 = new String("Ma�a");
		
		if (!nome.equals(nome2)) {
			System.out.println("As strings s�o diferentes.");
		}else {
			System.out.println("As strings s�o iguais");
		}*/
		
		/*
		//m�todos
		//startsWith() - inicia com
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		if (facu.startsWith("FIAP")) {
//			System.out.println("A string come�a com FIAP.");
//		}else {
//			System.out.println("A string n�o come�a com FIAP.");
//		}
		
		//endsWith() - termina com
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		if (facu.endsWith("gia.")) {
//			System.out.println("A string termina com gia.");
//		} else {
//			System.out.println("A string n�o termina com gia.");
//		}
		
		//length() - quantos caracteres tem na string
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		int caracteres = facu.length();
//		System.out.println("A string possui " + caracteres + " caracteres.");
		
		//charAt(x) - caractere presente na posi��o x
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		char caractere = facu.charAt(12);
//		System.out.println("O segundo caractere da string � " + caractere);
		
		//indexOf(x) - �ndice da primeira ocorr�ncia de "x" na string
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		int posicao = facu.indexOf("a");
//		System.out.println("O �ndice do caractere 'a' na string � "+ posicao);
		
		//lastIndexOf(x) - �ndice da �ltima ocorr�ncia de "x" na string
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		int posicao = facu.lastIndexOf("a");
//		System.out.println("O �ndice do �ltimo caractere 'a' na string � "+ posicao);
//		
//		int posicao1 = facu.lastIndexOf("faculdade");
//		System.out.println("O �ndice da �ltima palavra \"faculdade\" na string � "+ posicao1);
		
		//substring(x,y) - gera��o de uma nova string iniciando no �ndice x e terminando um �ndice antes do �ndice y
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		String nova = facu.substring(16,39);
//		System.out.println("A nova string �: " + nova);

		//misturando m�todos
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		String nova = facu.substring(facu.indexOf("m"),25);
//		System.out.println("A nova string �: " + nova);
		
		//toUpperCase() - altera todas as letras para mai�sculo
//		String facu = "fiap";
//		String nova = facu.toUpperCase();
//		System.out.println("A nova string �: " + nova);
		
		//toLowerCase() - altera todas as letras para min�sculo
//		String facu = "FIAP";
//		String nova = facu.toLowerCase();
//		System.out.println("A nova string �: " + nova);
		
		//replace(x,y) - altera o valor x pelo valor y
//		String facu = "FIAP - A melhor faculdade de tecnologia.";
//		String nova = facu.replace("a","x");
//		System.out.println("A nova string �: " + nova);
//		
//		String nova = facu.replace("tecnologia", "S�o Paulo");
//		System.out.println("A nova string �: " + nova);

		//split() - separa a string em v�rias conforme o delimitador informado entre par�nteses
		String facu = "FIAP - A melhor faculdade de tecnologia.";
		String[] palavras = facu.split(" ");
		for (String p: palavras) {
			System.out.println(p);
		}*/
		
		
		
		
	}

}
