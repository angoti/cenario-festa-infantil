package segunda.versao.ocp;

import java.util.Date;

public class Festa {
	private TemaDeFestaInfantil temaEscolhido;
	private String enderecoCompletoDaFesta;
	private Date dataHoraInicioDaFesta, dataHoraTerminoDaFesta;

	public Festa(TemaDeFestaInfantil temaEscolhido, String enderecoCompletoDaFesta,
			Date dataHoraInicioDaFesta, Date dataHoraTerminoDaFesta) {
		super();
		this.temaEscolhido = temaEscolhido;
		this.enderecoCompletoDaFesta = enderecoCompletoDaFesta;
		this.dataHoraInicioDaFesta = dataHoraInicioDaFesta;
		this.dataHoraTerminoDaFesta = dataHoraTerminoDaFesta;
	}

	public TemaDeFestaInfantil getTemaEscolhido() {
		return temaEscolhido;
	}

	public void setTemaEscolhido(TemaDeFestaInfantil temaEscolhido) {
		this.temaEscolhido = temaEscolhido;
	}

	public String getEnderecoCompletoDaFesta() {
		return enderecoCompletoDaFesta;
	}

	public void setEnderecoCompletoDaFesta(String enderecoCompletoDaFesta) {
		this.enderecoCompletoDaFesta = enderecoCompletoDaFesta;
	}

	public Date getDataHoraInicioDaFesta() {
		return dataHoraInicioDaFesta;
	}

	public void setDataHoraInicioDaFesta(Date dataHoraInicioDaFesta) {
		this.dataHoraInicioDaFesta = dataHoraInicioDaFesta;
	}

	public Date getDataHoraTerminoDaFesta() {
		return dataHoraTerminoDaFesta;
	}

	public void setDataHoraTerminoDaFesta(Date dataHoraTerminoDaFesta) {
		this.dataHoraTerminoDaFesta = dataHoraTerminoDaFesta;
	}

}
