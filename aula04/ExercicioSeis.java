package br.com.qm.aula04;	

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// 6. Faça um programa que receba do usuário um vetor com 10 posições.
		// Em seguida deverá ser impresso o maior e o menor elemento do vetor.

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[10];
		int auxMenor = 0, auxMaior = 0;

		System.out.println("Vamos descobrir o Maior e Menor número? ");

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite o número para guardar: ");
			vetor[i] = teclado.nextInt();
		}
		auxMenor = vetor[0];
		auxMaior = vetor[0];

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] < auxMenor) {

				auxMenor = vetor[i];
			} else if (vetor[i] > auxMaior) {

				auxMaior = vetor[i];
			}

		}
		
		System.out.printf("\nO menor número digitado foi: %d\n", auxMenor);
		System.out.printf("O maior número digitado foi: %d", auxMaior);
		
		teclado.close();
	}

}
