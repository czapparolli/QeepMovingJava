package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// 1. Fa�a um programa que leia um n�mero inteiro e o imprima.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para v�-lo na tela: ");
		int numero = teclado.nextInt();
		System.out.printf("\nO n�mero digitado foi %d", numero);
		teclado.close();
	}
	
}
