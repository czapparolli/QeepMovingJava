package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// 7. Escreva um programa que leia 10 números inteiros e os armazene em um
		// vetor.
		// Imprima o vetor, o maior elemento e a posição que ele se encontra.

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[4];
		int auxMaior = 0, posicaoMaior = 0;

		System.out.println("Vamos descobrir o Maior número e sua posição?");

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite o número para guardar: ");
			vetor[i] = teclado.nextInt();
		}

		auxMaior = vetor[0];

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > auxMaior) {

				auxMaior = vetor[i];
				posicaoMaior = i;
			}

		}

		System.out.printf("\nO maior número digitado foi: %d e a sua posição é: %d", auxMaior, posicaoMaior);

		teclado.close();
	}

}