package segunda.versao.ocp;

import primeira.versao.Festa;

public class Aluguel {
	private Festa festa;
	private Cliente cliente;
	private CalculadoraDeDescontos calculadoraDeDescontos;

	public Aluguel(Festa festa, Cliente cliente, CalculadoraDeDescontos calculadoraDeDescontos) {
		super();
		this.festa = festa;
		this.cliente = cliente;
		this.calculadoraDeDescontos = calculadoraDeDescontos;
	}

	public Festa getFesta() {
		return festa;
	}

	public void setFesta(Festa festa) {
		this.festa = festa;
	}

	public double calculaValorRealDoAluguel() {
		return calculadoraDeDescontos.calculaDesconto(festa.getTemaEscolhido().getValorDoAluguel());
	}

}
