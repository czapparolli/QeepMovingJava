package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		// 10. Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
		// A primeira e a segunda prova tem peso 1 e a terceira tem peso 2.
		// Ao final, mostrar a média do aluno e indicar se o aluno foi aprovado ou
		// reprovado.
		// A nota para aprovação deve ser igual ou superior a 60 pontos.

		Scanner teclado = new Scanner(System.in);
		System.out.println("## Programa de média ponderada ##");

		System.out.print("Digite a primeira nota: ");
		float notaUm = teclado.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float notaDois = teclado.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float notaTres = teclado.nextFloat();

		float media = (notaUm * 1 + notaDois * 1 + notaTres * 2) / (1 + 1 + 2);

		if (media >= 60) {

			System.out.printf("Aluno aprovado, com a média: %.1f", media);

		} else {
			System.out.printf("Aluno repovado, com a média: %.1f", media);
		}
		
		teclado.close();
	}
}