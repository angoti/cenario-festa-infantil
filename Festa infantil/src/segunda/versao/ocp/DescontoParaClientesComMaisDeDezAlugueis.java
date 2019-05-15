package segunda.versao.ocp;

public class DescontoParaClientesComMaisDeDezAlugueis implements CalculadoraDeDescontos {

	@Override
	public double calculaDesconto(double valor) {
		return valor*0.85;
	}

}
