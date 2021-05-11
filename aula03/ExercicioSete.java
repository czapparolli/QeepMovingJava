package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioSete {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 7. Faça um programa que some os números ímpares contidos em um intervalo
		// definido pelo usuário.
		// O usuário define o valor inicial do intervalo e o valor final deste intervalo
		// e o programa
		// deve somar todos os números ímpares contidos neste intervalo.
		// Caso o usuário digite um intervalo inválido (começando por um valor maior que
		// o valor final)
		// deve ser escrito uma mensagem de erro na tela, “Intervalo de valores
		// inválido” e o programa termina.

		Scanner teclado = new Scanner(System.in);
		System.out.println("## SOMA EM UM INTERVALO");
		System.out.println("Digite o início do intervalo: ");
		int inicio = teclado.nextInt();
		System.out.println("Digite o fim do intervalo: ");
		int fim = teclado.nextInt();

		if (fim <= inicio) {
			System.out.println("Intervalo inválido");
			return;
		}

		int soma = 0;

		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				soma += i;
			}

		}
		
		System.out.printf("A soma dos valores impares no intervalo de %d a %d é %d", inicio, fim, soma);
		teclado.close();
	}

}
