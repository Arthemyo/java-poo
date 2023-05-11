
public class TesteGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g1 = new Gerente();
		
		g1.setNome("Matheus");
		g1.setCpf("126.543.256-23");
		g1.setSalario(1000);
		
		g1.setSenha(2222);
		
		boolean autenticando = g1.autentica(2222);

		System.out.println(g1.getCpf());
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(autenticando);
		System.out.println(g1.getBonificacao());
		
	}

}
