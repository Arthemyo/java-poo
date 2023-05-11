
public class TestaSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador admin = new Administrador();
		admin.setSenha(3333);
		
		Cliente c1 = new Cliente();
		c1.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(admin);
		si.autentica(c1);

	}

}
