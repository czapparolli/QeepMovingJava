package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioTreze {

	public static void main(String[] args) {
		// 13. Fa�a um programa para a leitura de duas notas parciais de um aluno. O
		// programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		// A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		// A mensagem "Reprovado", se a m�dia for menor do que sete;
		// A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.

		Scanner teclado = new Scanner(System.in);
		System.out.println("## Programa de m�dia escolar ##");

		System.out.print("Digite a primeira nota: ");
		float notaUm = teclado.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float notaDois = teclado.nextFloat();

		float media = (notaUm + notaDois) / 2;

		if (media >= 0 && media < 7) {

			System.out.printf("Reprovado com m�dia: %.1f", media);

		} else if (media >= 7 && media < 10) {

			System.out.printf("Aprovado com m�dia: %.1f", media);

		} else {

			System.out.printf("Aprovado com Distin��o com a m�dia %.1f !", media);
		}

		teclado.close();
	}

}
