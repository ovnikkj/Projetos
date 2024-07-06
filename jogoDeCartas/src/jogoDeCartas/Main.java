package jogoDeCartas;

import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Qual jogo você deseja jogar?");
		System.out.println("");
		System.out.println("[1] 21");
		int opcao = entrada.nextInt();

		switch (opcao) {
		case 1: {
			iniciar21();

		}
			break;
		default:
			System.out.println("opcao invalida");
		}

	}

	public static void iniciar21() {
		System.out.println("Qual o nome do primeiro jogador?");
		String nome1 = entrada.next();
		System.out.println("Qual o nome do segundo jogador?");
		String nome2 = entrada.next();
		Jogador j1 = new Jogador(nome1);
		Jogador j2 = new Jogador(nome2);
		Baralho b1 = new Baralho();

		b1.embaralhar();

		System.out.println("Entregando as cartas iniciais");

		j1.comprar(2, b1);
		j2.comprar(2, b1);
		Jogador[] arrayJogadores = new Jogador[] { j1, j2 };
		boolean player1Parou = false, player2Parou = false;

		while (!player1Parou || !player2Parou) {
			for (int i = 0; i < 2; i++) {
				System.out.println("==================================");
				System.out.println("Vez do jogador: " + arrayJogadores[i].getNome() + " pontuacao ["
						+ arrayJogadores[i].getPontos() + "]");
				System.out.println("[1] comprar");
				System.out.println("[2] ficar");
				int opcao = entrada.nextInt();

				switch (opcao) {
				case 1: {
					arrayJogadores[i].comprar(1, b1);
					if (arrayJogadores[i].getPontos() > 21) {
						System.out.println("estourou!!");
						if (i == 0) {
							player1Parou = true;
						}
						if (i == 1) {
							player2Parou = true;
						}
					}

					System.out.println("Pontuacao atual: " + "[" + arrayJogadores[i].getPontos() + "]");
				}
					break;
				case 2: {
					if (i == 0) {
						player1Parou = true;
					}
					if (i == 1) {
						player2Parou = true;
					}
				}
					break;
				default:
					System.out.println("entrada invalida");
				}
			}
		}

		System.out.println("Resultado final: ");

		for (int i = 0; i < arrayJogadores.length; i++) {
			System.out.println(arrayJogadores[i].getNome() + " [" + arrayJogadores[i].getPontos() + "]");
		}
		if (arrayJogadores[0].getPontos() > arrayJogadores[1].getPontos() && arrayJogadores[0].getPontos() <= 21
				|| arrayJogadores[0].getPontos() <= 21) {
			System.out.println(arrayJogadores[0].getNome() + " ganhou!!");
		} else if (arrayJogadores[1].getPontos() > arrayJogadores[0].getPontos() && arrayJogadores[1].getPontos() <= 21
				|| arrayJogadores[1].getPontos() <= 21) {
			System.out.println(arrayJogadores[1].getNome() + " ganhou!!");
		} else if (arrayJogadores[1].getPontos() == arrayJogadores[0].getPontos() && arrayJogadores[1].getPontos() <= 21
				|| arrayJogadores[1].getPontos() <= 21) {
			System.out.println("empate");
		} else {
			System.out.println("ninguem ganhou");
		}
	}

}
