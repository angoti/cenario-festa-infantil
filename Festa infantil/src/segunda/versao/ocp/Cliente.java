package segunda.versao.ocp;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Aluguel> listaDeAlugueis;
	private String nome, telefone;
	private boolean clienteAntigo;

	public Cliente(String nome, String telefone, boolean clienteAntigo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.clienteAntigo = clienteAntigo;
		listaDeAlugueis = new ArrayList<Aluguel>();
	}

	public void alugaTema(Aluguel aluguel) {
		listaDeAlugueis.add(aluguel);
	}
	
	public int quantidadeDeAlugueisRealizados() {
		return listaDeAlugueis.size();
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public boolean isClienteAntigo() {
		return clienteAntigo;
	}
}
