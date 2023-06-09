package ed;

import java.util.Arrays;

public class Vetor {
	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;
	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[this.totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	
	private void garanteEspaco() {
		if (this.totalDeAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length * 2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		
		}
		
		
	}
	
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!");
		}
		
		for (int i = this.totalDeAlunos - 1; i >= posicao; i -= 1) {
			alunos[i+1] = alunos[1];
		}
		
		alunos[posicao] = aluno;
		this.totalDeAlunos++;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalDeAlunos;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeAlunos;
	}
	
	public Aluno pega(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!");		
		}
		return this.alunos[posicao];
	}
	
	public void remove(int posicao) {
		for(int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		
		this.totalDeAlunos--;
	}
	
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int tamanho() {
		return this.getTotalDeAlunos();
	}
	
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
	
	public int getTotalDeAlunos() {
		return totalDeAlunos;
	}
}
