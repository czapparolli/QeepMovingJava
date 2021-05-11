package br.com.qm.aula05;

import java.util.Scanner;

public class FuncoesComMenus {

	public static float polegadasToCentimetros(float valorPolegadas) {

		float valorCentimetros = valorPolegadas * 2.54F;
		return valorCentimetros;
	}

	public static float kilometrosToMetros(float kmh) {
		float velocidadeMs = kmh / 3.6f;
		return velocidadeMs;
	}

	public static int anoNascimento(int idade, int anoAniversario) {
		int anoNascimento = anoAniversario - idade;
		return anoNascimento;
	}

	public static float stairToHeaven(float alturaDegrau, float alturaDesejada) {

		float degrausNecessarios = alturaDesejada / alturaDegrau;
		return degrausNecessarios;
	}

	public static float produtoDesconto(float valorProduto) {
		float produtoDesconto = valorProduto * 0.12f;
		float valorProdutoFinal = valorProduto - produtoDesconto;
		return valorProdutoFinal;
	}

	public static int comparacaoDeNumeros(int primeiroLido, int segundoLido) {
		if (primeiroLido > segundoLido) {
			return primeiroLido;
		} else
			return segundoLido;
	}

	public static int positivoOuNegativo(int valor) {

		if (valor < 0) {
			System.out.printf("\nO valor é negativo");
			return valor;
		} else {
			System.out.printf("\nO valor é positivo");
			return valor;
		}

	}

	public static int diferencaDeNumeros(int primeiroNumero, int segundoNumero) {

		if (primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("\nO número maior é : %d, e a diferença entre eles é de: %d\n", primeiroNumero,
					diferenca);
			return primeiroNumero;
		}

		else {
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("\nO número maior é : %d, e a diferença entre eles é de: %d\n", segundoNumero, diferenca);
			return segundoNumero;
		}

	}

	public static float validadorEmprestimos(float salario, float valorPrestacao) {
		if (valorPrestacao > salario * 0.20f) {

			System.out.println(
					"\nEmpréstimo não concedido, pois o valor da prestação é 20% maior que do salário total !");
			return salario;
		} else {
			System.out.println("Empréstimo concedido");
		}
		return salario;
	}

	public static float mediaPonderada(float notaUm, float notaDois, float notaTres) {

		float media = (notaUm * 1 + notaDois * 1 + notaTres * 2) / (1 + 1 + 2);

		if (media >= 60) {

			System.out.printf("\nAluno aprovado, com a média: %.1f\n", media);
			return media;
		} else {
			System.out.printf("\nAluno repovado, com a média: %.1f\n", media);
		}
		return media;

	}

	public static float maiorEntreTres(float produtoUm, float produtoDois, float produtoTres) {

		if (produtoUm > produtoDois && produtoUm > produtoTres) {

			System.out.printf("\nO maior número entre todos é o: %d\n", produtoUm);
			return produtoUm;
		} else if (produtoDois > produtoUm && produtoDois > produtoTres) {

			System.out.printf("\nO maior número entre todos é o: %d\n", produtoDois);
			return produtoDois;
		}

		else {
			System.out.printf("\nO maior número entre todos é o: %d\n", produtoTres);
			return produtoTres;
		}

	}

	public static float produtoMaisBarato(float produtoUm, float produtoDois, float produtoTres) {

		if (produtoUm < produtoDois && produtoUm < produtoTres) {

			System.out.printf("\nO produto mais barato é de valor R$ %.2f\n", produtoUm);
			return produtoUm;

		} else if (produtoDois < produtoUm && produtoDois < produtoTres) {

			System.out.printf("\nO produto mais barato é de valor R$ %.2f\n", produtoDois);
			return produtoDois;

		}

		else {
			System.out.printf("\nO produto mais barato é de valor R$ %.2f\n", produtoTres);
			return produtoTres;
		}
	}

	public static float mediaEscolar(float primeiraNota, float segundaNota) {

		float media = (primeiraNota + segundaNota) / 2;

		if (media >= 0 && media < 7) {

			System.out.printf("\nReprovado com média: %.1f\n", media);
			return media;

		} else if (media >= 7 && media < 10) {

			System.out.printf("\nAprovado com média: %.1f\n", media);
			return media;
		} else {

			System.out.printf("\nAprovado com Distinção com a média %.1f !\n", media);
			return media;
		}

	}

	public static void main(String[] args) {

		int opcoesMenu;

		do {
			Scanner teclado = new Scanner(System.in);
			System.out.println(" ####### PROGRAMA PARA TODOS OS GOSTOS ####### \n");
			System.out.println("Menu de opções: \n");
			System.out.println("[1] - Conversor de polegadas para centrímetros ");
			System.out.println("[2] - Coverta Kilometros por hora para metros por segundos ");
			System.out.println("[3] - Vamos descobrir o ano que você nasceu????");
			System.out.println("[4] - StairLadder to heaven ! ! ! ");
			System.out.println("[5] - Promoção 12% de desconto para qualquer produto ! ! ! ");
			System.out.println("[6] - Maior entre dois? ");
			System.out.println("[7] - Positivo ou negativo soldado? ");
			System.out.println("[8] - Comparação e diferença entre números ");
			System.out.println("[9] - Verificador de empréstimo");
			System.out.println("[10] - Média Ponderada");
			System.out.println("[11] - Maior entre 3");
			System.out.println("[12] - Qual produto é o mais barato?");
			System.out.println("[13] - Calculo de média escolar");
			System.out.println("[99] - Para encerrar o programa");
			System.out.print("\nDigite a opção desejada do menu: ");

			opcoesMenu = teclado.nextInt();

			switch (opcoesMenu) {

			case 1:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite um número em polegadas para saber seu valor em centímetros: ");
				float valorPolegadas = teclado.nextFloat();
				System.out.printf("\nO valor convertido de %.1f polegadas, é: %.1f centímetros\n", valorPolegadas,
						polegadasToCentimetros(valorPolegadas));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 2:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite o valor em KM/H para saber seu M/S: ");
				float valorKms = teclado.nextFloat();
				System.out.printf("\nO valor convertido de %.1f KM/H, é: %.1f M/S\n", valorKms,
						kilometrosToMetros(valorKms));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 3:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite sua idade: ");
				int idade = teclado.nextInt();
				System.out.print("Digite o ultimo ano que você fez aniversário: ");
				int anoAniversario = teclado.nextInt();
				System.out.printf("O ano do seu nascimento é: %d", anoNascimento(idade, anoAniversario));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 4:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite a altura do degrau: ");
				float alturaDegrau = teclado.nextFloat();
				System.out.print("\nDigite a altura em metros que deseja alcançar no céu: ");
				float alturaDesejada = teclado.nextFloat();
				System.out.printf("\nA quantidade de degraus para chegar no seu lugar no céu são: %.2f\n",
						stairToHeaven(alturaDegrau, alturaDesejada));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 5:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite o valor do produto para saber seu desconto: ");
				float valorProduto = teclado.nextFloat();
				System.out.printf("\nO valor do produto com desconto é: R$ %.2f\n", produtoDesconto(valorProduto));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 6:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite o primeiro número:  ");
				int primeiroLido = teclado.nextInt();
				System.out.print("Digite o segundo número:  ");
				int segundoLido = teclado.nextInt();
				if (primeiroLido == segundoLido || segundoLido == primeiroLido) {
					System.out.print("\nOs números são iguais\n");
				} else
					System.out.printf("\nO maior entre %d e %d, é: %d\n", primeiroLido, segundoLido,
							comparacaoDeNumeros(primeiroLido, segundoLido));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 7:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite um valor para saber se é positivo ou negativo: ");
				int valor = teclado.nextInt();
				if (valor == 0) {

					System.out.println("\nO número é nulo (Igual a 0)");

				}
				System.out.printf("\nNúmero digitado: %d\n", positivoOuNegativo(valor));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 8:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("\nDigite o primeiro número: ");
				int primeiroNumero = teclado.nextInt();
				System.out.print("\nDigite o segundo número: ");
				int segundoNumero = teclado.nextInt();
				if (primeiroNumero == segundoNumero) {
					System.out.println("\nOs números são iguais, portanto não existe diferença entre eles");
				}

				else
					System.out.printf("\nNúmeros digitados: %d e %d\n", primeiroNumero, segundoNumero,
							diferencaDeNumeros(primeiroNumero, segundoNumero));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 9:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("Digite o valor do salário atual do funcionário: R$  ");
				float salario = teclado.nextFloat();
				System.out.print("Digite a prestação que ele deseja pagar: R$:  ");
				float valorPrestacao = teclado.nextFloat();
				System.out.printf("\nSalário atual: %.1f\nValor da prestação calculada: %.1f\n", salario,
						valorPrestacao, validadorEmprestimos(salario, valorPrestacao));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 10:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("Digite a primeira nota: ");
				float notaUm = teclado.nextFloat();
				System.out.print("Digite a segunda nota: ");
				float notaDois = teclado.nextFloat();
				System.out.print("Digite a terceira nota: ");
				float notaTres = teclado.nextFloat();
				System.out.printf("\nNotas digitadas: \nNota 1: %.1f \nNota 2: %.1f \nNota 3: %.1f\n", notaUm, notaDois,
						notaTres, mediaPonderada(notaUm, notaDois, notaTres));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 11:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("Digite o primeiro número: ");
				int numeroUm = teclado.nextInt();
				System.out.print("Digite o segundo número: ");
				int numeroDois = teclado.nextInt();
				System.out.print("Digite o terceiro número: ");
				int numeroTres = teclado.nextInt();

				if (numeroUm == numeroDois && numeroUm == numeroTres && numeroDois == numeroUm
						&& numeroDois == numeroTres) {
					System.out.println("\nOs três números são iguais !");
				} else

					System.out.printf(
							"\nNúmeros digitados: \n\nPrimeiro número: %d \nSegundo número: %d \nTerceiro número: %d\n",
							numeroUm, numeroDois, numeroTres, maiorEntreTres(numeroUm, numeroDois, numeroTres));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 12:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("Digite o valor do primeiro produto: R$ ");
				float produtoUm = teclado.nextFloat();
				System.out.print("Digite o valor do segundo produto: R$ ");
				float produtoDois = teclado.nextFloat();
				System.out.print("Digite o valor do terceiro produto: R$ ");
				float produtoTres = teclado.nextFloat();

				if (produtoUm == produtoDois && produtoUm == produtoTres && produtoDois == produtoUm
						&& produtoDois == produtoTres) {
					System.out.println("Produtos de valores Iguais");

				} else
					System.out.printf(
							"\nValores dos Produtos: \n\nPrimeiro produto: R$ %.2f \nSegundo produto: R$ %.2f \nTerceiro produto: R$ %.2f\n",
							produtoUm, produtoDois, produtoTres,
							produtoMaisBarato(produtoUm, produtoDois, produtoTres));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 13:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.print("Digite a primeira nota: ");
				float primeiraNota = teclado.nextFloat();
				System.out.print("Digite a segunda nota: ");
				float segundaNota = teclado.nextFloat();
				System.out.printf("\nNotas digitadas: \n\nNota 1: %.1f \nNota 2: %.1f\n", primeiraNota, segundaNota,
						mediaEscolar(primeiraNota, segundaNota));
				System.out.print("\n---------------------------------------------------------------------\n");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n");
				break;

			case 99:
				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.println("\n encerrando o programa... Obrigado ! ! !\n");
				System.out.print("\n");
			}

			if (opcoesMenu != 1 && opcoesMenu != 2 && opcoesMenu != 3 && opcoesMenu != 4 && opcoesMenu != 5
					&& opcoesMenu != 6 && opcoesMenu != 7 && opcoesMenu != 8 && opcoesMenu != 9 && opcoesMenu != 10
					&& opcoesMenu != 11 && opcoesMenu != 12 && opcoesMenu != 13 && opcoesMenu != 99) {

				System.out.print("\n---------------------------------------------------------------------\n");
				System.out.println("\nOpção inválida, tente novamente !");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ex) {
				}

				System.out.print("\n---------------------------------------------------------------------\n");

			}
			teclado.close();

		} while (opcoesMenu != 99);

	}

}
