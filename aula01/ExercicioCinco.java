package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// 5. Leia um numero real e imprima a quinta parte deste n�mero.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um n�mero para saber sua quinta parte: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nA quinta parte do n�mero digitado �: %.2f", numero / 5);
		teclado.close();

	}

}
