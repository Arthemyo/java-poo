
public class Administrador extends Funcionario implements Altenticavel{

private AutenticacaoUtil autenticador;
	
	public Administrador(){
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		this.autenticador.setSenha(senha);
	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}
	
}
