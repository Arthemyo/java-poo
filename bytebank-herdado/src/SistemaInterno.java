
public class SistemaInterno {

	private int senha = 2222;

	// Autenticavel tamb�m � um tipo;
	public void autentica(Altenticavel auth) {
		boolean autenticou = auth.autentica(this.senha);
		if (autenticou) {
			System.out.println("Pode entrar no sistema!");
		} else {
			System.out.println("N�o pode entrar no sistema!");
		}
	}
}
