package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// 9. Fa�a um programa que calcule o fatorial de um n�mero
		// inteiro fornecido pelo usu�rio.
		int fatorial = 1;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o n�mero para saber seu fatorial: ");
		int numeroLido = teclado.nextInt();
		teclado.close();
		
		for (fatorial = 1; numeroLido > 1; numeroLido--) {
			fatorial = fatorial * numeroLido;

		}

		System.out.printf("Fatorial calculado: %d", fatorial);

	}

}
