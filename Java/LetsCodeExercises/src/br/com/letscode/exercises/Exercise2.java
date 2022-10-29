package br.com.letscode.exercises;

public class Exercise2 {
	
	//Questão 2.
	//Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
	//9/5) + 32 = 32 °F
	
	private double celcius;
	private double f;
	
	public void temperatura(double celcius) {
		this.celcius = celcius;
		
		double f = (celcius * 9.0/5.0) + 32;
		System.out.println("Sua temperatura em graus Fahrenheit é " + f + "F");
		
	}
}
