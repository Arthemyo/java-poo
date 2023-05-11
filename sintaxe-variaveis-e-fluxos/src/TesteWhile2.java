
public class TesteWhile2 {
	public static void main(String[] args) {
		int contador = 0;
		int soma = 0;
		while (contador <= 10) {
			soma += contador;
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("A soma de todos os anteriores é: " + soma);
	}
}
