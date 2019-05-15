package segunda.versao.ocp;

public class DescontoParaClientesComMaisDeCincoAlugueis implements CalculadoraDeDescontos {

	@Override
	public double calculaDesconto(double valor) {
		return valor*0.90;
	}

}
