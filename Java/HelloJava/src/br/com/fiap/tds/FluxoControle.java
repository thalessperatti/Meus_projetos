package br.com.fiap.tds;

public class FluxoControle {

	public static void main(String[] args) {

		int idade = 100;

		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70 ){
			if (idade >= 100) {
				System.out.println("Centenário");
			} else {
				System.out.println("Terceira idade");
			}
		} else {
			System.out.println("Menor idade");
		}
	}
}
