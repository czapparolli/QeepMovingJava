package br.com.qm.aula04;

public class ExercicioUm {

	public static void main(String[] args) {
		// 1. Faça um programa que possua um vetor denominado A que armazene 6 números
		// inteiros.
		// O programa deve executar os seguintes passos:
		// Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		// Armazene em uma variável inteira (simples) a soma entre os valores das
		// posições A[0], A[1] e
		// A[5] do vetor e mostre na tela esta soma.
		// Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		// Mostre na tela cada valor do vetor A, um em cada linha.

		System.out.println("NOSSO PRIMEIRO ARRAY ! ! !\n");
		int[] A = { 1, 0, 5, -2, -5, 7 };

		int soma = A[0] + A[1] + A[5];
		System.out.printf("A soma das posições é: %d\n\n", soma);

		A[4] = 100;
		
		System.out.println("Os valores da Array são: ");
		for (int i = 0; i < A.length; i++) {
			
			System.out.println(A[i]);

		}
		
	}	

}
