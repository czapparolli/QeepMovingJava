package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// 8. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um
		// n�mero primo.
		// Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.

		Scanner teclado = new Scanner(System.in);
		System.out.println("$$ DESCOBRIDOR DE PRIMOS $$");
		System.out.print("Digite um n�mero inteiro: ");
		int numeroLido = teclado.nextInt();
		int contador = 0;
		for (int i = numeroLido - 1; i > 1; i--) {
			
			if (numeroLido % i == 0) {
				contador ++;
				break;
			}
			
			
		}
		if ( contador > 0){
			System.out.println("N�o � primo !");}
				
			 else {
				System.out.println("� primo !");
			}
		teclado.close();
		}

}


