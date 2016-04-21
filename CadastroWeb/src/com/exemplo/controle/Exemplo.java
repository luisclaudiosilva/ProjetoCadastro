package com.exemplo.controle;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Scanner;

import javax.servlet.http.Part;

import com.exemplo.controle.ImportadorBean;

public class Exemplo {

	public static void main(String[] args) {
		
		
		
		
		/*Scanner ler = new Scanner(System.in);

	    System.out.printf("Informe o nome de arquivo texto:\n");
	    String nome = ler.nextLine();

	    System.out.printf("\nConteúdo do arquivo texto:\n");*/
	    try {
	    	File arquivoLeitura = new File("D:/teste.txt");
	    	 FileReader arq = new FileReader(arquivoLeitura); 
	    	
	    	BufferedReader lerArq = new BufferedReader(arq);
	    	int linha =  Integer.parseInt(lerArq.readLine()); // lê a primeira linha
	    	
	    	

	    	// pega o tamanho
	    	long tamanhoArquivo = arquivoLeitura .length();
	    	FileInputStream fs = new FileInputStream(arquivoLeitura);
	    	DataInputStream in = new DataInputStream(fs);


	    	LineNumberReader lineRead = new LineNumberReader(new InputStreamReader(in));
	    	lineRead.skip(tamanhoArquivo);
	    	// conta o numero de linhas do arquivo, começa com zero, por isso adiciona 1
	    	
	    	int numLinhas = lineRead.getLineNumber() + 1;
	    	System.out.println("O ARQUIVO CONTEM " + numLinhas + " LINHAS!!!!!!!");
	    	System.out.println("Primeira linha " +linha);
	    	
	    	int sub = numLinhas - 1;
	    	if(linha == 6 && linha == sub)
	    	{
		    	
		    		System.out.println("Linha inicial igual a quantidade de linhas menos 1.");
		    	
		    }

	    	} catch (IOException e) {
	    	//TODO: Tratar exceção
	    	} 
	   /* try {
	      FileReader arq = new FileReader(nome); 
	      BufferedReader lerArq = new BufferedReader(arq);

	      String linha = lerArq.readLine(); // lê a primeira linha
	// a variável "linha" recebe o valor "null" quando o processo
	// de repetição atingir o final do arquivo texto
	      while (linha != null) {
	        System.out.printf("%s\n", linha);

	        linha = lerArq.readLine(); // lê da segunda até a última linha
	      }

	      arq.close();
	    } catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
	          e.getMessage());
	    }*/

	    /*System.out.println();
	    ler.close();*/
	}

	

}
