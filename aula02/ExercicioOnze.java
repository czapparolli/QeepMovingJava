package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual n�mero � o maior???");
		System.out.print("Digite o primeiro n�mero: ");
		int numeroUm = teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int numeroDois = teclado.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		int numeroTres = teclado.nextInt();
		
		if(numeroUm == numeroDois && numeroUm == numeroTres && numeroDois == numeroUm && numeroDois == numeroTres) {
			System.out.println("N�meros Iguais");			
		}
		else if (numeroUm > numeroDois && numeroUm > numeroTres) {

			System.out.printf("O maior n�mero entre todos � o: %d", numeroUm);

		} else if (numeroDois > numeroUm && numeroDois> numeroTres) {

			System.out.printf("O maior n�mero entre todos � o: %d", numeroDois);

		}
		
		else {
			System.out.printf("O maior n�mero entre todos � o: %d", numeroTres);
		}
		teclado.close();
	}

}
