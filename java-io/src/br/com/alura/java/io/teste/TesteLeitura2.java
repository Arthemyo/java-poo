package br.com.alura.java.io.teste;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(new File("contas.csv"));
		
		ArrayList<String> valores = new ArrayList<String>();
		
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			
			Scanner scanNovo = new Scanner(linha);
			scanNovo.useLocale(Locale.US);
			scanNovo.useDelimiter(",");
			
			String valor1 = scanNovo.next();
			int valor2 = scanNovo.nextInt();
			int valor3 = scanNovo.nextInt();
			String valor4 = scanNovo.next();
			double valor5 = scanNovo.nextDouble();
			
			String novoFormato = String.format("%s - %04d/%08d %20s: %.2f", valor1, valor2, valor3, valor4, valor5);
			System.out.println(novoFormato);
			
			scanNovo.close();
		}
		
		
		
		scan.close();
		
	}
}
