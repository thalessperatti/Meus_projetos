package execteste.java;

import java.util.Scanner;

public class Exec1 {

	// 1. Escreva um programa que, com base em uma temperatura em graus celsius, a
	// converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
	// seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C
	// * 1.8 + 32 + 459.67

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em graus Celcius: ");
		Double c = sc.nextDouble();

		Double f = (c * 1.8) + 32;
		Double k = c + 273.15;
		Double Re = c * 0.8;
		Double r = (c * 1.8) + 32 + 459.67;

		System.out.println("Sua temperatura em graus Celcius é de " + c + "ºC.");
		System.out.println("Sua temperatura em graus Fahrenheit é de " + f + "ºF.");
		System.out.println("Sua temperatura em graus Kelvin é de " + k + " K.");
		System.out.println("Sua temperatura em graus Réaumur é de " + Re + "ºR.");
		System.out.println("Sua temperatura em graus Rankine é de " + r + "ºRa.");

		sc.close();
	}

}
