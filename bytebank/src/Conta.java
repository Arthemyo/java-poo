class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Você sacou R$" + valor);
			return true;
		}
		return false;

	}

	public boolean transfere(double valor, Conta conta) {
		if (this.saldo >= valor) {
			conta.deposita(valor);
			this.saldo -= valor;
			System.out.println("Valor de R$" + valor + " transferido com sucesso para " + conta.titular);
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
		}

		return false;

	}
}