
public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.titular = "Arthemyo Rodrigues";
		primeiraConta.saldo = 281.65;
		System.out.println("O t�tular " + primeiraConta.titular + " tem de saldo R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.titular = "Layana Rodrigues";
		segundaConta.saldo = 353.72; 
		System.out.println("O t�tular " + segundaConta.titular + " tem de saldo R$" + segundaConta.saldo);
		
		
	}

}
