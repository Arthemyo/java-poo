public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	// Vari�vel da classe e n�o do objeto
	private static int total;

	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}

	public abstract void deposita(double valor);

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Voc� sacou R$" + valor);
			return true;
		}
		return false;

	}

	public boolean transfere(double valor, Conta conta) {
		if (this.saca(valor)) {
			conta.deposita(valor);
			System.out.println("Valor de R$" + valor + " transferido com sucesso para " + conta.titular.getNome());
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
			System.out.println("N�mero negativo ou zero! Opera��o inconclu�da.");
			return;
		}
		this.numero = numero;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Ag�ncia negativo ou zero! Opera��o inconclu�da.");
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