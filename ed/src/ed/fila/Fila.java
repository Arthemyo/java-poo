package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> alunos = new LinkedList<String>();

	public void adciona(String aluno) {
		this.alunos.add(aluno);

	}
	
	public String remove() {
		return this.alunos.remove(0);
	}

	@Override
	public String toString() {
		return alunos.toString();
	}

}
