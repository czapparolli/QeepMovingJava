package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// 1. Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes.
		// A primeira vez com "for", a segunda com "while" e a terceira com "do while".
		Scanner teclado = new Scanner(System.in);

		System.out.println("Contando de 1 até 100 com for");

		for (int i = 1; i <= 100; i++) {
			System.out.printf("%d\n", i);
		}
		System.out.println("\n###Esperando 5 segundos...###\n");

		try {Thread.sleep(5000);} catch (InterruptedException ex) {}

		int i = 1;
		while (i <= 100) {
			System.out.printf("%d\n", i);
			i++;
		}

		try {Thread.sleep(5000);} catch (InterruptedException ex) {}

		System.out.println("\n###Esperando 5 segundos...###\n");

		int cont = 1;
		do {

			System.out.printf("%d\n", cont);
			cont++;

		} while (cont != 101);
		
		teclado.close();
	}

}
