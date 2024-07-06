package jogoDeCartas;

public class Jogador {

	private String nome;
	private Carta[] mao = new Carta[10];
	private int pontos;

	public void comprar(int qtd, Baralho baralho) {
		for (int i = 0; i < qtd; i++) {

			mao[i] = baralho.getBaralho().get(0);
			pontos+=baralho.getBaralho().get(0).getPontos();
			baralho.getBaralho().remove(0);
			System.out.println(nome + " comprou: " + mao[i].getValor() + " de " + mao[i].getNaipe());
		}

	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public Carta[] getMao() {
		return mao;
	}

	public Jogador(String nome) {
		super();
		this.nome = nome;

	}
}
