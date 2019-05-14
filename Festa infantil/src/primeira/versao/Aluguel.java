package primeira.versao;

public class Aluguel {
	private Festa festa;

	public Aluguel(Festa festa) {
		super();
		this.festa = festa;
	}

	public Festa getFesta() {
		return festa;
	}

	public void setFesta(Festa festa) {
		this.festa = festa;
	}

	public double calculaValorRealDoAluguel() {
		// regras para o desconto
		return 0;
	}

}
