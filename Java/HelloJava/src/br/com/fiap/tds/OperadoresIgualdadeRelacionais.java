package br.com.fiap.tds;

public class OperadoresIgualdadeRelacionais {

	public static void main(String[] args) {
		
		int idade = 10;
		boolean maioridade = idade > 18; //maior
		System.out.println(maioridade);
		
		int idade1 = 10;
		boolean maioridade1 = idade1 == 18; //igual
		System.out.println(maioridade1);
		
		int idade2 = 10;
		boolean maioridade2 = idade2 != 18; //diferente
		System.out.println(maioridade2);
		
		int idade3 = 18;
		boolean maioridade3 = idade3 >= 18; //maior igual
		System.out.println(maioridade3);
		
	}

}
