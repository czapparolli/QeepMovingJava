package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// 3. Pe�a ao usu�rio para digitar tr�s valores inteiros e imprima a soma deles.

		Scanner teclado = new Scanner(System.in);
		System.out.print("\nDigite o primeiro n�mero: ");
		int primeiroLido = teclado.nextInt();
		System.out.print("\nDigite o segundo n�mero: ");
		int segundoLido = teclado.nextInt();
		System.out.print("\nDigite o terceiro n�mero: ");
		int terceiroLido = teclado.nextInt();
		System.out.printf("\n A soma dos n�meros digitados �: %d", primeiroLido + segundoLido + terceiroLido);
		teclado.close();

	}

}
