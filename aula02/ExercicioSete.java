package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// 7. Fa�a um programa que pe�a um valor e mostre na tela se o valor � positivo
		// ou negativo.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Positivo ou negativo?");
		System.out.print("Digite o n�mero: ");
		int primeiroNumero = teclado.nextInt();

		if (primeiroNumero == 0) {

			System.out.println("O n�mero � nulo (Igual a 0)");
		} else if (primeiroNumero < 0) {
			System.out.printf("O n�mero � negativo, porque %d � menor que 0", primeiroNumero);

		} else {

			System.out.printf("O n�mero � positivo, porque %d � maior que 0", primeiroNumero);

		}

		teclado.close();
	}

}
