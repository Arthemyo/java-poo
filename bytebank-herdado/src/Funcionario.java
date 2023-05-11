
public abstract class Funcionario { //Classe abtrada, não pode instanciada, pois não é um objeto concreto.
	private String nome;
	private String cpf;
	private double salario;
	

	public abstract double getBonificacao(); // Método sem corpo, sem implementação; Mas 
											 // Mas o método precisa ser implementado nas classes flihos;
											 // A não ser que a classe filha seja abstrada também;

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
