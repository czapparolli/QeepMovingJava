package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// 3. Escreva um programa que leia 10 n�meros e escreva
		// o menor valor lido e o maior valor lido.

		Scanner teclado = new Scanner(System.in);

		System.out.println("Maior e menor entre 10 n�meros");

		int auxMenor = 0;
		int auxMaior = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o n�mero: ");
			int numero = teclado.nextInt();
			if (numero > auxMaior) {

				auxMaior = numero;

			}

			else if (numero < auxMenor) {

				auxMenor = numero;

			}

		}
		System.out.printf("\nO n�mero maior �: %d\n", auxMaior);
		System.out.printf("O n�mero menor �: %d\n", auxMenor);
		teclado.close();
	}

}
