package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioSete {

	public static void main(String[] args) {
		// 7. Leia um número inteiro e imprima o seu antecessor e o seu sucessor.
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um número para saber seu antecessor e seu sucessor: ");
		int numero = teclado.nextInt();
		System.out.printf("\nO antecessor de %d, é %d, e seu sucessor é %d", numero, numero -1, numero + 1);
		teclado.close();
	}

}
