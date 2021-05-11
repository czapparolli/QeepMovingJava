package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// 4. Leia um número real e imprima o resultado do quadrado desse número.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número para saber seu quadrado: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nO quadrado do número digitado é: %.2f", numero * numero);
		teclado.close();
	}

}
