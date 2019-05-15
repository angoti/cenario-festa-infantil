package primeira.versao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Edson", "(34)1234-5678", true);
		ItemDoTema itemDoTema = new ItemDoTema("balão");
		ItemDoTema itemDoTema2 = new ItemDoTema("Avengers");
		ItemDoTema itemDoTema3 = new ItemDoTema("casa de boneca");
		List<ItemDoTema> lista = new ArrayList<ItemDoTema>();
		lista.add(itemDoTema);
		lista.add(itemDoTema2);
		lista.add(itemDoTema3);
		TemaDeFestaInfantil festaInfantil = new TemaDeFestaInfantil("teste", lista, 100.0,
				"azul cruzeiro");
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Festa festa = null;
		try {
			Date inicio = format.parse("14/05/2019 20:00:00");// para testes apenas.
			Date fim = format.parse("15/05/2019 02:00:00");// para testes apenas.
			festa = new Festa(festaInfantil, "enderecoCompletoDaFesta", inicio, fim);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Aluguel aluguel = new Aluguel(festa, cliente);
		cliente.setAluguel(aluguel);
		System.out.println(cliente.getAluguel().calculaValorRealDoAluguel());
	}
}
