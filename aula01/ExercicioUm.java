package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// 1. Faça um programa que leia um número inteiro e o imprima.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número para vê-lo na tela: ");
		int numero = teclado.nextInt();
		System.out.printf("\nO número digitado foi %d", numero);
		teclado.close();
	}
	
}
