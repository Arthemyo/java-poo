package ed.conjunto;

public class TesteConjunto {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Maurício");
		System.out.println(conjunto);
		
		conjunto.adiciona("Maurício");
		System.out.println(conjunto);
		
		conjunto.adiciona("Marcio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Arthemyo");
		System.out.println(conjunto);
		
	}

}
