package ed;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Jose");
		Aluno a3 = new Aluno("Zéca");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a3));
		System.out.println(lista.contem(a1));
		
		
		System.out.println(lista.pega(1));
		
		lista.adiciona(2, a3);
		
		lista.remove(1);
		
		
		
		System.out.println(lista);
	}

}
