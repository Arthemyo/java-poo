
public class TesteBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Arthemyo Rodrigues";
		cliente1.cpf = "111.111.111-11";
		cliente1.professao = "Programador";
		
		Conta conta1 = new Conta();
		conta1.deposita(500);
		
		conta1.titular = cliente1;
		System.out.println(conta1.getSaldo());

	}

}
