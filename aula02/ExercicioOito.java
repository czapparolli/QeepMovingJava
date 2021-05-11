package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioOito {

	public static void main(String[] args) {
		// 8. Escreva um programa que, dados dois n�meros inteiros, mostre na tela o maior deles, assim como a diferen�a existente entre ambos.	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Comparador de n�meros");
		System.out.print("Digite o primeiro n�mero: ");
		int primeiroNumero = teclado.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.println("Os n�meros s�o iguais, portanto n�o existe diferen�a entre eles");
		}
		else if(primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("O n�mero maior � : %d, e a diferen�a entre eles � de: %d", primeiroNumero, diferenca);
		}
		
		else{
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("O n�mero maior � : %d, e a diferen�a entre eles � de: %d", segundoNumero, diferenca);
		}
		teclado.close();

	}

}
