
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular = "Arthemyo Rodrigues";
		Conta conta2 = new Conta();
		conta2.titular = "Layana Rodrigues";
		
		conta1.deposita(267.36);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta2.deposita(1347.86);
		System.out.println("Saldo: " + conta2.saldo);
		
		// boolean saqueConfimado = conta1.saca(67.36);
		boolean statusTransferencia = conta2.transfere(6300, conta1);
		
		if (statusTransferencia) {
			System.out.println("Saldo: " + conta2.saldo);
		}else {
			System.out.println("Transferencia não aconteceu!");
		}
		
		System.out.println("Saldo: " + conta1.saldo);
		
		
	}
}
