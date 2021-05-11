package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		// 3. Ler um conjunto de números reais, armazenando-o em vetor e calcular o
		// quadrado dos componentes deste vetor,
		// armazenando o resultado em outro vetor. Os conjuntos tem 10 elementos cada.
		// Imprimir todos os conjuntos no fim da execução.

		Scanner teclado = new Scanner(System.in);

		float[] valoresLidos = new float[10];
		float[] quadrados = new float[10];
		System.out.println("PROGRAMA DE QUADRADOS ! ! !");
		for (int i = 0; i < valoresLidos.length; i++) {
			System.out.print("\nDigite um valor para saber seu quadrado: ");
			valoresLidos[i] = teclado.nextFloat();
			quadrados[i] = valoresLidos[i] * valoresLidos[i];

		}

		for (int i = 0; i < quadrados.length; i++) {
			System.out.printf("\nO quadrado de %.1f é %.1f", valoresLidos[i], quadrados[i]);
		}
		teclado.close();
	}
}
