package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// 2. Fa�a um programa que leia n inteiros e imprima sua m�dia.

		Scanner teclado = new Scanner(System.in);
		float media = 0;
		float auxNumeros = 0;
		System.out.println("Programa de m�dia");
		System.out.print("Quantas vezes voce quer digitar?: ");

		int qtdRepeticoes = teclado.nextInt();

		for (int i = 1; i <= qtdRepeticoes; i++) {
			System.out.print("Digite o n�mero: ");
			float qtdNumeros = teclado.nextFloat();
			auxNumeros += qtdNumeros;
			media = auxNumeros / qtdRepeticoes;

		}

		System.out.printf("\nmedia � igual: %.1f", media);
		teclado.close();
	}
	
	

}
