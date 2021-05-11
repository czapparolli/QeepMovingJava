package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// 2. Faça um programa que leia n inteiros e imprima sua média.

		Scanner teclado = new Scanner(System.in);
		float media = 0;
		float auxNumeros = 0;
		System.out.println("Programa de média");
		System.out.print("Quantas vezes voce quer digitar?: ");

		int qtdRepeticoes = teclado.nextInt();

		for (int i = 1; i <= qtdRepeticoes; i++) {
			System.out.print("Digite o número: ");
			float qtdNumeros = teclado.nextFloat();
			auxNumeros += qtdNumeros;
			media = auxNumeros / qtdRepeticoes;

		}

		System.out.printf("\nmedia é igual: %.1f", media);
		teclado.close();
	}
	
	

}
