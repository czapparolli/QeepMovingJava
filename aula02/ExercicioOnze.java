package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior deles.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual número é o maior???");
		System.out.print("Digite o primeiro número: ");
		int numeroUm = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		int numeroDois = teclado.nextInt();
		System.out.print("Digite o terceiro número: ");
		int numeroTres = teclado.nextInt();
		
		if(numeroUm == numeroDois && numeroUm == numeroTres && numeroDois == numeroUm && numeroDois == numeroTres) {
			System.out.println("Números Iguais");			
		}
		else if (numeroUm > numeroDois && numeroUm > numeroTres) {

			System.out.printf("O maior número entre todos é o: %d", numeroUm);

		} else if (numeroDois > numeroUm && numeroDois> numeroTres) {

			System.out.printf("O maior número entre todos é o: %d", numeroDois);

		}
		
		else {
			System.out.printf("O maior número entre todos é o: %d", numeroTres);
		}
		teclado.close();
	}

}
