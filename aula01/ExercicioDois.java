package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// 2. Fa�a um programa que leia um n�mero real e o imprima.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para v�-lo na tela: ");
		float numero = teclado.nextFloat();
		System.out.printf("\nO n�mero digitado foi %.1f", numero);
		teclado.close();

	}

}
