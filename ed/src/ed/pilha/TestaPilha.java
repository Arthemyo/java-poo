package ed.pilha;

public class TestaPilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Arthemyo");
		
		System.out.println(pilha);
		
		pilha.insere("Layana");
		
		System.out.println(pilha);
		System.out.println(pilha.remove());
		System.out.println(pilha);
		
		

	}

}
