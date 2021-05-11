package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// 8. Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles, assim como a diferença existente entre ambos.	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Comparador de números");
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();
		System.out.print("Digite o segundo número: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.println("Os números são iguais, portanto não existe diferença entre eles");
		}
		else if(primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("O número maior é : %d, e a diferença entre eles é de: %d", primeiroNumero, diferenca);
		}
		
		else{
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("O número maior é : %d, e a diferença entre eles é de: %d", segundoNumero, diferenca);
		}
		teclado.close();

	}

}
