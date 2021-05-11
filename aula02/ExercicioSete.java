package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// 7. Faça um programa que peça um valor e mostre na tela se o valor é positivo
		// ou negativo.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Positivo ou negativo?");
		System.out.print("Digite o número: ");
		int primeiroNumero = teclado.nextInt();

		if (primeiroNumero == 0) {

			System.out.println("O número é nulo (Igual a 0)");
		} else if (primeiroNumero < 0) {
			System.out.printf("O número é negativo, porque %d é menor que 0", primeiroNumero);

		} else {

			System.out.printf("O número é positivo, porque %d é maior que 0", primeiroNumero);

		}

		teclado.close();
	}

}
