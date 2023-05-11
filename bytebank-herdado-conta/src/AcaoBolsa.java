
public class AcaoBolsa implements Tributavel{
	
	private double saldo;
	private CalculadorImposto calculaImposto;
	
	public AcaoBolsa() {
		this.calculaImposto = new CalculadorImposto();
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
		return this.calculaImposto.getImpostoAcaoBolsa(valor);
	}
}
