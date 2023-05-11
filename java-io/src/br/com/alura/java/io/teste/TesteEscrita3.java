package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscrita3 {
	public static void main(String[] args) throws IOException {
		
//		// Pega os arquivos solicitados (Fluxo de entrada com arquivos.)
//		OutputStream fileLorem2 = new FileOutputStream("lorem2.txt");
//		
//		//Lê os arquivos pego pelo objeto a cima
//		Writer outputStreamReader = new OutputStreamWriter(fileLorem2);
//		
//		// Buffer que guarada todos os caracteres de uma linha.
//		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem Ipsum!");
		ps.println();
		ps.println("Olá, mundo!AAAA");
		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem2.txt"));
//		bufferedWriter.write("Lorem Ipsum!");
//		bufferedWriter.write(System.lineSeparator());
//		bufferedWriter.newLine();
//		bufferedWriter.write("Olá, mundo!");
		
		
		ps.close();
		
		
	}
}
