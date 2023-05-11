
public class Testecondicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais!");
		System.out.println("======================");
		int idade = 8;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;

		if (idade >= 18 || acompanhado) {
			System.out.println("Bem vindo!");
		} else {
			System.out.println("N�o atingiu os requisitos!");
		}
	}
}
