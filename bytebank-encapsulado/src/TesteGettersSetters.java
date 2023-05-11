
public class TesteGettersSetters {
	public static void main(String[] args) {
		Conta conta = new Conta(1333, 5444);
		Cliente paulo = new Cliente();
		
		conta.setNumero(1444);
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome());
	}
}
