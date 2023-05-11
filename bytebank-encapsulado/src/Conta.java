class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Variável da classe e não do objeto
	private static int total;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
		System.out.println("Número de contas: " + Conta.total);
		System.out.println("Ag: " + this.agencia);
		System.out.println("Conta: " + this.numero);
	}

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

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número negativo ou zero! Operação inconcluída.");
			return;
		}
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência negativo ou zero! Operação inconcluída.");
			return;
		}
		this.agencia = agencia;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}