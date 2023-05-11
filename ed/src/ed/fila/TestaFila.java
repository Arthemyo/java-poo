package ed.fila;

public class TestaFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adciona("Arthemyo");
		System.out.println(fila);
		
		fila.adciona("Layana");
		System.out.println(fila);
		
		fila.adciona("Miguel");
		System.out.println(fila);
		
		fila.adciona("Aurileide");
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);

	}

}
