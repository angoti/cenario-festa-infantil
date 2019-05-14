package primeira.versao;

public class Cliente {
	private Aluguel aluguel;
	private String nome, telefone;
	private boolean clienteAntigo;

	public Cliente(String nome, String telefone, boolean clienteAntigo) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.clienteAntigo = clienteAntigo;
	}

	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
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
