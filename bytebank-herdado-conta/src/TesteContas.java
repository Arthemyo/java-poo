
public class TesteContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Cliente c1 = new Cliente();
			c1.setNome("Arthemyo Rodrigues");
			ContaCorrente cc = new ContaCorrente(111, 22);
			cc.deposita(100.0);
			cc.setTitular(c1);
			
			double valorImpostoCC = cc.getImposto(cc.getSaldo());
			
			ContaPoupanca cp = new ContaPoupanca(333, 444);
			cp.deposita(1.5);
			cp.setTitular(c1);
			
			SeguroDeVida sv = new SeguroDeVida();
			sv.setSaldo(2000);
			
			double valorImpostoSV = sv.getImposto(sv.getSaldo());
			
			AcaoBolsa ac = new AcaoBolsa();
			ac.setSaldo(5000);
			
			double valorImpostoAC = ac.getImposto(ac.getSaldo());
			
			System.out.println("CC: " + cc.getSaldo());
			System.out.println("CP: " + cp.getSaldo());
			System.out.println("Valor imposto CC: R$" + valorImpostoCC);
			System.out.println("Valor imposto CC: R$" + valorImpostoSV);
			System.out.println("Valor imposto CC: R$" + valorImpostoAC);
	}

}
