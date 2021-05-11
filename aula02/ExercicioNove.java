package br.com.qm.aula02;

import java.util.Scanner;

public class ExercicioNove {

	public static void main(String[] args) {
		// 9. Leia o salário de um trabalhador e o valor da prestação de um empréstimo.
		// Se a prestação for maior que 20% do salário imprima: "Empréstimo não
		// concedido", caso contrário imprima: "Empréstimo concedido"

		Scanner teclado = new Scanner(System.in);
		System.out.println("$$$$ Validador de empréstimos $$$$");
		System.out.print("Digite o valor do salário atual do funcionário: R$  ");
		float salarioAtual = teclado.nextFloat();
		System.out.print("Digite a prestação que ele deseja pagar: R$:  ");
		float valorPrestacao = teclado.nextFloat();

		if (valorPrestacao > salarioAtual * 0.20f) {

			System.out.println("Empréstimo não concedido");
		}
		else {
			System.out.println("Empréstimo concedido");
		}
		teclado.close();
	}
}
