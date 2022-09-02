package br.com.fiap.tds;

import java.util.Scanner;

public class UltimoExemploCap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        int resto = soma % 2;
        if (resto == 0){
            System.out.println("O resultado é " + soma + " e é um número par");
        } else {
            System.out.println("O resultado é " + soma + " e é um número ímpar");
        }

        sc.close();
    }
}
