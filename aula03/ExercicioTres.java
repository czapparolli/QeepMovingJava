package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// 3. Escreva um programa que leia 10 números e escreva
		// o menor valor lido e o maior valor lido.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Maior e menor entre 10 números");

		int auxMenor = 0;
		int auxMaior = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o número: ");
			int numero = teclado.nextInt();
			if (numero > auxMaior) {

				auxMaior = numero;

			}

			else if (numero < auxMenor) {

				auxMenor = numero;

			}

		}
		System.out.printf("\nO número maior é: %d\n", auxMaior);
		System.out.printf("O número menor é: %d\n", auxMenor);
		teclado.close();
	}

}
