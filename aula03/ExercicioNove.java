package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// 9. Faça um programa que calcule o fatorial de um número
		// inteiro fornecido pelo usuário.
		int fatorial = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o número para saber seu fatorial: ");
		int numeroLido = teclado.nextInt();
		teclado.close();
		
		for (fatorial = 1; numeroLido > 1; numeroLido--) {
			fatorial = fatorial * numeroLido;

		}

		System.out.printf("Fatorial calculado: %d", fatorial);

	}

}
