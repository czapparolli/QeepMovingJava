package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// 4. Receba a altura do degrau de uma escada e a altura que o usu�rio deseja
		// alcan�ar subindo a escada.
		// Calcule e mostre quantos degraus o usu�rio dever� subir para atingir seu
		// objetivo.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a altura do degrau: ");
		float alturaDegrau = teclado.nextFloat();
		System.out.print("Digite a altura que deseja alcan�ar: ");
		float alturaDesejada = teclado.nextFloat();

		float degrausNecessarios = alturaDesejada / alturaDegrau;

		System.out.printf("A quantidade de degraus para chegar na altura desejada �: %.2f", degrausNecessarios);

		teclado.close();

	}

}
