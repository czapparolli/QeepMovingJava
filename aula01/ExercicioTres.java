package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// 3. Peça ao usuário para digitar três valores inteiros e imprima a soma deles.

		Scanner teclado = new Scanner(System.in);
		System.out.print("\nDigite o primeiro número: ");
		int primeiroLido = teclado.nextInt();
		System.out.print("\nDigite o segundo número: ");
		int segundoLido = teclado.nextInt();
		System.out.print("\nDigite o terceiro número: ");
		int terceiroLido = teclado.nextInt();
		System.out.printf("\n A soma dos números digitados é: %d", primeiroLido + segundoLido + terceiroLido);
		teclado.close();

	}

}
