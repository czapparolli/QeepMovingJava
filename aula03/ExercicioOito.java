package br.com.qm.aula03;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// 8. Faça um programa que peça um número inteiro e determine se ele é ou não um
		// número primo.
		// Um número primo é aquele que é divisível somente por ele mesmo e por 1.

		Scanner teclado = new Scanner(System.in);
		System.out.println("$$ DESCOBRIDOR DE PRIMOS $$");
		System.out.print("Digite um número inteiro: ");
		int numeroLido = teclado.nextInt();
		int contador = 0;
		for (int i = numeroLido - 1; i > 1; i--) {
			
			if (numeroLido % i == 0) {
				contador ++;
				break;
			}
			
			
		}
		if ( contador > 0){
			System.out.println("Não é primo !");}
				
			 else {
				System.out.println("É primo !");
			}
		teclado.close();
		}

}


