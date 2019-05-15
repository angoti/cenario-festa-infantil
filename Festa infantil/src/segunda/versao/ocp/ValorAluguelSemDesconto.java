package segunda.versao.ocp;

public class ValorAluguelSemDesconto implements CalculadoraDeDescontos {

	@Override
	public double calculaDesconto(double valor) {
		return valor;
	}

}
