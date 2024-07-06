package jogoDeCartas;

public class Carta {

	private String valor;
	private Naipe naipe;
	private int pontos;

	public Carta(String valor, Naipe naipe, int pontos) {
		super();
		this.valor = valor;
		this.naipe = naipe;
		this.pontos=pontos;
	}

	public String getValor() {
		return valor;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

}
