package br.com.qm.aula04;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// 5. Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele possui.
		
		Scanner teclado = new Scanner(System.in);
		
		int [] vetor = new int [10];
		int [] vetorAuxiliar = new int [10];
		int contadorPares = 0;
		
		System.out.println("VAMOS CONTAR OS PARES? ");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor para guardar no vetor: ");
			vetor[i] = teclado.nextInt();
			
			if (vetor[i] % 2 == 0) {
				vetorAuxiliar[i] = vetor[i];
				contadorPares++;
			} else {vetorAuxiliar[i] =+ 1;}
		}
		
		for(int i = 0; i < vetorAuxiliar.length; i++) {
			if (vetorAuxiliar[i] % 2 == 0) {
			System.out.printf("Os valores pares armazenados foram: Número %d\n",vetorAuxiliar[i]);
			}
		}
		
		System.out.printf("\nE sua contagem total foi de: %d",contadorPares);
		
		teclado.close();
	}

}
