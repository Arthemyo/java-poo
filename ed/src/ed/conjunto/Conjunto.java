package ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto() {
		for(int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	public void adiciona(String nome) {
		if(!contem(nome)) {
			int indice = calculaIndiceTabela(nome);
			
			List<String> lista = tabela.get(indice);
			lista.add(nome);
		}
		
	}

	public void remove(String palavra) {
		int indice = this.calculaIndiceTabela(palavra);
		List<String> lista = tabela.get(indice);
		lista.remove(palavra);
	}
	
	private boolean contem(String nome) {
		int indice = calculaIndiceTabela(nome);
		return tabela.get(indice).contains(nome);
	}

	private int calculaIndiceTabela(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tabela.toString();
	}
}
