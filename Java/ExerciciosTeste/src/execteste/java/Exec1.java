package execteste.java;

import java.util.Scanner;

public class Exec1 {

	// 1. Escreva um programa que, com base em uma temperatura em graus celsius, a
	// converta e exiba em Kelvin (K), R�aumur (Re), Rankine (Ra) e Fahrenheit (F),
	// seguindo as f�rmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C
	// * 1.8 + 32 + 459.67

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a temperatura em graus Celcius: ");
		Double c = sc.nextDouble();

		Double f = (c * 1.8) + 32;
		Double k = c + 273.15;
		Double Re = c * 0.8;
		Double r = (c * 1.8) + 32 + 459.67;

		System.out.println("Sua temperatura em graus Celcius � de " + c + "�C.");
		System.out.println("Sua temperatura em graus Fahrenheit � de " + f + "�F.");
		System.out.println("Sua temperatura em graus Kelvin � de " + k + " K.");
		System.out.println("Sua temperatura em graus R�aumur � de " + Re + "�R.");
		System.out.println("Sua temperatura em graus Rankine � de " + r + "�Ra.");

		sc.close();
	}

}
