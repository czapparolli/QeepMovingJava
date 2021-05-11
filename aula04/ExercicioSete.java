package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// 7. Escreva um programa que leia 10 n�meros inteiros e os armazene em um
		// vetor.
		// Imprima o vetor, o maior elemento e a posi��o que ele se encontra.

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[4];
		int auxMaior = 0, posicaoMaior = 0;

		System.out.println("Vamos descobrir o Maior n�mero e sua posi��o?");

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite o n�mero para guardar: ");
			vetor[i] = teclado.nextInt();
		}

		auxMaior = vetor[0];

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > auxMaior) {

				auxMaior = vetor[i];
				posicaoMaior = i;
			}

		}

		System.out.printf("\nO maior n�mero digitado foi: %d e a sua posi��o �: %d", auxMaior, posicaoMaior);

		teclado.close();
	}

}