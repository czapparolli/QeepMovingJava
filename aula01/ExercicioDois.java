package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// 2. Faça um programa que leia um número real e o imprima.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número para vê-lo na tela: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nO número digitado foi %.1f", numero);
		teclado.close();

	}

}
