package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// 4. Leia um n�mero real e imprima o resultado do quadrado desse n�mero.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um n�mero para saber seu quadrado: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nO quadrado do n�mero digitado �: %.2f", numero * numero);
		teclado.close();
	}

}
