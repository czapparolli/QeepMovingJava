package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// 3. Implemente um programa que calcule o ano de nascimento de uma pessoa a
		// partir de sua idade e do ultimo ano que fez aniversário.

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite sua idade: ");

		int idade = teclado.nextInt();
		
		System.out.print("Digite o ultimo ano que você fez aniversário: ");
		
		int anoAtual = teclado.nextInt();

		int anoNascimento = anoAtual - idade;

		System.out.printf("Sua data de nascimento é: %d\n", anoNascimento);
		teclado.close();

	}

}
