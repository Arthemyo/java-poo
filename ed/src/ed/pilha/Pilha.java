package ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	
	public void insere(String nome) {
		nomes.add(nome);
	}
	
	public String remove() {
		return nomes.remove(nomes.size() - 1);
	}
	
	public boolean vazio() {
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomes.toString();
	}
}
