package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		// 1. Leia um valor de comprimento em polegadas e apresente-o convertido em centímetros.
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor das polegada: ");
		float valorPolegadas = teclado.nextFloat();
		
		float valorCentimetros = valorPolegadas * 2.54F;
		
		System.out.printf("O valor digitado em centimetros é: %.2f\n", valorCentimetros);
		
		teclado.close();
		
	}

}