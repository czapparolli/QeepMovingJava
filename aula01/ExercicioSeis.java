package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		// 6. Leia o tamanho do lado de um quadrado e imprima como resultado a sua área.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o tamanho de um lado do quadrado para saber sua área: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nA área do quadrado é: %.2f", numero * numero);
		teclado.close();	

	}

}
