package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		// 5. Faça um programa que leia o valor de um produto e imprima o valor com
		// desconto, tendo em vista que o desconto foi de 12%.
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		float valorProduto = teclado.nextFloat();
		
		float produtoDesconto = valorProduto * 0.12f;
		
		float valorProdutoFinal = valorProduto - produtoDesconto;
		
		System.out.printf("O valor do desconto é: %.2f\nO valor do produto com desconto é: R$ %.2f\n",produtoDesconto, valorProdutoFinal );
		
		teclado.close();
	}

}
