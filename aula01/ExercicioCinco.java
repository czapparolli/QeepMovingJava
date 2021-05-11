package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// 5. Leia um numero real e imprima a quinta parte deste número.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número para saber sua quinta parte: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nA quinta parte do número digitado é: %.2f", numero / 5);
		teclado.close();

	}

}
