package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		// 2. Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s (metros por segundo).
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a velocidade em KM/H: ");
		float velocidadeKm = teclado.nextFloat();
		
		float velocidadeMs = velocidadeKm / 3.6f;
		
		System.out.printf("A velocdade digitada em M/S é: %.2f", velocidadeMs);
		teclado.close();

	}

}
