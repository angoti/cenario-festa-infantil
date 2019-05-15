package segunda.versao.ocp;

public class DescontoParaClienteAntigo implements CalculadoraDeDescontos {

	@Override
	public double calculaDesconto(double valor) {
		return 0.95 * valor;
	}

}
