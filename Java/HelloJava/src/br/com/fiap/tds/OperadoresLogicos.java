package br.com.fiap.tds;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);
		
		int nrAmarelo = 2, nrVermelho = 1;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);
		
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		int idade1 = 20;
		boolean maioridade = !(idade1 >= 18);
		System.out.println(maioridade);

	}

}
