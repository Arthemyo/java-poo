
public class CalculadorImposto {
	public double getImpostoContaCorrente(double valor) {
		return valor * 0.05;
	}
	
	public double getImpostoSeguroDeVida(double valor) {
		return valor * 0.2;
	}
	
	public double getImpostoAcaoBolsa(double valor) {
		return valor * 0.1;
	}
}
