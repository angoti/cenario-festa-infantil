package primeira.versao;

public class Aluguel {
	private Festa festa;
	private Cliente cliente;

	public Aluguel(Festa festa, Cliente cliente) {
		super();
		this.festa = festa;
		this.cliente = cliente;
	}

	public Festa getFesta() {
		return festa;
	}

	public void setFesta(Festa festa) {
		this.festa = festa;
	}

	public double calculaValorRealDoAluguel() {
		if (cliente.isClienteAntigo())
			return festa.getTemaEscolhido().getValorDoAluguel() * 0.95;
		return festa.getTemaEscolhido().getValorDoAluguel();
	}

}
