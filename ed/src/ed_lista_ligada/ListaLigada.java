package ed_lista_ligada;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultimo = null;
	private int totalElementos = 0;

	@Override
	public String toString() {
		if (this.totalElementos == 0) {
			return "[]";
		}

		Celula atual = this.primeira;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < this.totalElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");

			atual = atual.getProximo();

		}

		builder.append("]");

		return builder.toString();

	}

	public void adicionaNoComeco(Object elemento) {

		if (this.totalElementos == 0) {
			Celula novaCelula = new Celula(elemento);
			this.primeira = novaCelula;
			this.ultimo = novaCelula;
		} else {
			Celula novaCelula = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(novaCelula);
			this.primeira = novaCelula;
		}

		this.totalElementos++;
	}

	public void adiciona(Object elemento) {

		if (this.totalElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula novaCelula = new Celula(elemento);
			this.ultimo.setProximo(novaCelula);
			novaCelula.setAnterior(this.ultimo);
			this.ultimo = novaCelula;

			this.totalElementos++;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}

	private Celula pegaCelula(int posicao) {

		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!!!");
		}

		Celula atual = this.primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;

	}

	public void adiciona(int posicao, Object elemento) {

		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();

			Celula novaCelula = new Celula(anterior.getProximo(), elemento);
			novaCelula.setAnterior(anterior);
			anterior.setProximo(novaCelula);
			proxima.setAnterior(novaCelula);
			this.totalElementos++;
		}
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeComeco() {
		if (this.totalElementos == 0) {
			throw new IllegalArgumentException("Lista Vazia");
		}

		this.primeira = this.primeira.getProximo();
		this.totalElementos--;

		if (this.totalElementos == 0) {
			this.ultimo = null;
		}
	}

	public void remove() {

		if (this.totalElementos == 1) {
			this.removeComeco();
		} else {
			Celula penultimaCelula = this.ultimo.getAnterior();
			penultimaCelula.setProximo(null);
			this.ultimo = penultimaCelula;

			this.totalElementos--;
		}
	}

	public void remove(int posicao) {
		if (posicao == 0) {
			this.removeComeco();
		} else if (posicao == this.totalElementos) {
			this.remove();
		} else {
			Celula atual = this.pegaCelula(posicao);
			Celula proxima = atual.getProximo();
			Celula anterior = atual.getAnterior();

			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			this.totalElementos--;

		}
	}

	public int tamanho() {
		return this.totalElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeira;

		while (atual != null) {
			
			if (atual.getElemento().equals(elemento)) {
				return true;
			}
			
			atual = atual.getProximo();

		}
		return false;
	}
}
