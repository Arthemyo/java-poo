package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaLeitura {
	public static void main(String[] args) throws IOException {
		
		InputStream fileLorem = System.in;
		Reader inputStreamReader = new InputStreamReader(fileLorem);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		// Pega os arquivos solicitados (Fluxo de entrada com arquivos.)
		OutputStream fileLorem2 = new FileOutputStream("lorem2.txt");
		
		//Lê os arquivos pego pelo objeto a cima
		Writer outputStreamReader = new OutputStreamWriter(fileLorem2);
		
		// Buffer que guarada todos os caracteres de uma linha.
		BufferedWriter bufferedWriter = new BufferedWriter(outputStreamReader);
		
		String umaLinha = bufferedReader.readLine();
		
		while(umaLinha != null && !umaLinha.isEmpty()){
			bufferedWriter.write(umaLinha);
			bufferedWriter.newLine();
			umaLinha = bufferedReader.readLine();
		};
		
		
		
		
		bufferedReader.close();
		bufferedWriter.close();
		
		
	}
}
