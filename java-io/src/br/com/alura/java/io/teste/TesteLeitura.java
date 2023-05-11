package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		// Pega os arquivos solicitados (Fluxo de entrada com arquivos.)
		FileInputStream fileLorem = new FileInputStream("lorem.txt");
		
		//Lê os arquivos pego pelo objeto a cima
		InputStreamReader inputStreamReader = new InputStreamReader(fileLorem);
		
		// Buffer que guarada todos os caracteres de uma linha.
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		String umaLinha = bufferedReader.readLine();
		
		do {
			System.out.println(umaLinha);
			umaLinha = bufferedReader.readLine();
		}while(umaLinha != null);
		
		
		
		bufferedReader.close();
		
		
	}
}
