package br.com.fiap.tds;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) { 
		//exemplo de convers?o de vari?veis:
		int x = 10; //declara??o de uma vari?vel do tipo int
		double d = x; //vari?vel double recebe o tipo int
		long l = x; //vari?vel long recebe o tipo int
		float f = x; //vari?vel float recebe o tipo int
		short s = 20; //declara??o de uma vari?vel do tipo short
		x = s; //vari?vel int recebe o tipo short
		
		System.out.println(x);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
		System.out.println(s);
	}

}
