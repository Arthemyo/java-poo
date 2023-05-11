
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente arthemyo = new Gerente();
		
		arthemyo.setNome("Arthemyo Rodrigues");
		arthemyo.setCpf("233.322.433-55");
		arthemyo.setSalario(9000);
		
		System.out.println(arthemyo.getNome());
		System.out.println(arthemyo.getBonificacao());
	}
}
