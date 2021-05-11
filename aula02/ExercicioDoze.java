package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioDoze {

	public static void main(String[] args) {
		// 12. Faça um programa que pergunte o preço de três produtos e informe qual
		// produto você deve comprar,
		// sabendo que a decisão é sempre pelo mais barato.

		Scanner teclado = new Scanner(System.in);
		System.out.println("** Qual o produto mais barato? **");
		System.out.print("Digite o valor do primeiro produto: R$ ");
		float produtoUm = teclado.nextFloat();
		System.out.print("Digite o valor do segundo produto: R$ ");
		float produtoDois = teclado.nextFloat();
		System.out.print("Digite o valor do terceiro produto: R$ ");
		float produtoTres = teclado.nextFloat();

		if (produtoUm == produtoDois && produtoUm == produtoTres && produtoDois == produtoUm
				&& produtoDois == produtoTres) {
			System.out.println("Produtos de valores Iguais");
		} else if (produtoUm < produtoDois && produtoUm < produtoTres) {

			System.out.printf("O produto mais barato é de valor R$ %.1f", produtoUm);

		} else if (produtoDois < produtoUm && produtoDois < produtoTres) {

			System.out.printf("O produto mais barato é de valor R$ %.1f", produtoDois);

		}

		else {
			System.out.printf("O produto mais barato é de valor R$ %.1f", produtoTres);
		}
		teclado.close();
	}

}
