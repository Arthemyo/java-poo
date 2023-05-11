
public class ContaCorrente extends Conta implements Tributavel{
	
	private CalculadorImposto calculaImposto;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		this.calculaImposto = new CalculadorImposto();
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSacar = valor + 0.2;
		return super.saca(valorSacar);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}

	@Override
	public double getImposto(double valor) {
		// TODO Auto-generated method stub
		return calculaImposto.getImpostoContaCorrente(valor);
	}
}
