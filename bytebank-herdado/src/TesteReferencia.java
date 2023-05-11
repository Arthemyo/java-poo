
public class TesteReferencia {
	public static void main(String[] args) {
		// Exemplo de polemorfismo
		Gerente g1 = new Gerente(); // funcionário é uma classe mais genérica que gerente
		g1.setNome("Arthemyo Rodrigues");
		g1.setSalario(1800);
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Augusto Levy");
		ev.setSalario(3500);
		
		SubGerente sg = new SubGerente();
		sg.setNome("Layana Rodrigues");
		sg.setSalario(5600);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);//Sempre será o método específco (Da classe filha.)
		controle.registra(ev);
		controle.registra(sg);
		
		
		System.out.println(controle.getSoma());
	}
}
