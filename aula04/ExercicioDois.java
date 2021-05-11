package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os
		// valores lidos.

		Scanner teclado = new Scanner(System.in);

		int[] valoresLidos = new int[6];
		System.out.println(" - LER 6 VALORES - ");

		for (int i = 0; i < valoresLidos.length; i++) {
			System.out.printf("Digite um valor para a posição %d do vetor: ", i);
			valoresLidos[i] = teclado.nextInt();
		}

		System.out.println();

		for (int valor : valoresLidos) {

			System.out.printf("Os valores foram: %d\n", valor);
		}

		teclado.close();
	}

}
