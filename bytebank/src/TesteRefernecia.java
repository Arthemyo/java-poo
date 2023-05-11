
public class TesteRefernecia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.titular = "Arthemyo Rodrigues";
		primeiraConta.saldo = 281.65;
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo: " + primeiraConta);
		System.out.println("Saldo: " + segundaConta);
	}

}
