package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		//6. Faça um programa que receba dois números e mostre qual deles é o maior.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Comparador de números");
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		int segundoNumero = teclado.nextInt();
		if (primeiroNumero == segundoNumero) {
			
			System.out.println("Os números são iguais");
			
		} else if (primeiroNumero > segundoNumero) {
			
			System.out.printf("O número %d é maior que o número %d", primeiroNumero, segundoNumero);
			
		} else {
			
			System.out.printf("O número %d é maior que o número %d", segundoNumero, primeiroNumero);
			
		}
		
		teclado.close();
	}

}
