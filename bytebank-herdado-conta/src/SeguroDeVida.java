
public class SeguroDeVida implements Tributavel{
	private double saldo;
	private CalculadorImposto cauculaImposto;
	
	public SeguroDeVida() {
		this.cauculaImposto = new CalculadorImposto();
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double getImposto(double valor) {
		// TODO Auto-generated method stub
		return this.cauculaImposto.getImpostoSeguroDeVida(valor);
	}
}
