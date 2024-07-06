package jogoDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

	public List<Carta> getBaralho() {
		return baralho;
	}

	private List<Carta> baralho = new ArrayList<Carta>();

	public Baralho() {
		for (int i = 0; i < 52; i++) {
			for (int j = 0; j < 13; j++) {
				if (j == 0) {
					baralho.add(new Carta("Ás", Naipe.COPAS, 1));
					baralho.add(new Carta("Ás", Naipe.ESPADAS, 1));
					baralho.add(new Carta("Ás", Naipe.OUROS, 1));
					baralho.add(new Carta("Ás", Naipe.PAUS, 1));
				}
				if (j == 1) {
					baralho.add(new Carta("2", Naipe.COPAS, 2));
					baralho.add(new Carta("2", Naipe.ESPADAS, 2));
					baralho.add(new Carta("2", Naipe.OUROS, 2));
					baralho.add(new Carta("2", Naipe.PAUS, 2));
				}
				if (j == 2) {
					baralho.add(new Carta("3", Naipe.COPAS, 3));
					baralho.add(new Carta("3", Naipe.ESPADAS, 3));
					baralho.add(new Carta("3", Naipe.OUROS, 3));
					baralho.add(new Carta("3", Naipe.PAUS, 3));
				}
				if (j == 3) {
					baralho.add(new Carta("4", Naipe.COPAS, 4));
					baralho.add(new Carta("4", Naipe.ESPADAS, 4));
					baralho.add(new Carta("4", Naipe.OUROS, 4));
					baralho.add(new Carta("4", Naipe.PAUS, 4));
				}
				if (j == 4) {
					baralho.add(new Carta("5", Naipe.COPAS, 5));
					baralho.add(new Carta("5", Naipe.ESPADAS, 5));
					baralho.add(new Carta("5", Naipe.OUROS, 5));
					baralho.add(new Carta("5", Naipe.PAUS, 5));
				}
				if (j == 5) {
					baralho.add(new Carta("6", Naipe.COPAS, 6));
					baralho.add(new Carta("6", Naipe.ESPADAS, 6));
					baralho.add(new Carta("6", Naipe.OUROS, 6));
					baralho.add(new Carta("6", Naipe.PAUS, 6));
				}
				if (j == 6) {
					baralho.add(new Carta("7", Naipe.COPAS, 7));
					baralho.add(new Carta("7", Naipe.ESPADAS, 7));
					baralho.add(new Carta("7", Naipe.OUROS, 7));
					baralho.add(new Carta("7", Naipe.PAUS, 7));
				}
				if (j == 7) {
					baralho.add(new Carta("8", Naipe.COPAS, 8));
					baralho.add(new Carta("8", Naipe.ESPADAS, 8));
					baralho.add(new Carta("8", Naipe.OUROS, 8));
					baralho.add(new Carta("8", Naipe.PAUS, 8));
				}
				if (j == 8) {
					baralho.add(new Carta("9", Naipe.COPAS, 9));
					baralho.add(new Carta("9", Naipe.ESPADAS, 9));
					baralho.add(new Carta("9", Naipe.OUROS, 9));
					baralho.add(new Carta("9", Naipe.PAUS, 9));
				}
				if (j == 9 || j == 10 || j == 11 || j == 12) {
					baralho.add(new Carta("10", Naipe.COPAS, 10));
					baralho.add(new Carta("10", Naipe.ESPADAS, 10));
					baralho.add(new Carta("10", Naipe.OUROS, 10));
					baralho.add(new Carta("10", Naipe.PAUS, 10));
				}
			}
		}
	}

	public void embaralhar() {
		System.out.println("=========================");
		System.out.println("      EMBARALHANDO");
		System.out.println("=========================");

		Collections.shuffle(baralho);

	}

}
