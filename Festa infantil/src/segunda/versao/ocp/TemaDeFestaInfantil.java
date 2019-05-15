package segunda.versao.ocp;
import java.util.List;

public class TemaDeFestaInfantil {
	private String nomeDoTema;
	private List<ItemDoTema> listaDeItensDaFesta;
	private double valorDoAluguel;
	private String corDaToalhaDaMesa;

	public TemaDeFestaInfantil(String nomeDoTema, List<ItemDoTema> listaDeItensDaFesta,
			double valorDoAluguel, String corDaToalhaDaMesa) {
		super();
		this.nomeDoTema = nomeDoTema;
		this.listaDeItensDaFesta = listaDeItensDaFesta;
		this.valorDoAluguel = valorDoAluguel;
		this.corDaToalhaDaMesa = corDaToalhaDaMesa;
	}

	public String getNomeDoTema() {
		return nomeDoTema;
	}

	public void setNomeDoTema(String nomeDoTema) {
		this.nomeDoTema = nomeDoTema;
	}

	public List<ItemDoTema> getListaDeItensDaFesta() {
		return listaDeItensDaFesta;
	}

	public void setListaDeItensDaFesta(List<ItemDoTema> listaDeItensDaFesta) {
		this.listaDeItensDaFesta = listaDeItensDaFesta;
	}

	public double getValorDoAluguel() {
		return valorDoAluguel;
	}

	public void setValorDoAluguel(double valorDoAluguel) {
		this.valorDoAluguel = valorDoAluguel;
	}

	public String getCorDaToalhaDaMesa() {
		return corDaToalhaDaMesa;
	}

	public void setCorDaToalhaDaMesa(String corDaToalhaDaMesa) {
		this.corDaToalhaDaMesa = corDaToalhaDaMesa;
	}

}
