package br.com.qm.aula05;

import java.util.Scanner;

public class Funcoes {

	// 1. Crie uma função que recebe como parâmetro um número inteiro e devolve o
	// seu dobro.

	// 2. Faça uma função que receba 3 números inteiros como parâmetro,
	// representando horas, minutos e segundos, e os converta em segundos.

	// 3. Faça uma função que receba uma temperatura em graus Celsius e retorne-a
	// convertida em graus Fahrenheit.

	// 4. Faça uma função que receba a altura e o raio de um cilindro circular e
	// retorne o volume do cilindro.

	// 5. Escreva um programa que exibe um menu de opções, capaz de executar todas
	// as funções desenvolvidas nos exercícios anteriores nele você deve pedir para
	// o usuário digitar uma opção referente à operação (correspondente ao número da
	// questão) e oferecer a ele uma interface para executá-las. O programa continua
	// executando até o usuário digitar 0 para sair.

	public static int dobro(int valor) {
		return valor * 2;
	}

	public static int horas(int horasLidas, int minutosLidos, int segundosLidos) {
		int conversaoSegundos = (horasLidas * 3600) + (minutosLidos * 60) + segundosLidos;
		return conversaoSegundos;
	}

	public static float celsiusToFarenheit(float graus) {
		float Farenheit = (graus * 9 / 5f) + 32;

		return Farenheit;

	}

	public static float volumeCilindro(float altura, float raio) {

		float volume = 3.14F * (raio * raio) * altura;
		return volume;
	}

	public static void main(String[] args) {
		int opcoesMenu;

		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println(" ####### PROGRAMA ON DEMAND ####### \n");
			System.out.println("Menu de opções: \n");
			System.out.println("[1] - Descubra o dobro do número inteiro digitado ");
			System.out.println("[2] - Coverta horas, minutos e segundos para apenas segundos ");
			System.out.println("[3] - Coverta graus Celsius para Farenheit ");
			System.out.println("[4] - Descubra o volume do cilindro com o raio e altura ");
			System.out.println("[9] - Para sair do programa \n");
			System.out.print("Digite a opção desejada do menu: ");

			opcoesMenu = teclado.nextInt();

			switch (opcoesMenu) {

			case 1:
				System.out.print("\n-------------------------------------------------\n");
				System.out.print("\nDigite um número inteiro para saber seu dobro: ");
				int dobro = teclado.nextInt();
				System.out.printf("\nO dobro do número %d, é: %d", dobro, dobro(dobro));
				System.out.print("\n");
				break;

			case 2:
				System.out.print("\n-------------------------------------------------\n");
				System.out.print("\nDigite as horas: ");
				int horasLidas = teclado.nextInt();
				System.out.print("Digite os minutos:  ");
				int minutosLidos = teclado.nextInt();
				System.out.print("Digite os segundos: ");
				int segundosLidos = teclado.nextInt();
				System.out.printf("\nA coversão de %dh %dm e %ds para segundos, é: %ds", horasLidas, minutosLidos,
						segundosLidos, horas(horasLidas, minutosLidos, segundosLidos));
				System.out.print("\n");
				break;

			case 3:
				System.out.print("\n-------------------------------------------------\n");
				System.out.println("Covertendo graus Celsius para Farenheit ");
				System.out.print("\nDigite os Graus em Celsius: ");
				float celsius = teclado.nextFloat();
				System.out.printf("\nA temperatura %.1f Celsius, em Farenheit fica: %.1f", celsius,
						celsiusToFarenheit(celsius));
				System.out.print("\n");
				break;

			case 4:
				System.out.print("\n-------------------------------------------------\n");
				System.out.println("Vamos achar o volume do cilindro com a fórmula: V = π.r2.h ");
				System.out.print("\nDigite a altura:  ");
				float altura = teclado.nextFloat();
				System.out.print("\nDigite o raio:  ");
				float raio = teclado.nextFloat();
				System.out.printf("\nO volume do cilindro para %.2f de altura e %.2f de raio, é: %.2f", altura, raio,
						volumeCilindro(altura, raio));
				System.out.print("\n");
				break;

			case 9:
				System.out.print("\n-------------------------------------------------\n");
				System.out.println("\nSaindo do programa... Obrigado ! ! !\n");
				System.out.print("\n");
			}

			if (opcoesMenu != 1 && opcoesMenu != 2 && opcoesMenu != 3 && opcoesMenu != 4 && opcoesMenu != 9) {

				System.out.print("\n-------------------------------------------------\n");
				System.out.println("\nOpção inválida, tente novamente !");
				System.out.print("\n");

			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
			}

			System.out.print("\n");
			teclado.close();
		} while (opcoesMenu != 9);

	}

}
