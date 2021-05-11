package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// 4. Fa�a um programa que leia um vetor de 8 posi��es e, em seguida,
		// leia tamb�m dois valores X e Y quaisquer correspondentes a duas posi��es no
		// vetor.
		// Ao final seu programa dever� escrever a soma dos valores encontrados nas
		// respectivas posi��es X e Y.
		Scanner teclado = new Scanner(System.in);
		int[] valoresLidos = new int[8];

		for (int i = 0; i < valoresLidos.length; i++) {
			System.out.print("Digite um valor: ");
			valoresLidos[i] = teclado.nextInt();
		}

		int x =-2, y=-2;

		

		while (x < 0 || x >= valoresLidos.length) {
			System.out.print("Digite um valor qualquer para buscar uma posi��o: ");
			x = teclado.nextInt();

		}
		while (y < 0 || y >= valoresLidos.length) {
			System.out.print("Digite outro valor qualquer para buscar uma posi��o: ");
			y = teclado.nextInt();
		}
		
		
		int soma = valoresLidos[x] + valoresLidos[y];
		System.out.printf("As posi��es digitadas foram: %d e %d\n", x, y);
		System.out.printf("E seus respectivos valores s�o: %d e %d\n", valoresLidos[x], valoresLidos[y]);
		System.out.printf("e a soma deles s�o: %d\n", soma);

		teclado.close();
	}

}
