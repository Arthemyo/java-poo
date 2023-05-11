import java.lang.invoke.LambdaMetafactory;

public class Fluxo {
	 public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
	        	metodo1();
			} catch (Exception e) {
				System.out.println("Exception: " + e);
				e.printStackTrace();
			} finally { // Sempre será executado.
				System.out.println("Programa encerrado.");
			}
	        
	 
	        
	        String contaNome = "Arthemyo";
	        
	        
	        System.out.println(contaNome);
	        
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");
	        metodo2();
	    
	        System.out.println("Fim do metodo1");
	    }

	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        throw new MyException("Deu muito errado!");
	        
//	        System.out.println("Fim do metodo2");
	    }
}
