package br.com.fiap.tds;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor, informe seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Agora, informe sua idade: ");
		int idade = sc.nextInt();

		if (idade < 0) {
			System.out.println(nome + " esta idade ? inv?lida");
		} else if (idade >= 18 && idade < 70) {
			System.out.println(nome + " voc? ? maior de idade");
		} else if (idade >= 70) {
			if (idade >= 100) {
				System.out.println(nome + " voc? j? ? um centen?rio");
			} else {
				System.out.println(nome + " voc? est? na terceira idede ou tamb?m conhecida como melhor idade");
			}
		} else {
				System.out.println("Menor idade");
			}
		sc.close();
		}
	}