package br.com.qm.aula01;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// 8. Leia um n�mero inteiro e imprima a soma do sucessor de seu triplo com o
		// antecessor de seu dobro.
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int numeroLido = teclado.nextInt();
		int sucessorTriplo = (numeroLido * 3) + 1;
		int antecessorDobro = (numeroLido * 2) - 1;
		
		System.out.printf("\nO triplo de %d + 1 �: %d\n",numeroLido, sucessorTriplo);
		System.out.printf("\nO dobro de %d - 1 �: %d",numeroLido, antecessorDobro);
		teclado.close();
	}

}
