package br.com.letscode.exercises;

public class Exercise1 {
	//Quest�o 1.
	//Escreva um programa que informa a tabuada de multiplica��o de um
	//n�mero informado pelo usu�rio (entre 1-10). Exemplo:
	//Entre com um n�mero de 1 a 10
	
	private int num;
	
	public void tabuada(int num) {
		this.num = num;
		
		for (int x = 1; x <= 10; x++) {
			int tab = num * x;
			System.out.println(x + " x " + num + " = " + tab);
		}
		
	}
}
