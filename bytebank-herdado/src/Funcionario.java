
public abstract class Funcionario { //Classe abtrada, n�o pode instanciada, pois n�o � um objeto concreto.
	private String nome;
	private String cpf;
	private double salario;
	

	public abstract double getBonificacao(); // M�todo sem corpo, sem implementa��o; Mas 
											 // Mas o m�todo precisa ser implementado nas classes flihos;
											 // A n�o ser que a classe filha seja abstrada tamb�m;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
