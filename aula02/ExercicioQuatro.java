package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		// 4. Receba a altura do degrau de uma escada e a altura que o usuário deseja
		// alcançar subindo a escada.
		// Calcule e mostre quantos degraus o usuário deverá subir para atingir seu
		// objetivo.

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a altura do degrau: ");
		float alturaDegrau = teclado.nextFloat();
		System.out.print("Digite a altura que deseja alcançar: ");
		float alturaDesejada = teclado.nextFloat();

		float degrausNecessarios = alturaDesejada / alturaDegrau;

		System.out.printf("A quantidade de degraus para chegar na altura desejada é: %.2f", degrausNecessarios);

		teclado.close();

	}

}
