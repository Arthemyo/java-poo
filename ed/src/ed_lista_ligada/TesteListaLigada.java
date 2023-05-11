package ed_lista_ligada;

public class TesteListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Layana");
		System.out.println(lista);
		lista.adicionaNoComeco("Miguel");
		System.out.println(lista);
		
		lista.adiciona("Arthemyo");
		System.out.println(lista);
		
		lista.adiciona(1 ,"Aurileide");
		System.out.println(lista);
		
		System.out.println(lista.pega(1));
		System.out.println(lista.tamanho());

		lista.removeComeco();
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.contem("Arthemyo"));
		System.out.println(lista.contem("Layana"));
		System.out.println(lista.tamanho());
	}

}
