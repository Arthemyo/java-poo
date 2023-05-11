
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub]
		if (valor < 2) {
			System.out.println("Não pode depositar valores abaixo de R$2,00");
			return;
		}
		super.saldo += valor;
	}
}
