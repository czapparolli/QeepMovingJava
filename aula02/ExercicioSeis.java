package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		//6. Fa�a um programa que receba dois n�meros e mostre qual deles � o maior.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Comparador de n�meros");
		System.out.print("Digite o primeiro n�mero: ");
		int primeiroNumero = teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int segundoNumero = teclado.nextInt();
		if (primeiroNumero == segundoNumero) {
			
			System.out.println("Os n�meros s�o iguais");
			
		} else if (primeiroNumero > segundoNumero) {
			
			System.out.printf("O n�mero %d � maior que o n�mero %d", primeiroNumero, segundoNumero);
			
		} else {
			
			System.out.printf("O n�mero %d � maior que o n�mero %d", segundoNumero, primeiroNumero);
			
		}
		
		teclado.close();
	}

}
