package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// 9. Leia o sal�rio de um trabalhador e o valor da presta��o de um empr�stimo.
		// Se a presta��o for maior que 20% do sal�rio imprima: "Empr�stimo n�o
		// concedido", caso contr�rio imprima: "Empr�stimo concedido"

		Scanner teclado = new Scanner(System.in);
		System.out.println("$$$$ Validador de empr�stimos $$$$");
		System.out.print("Digite o valor do sal�rio atual do funcion�rio: R$  ");
		float salarioAtual = teclado.nextFloat();
		System.out.print("Digite a presta��o que ele deseja pagar: R$:  ");
		float valorPrestacao = teclado.nextFloat();

		if (valorPrestacao > salarioAtual * 0.20f) {

			System.out.println("Empr�stimo n�o concedido");
		}
		else {
			System.out.println("Empr�stimo concedido");
		}
		teclado.close();
	}
}
