package com.exemplo.controle;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import javax.swing.JOptionPane;


public class LerArquivo {

	public static void main(String[] args)  {
		Path caminho = Paths.get("D:/Users/Luis/Desktop/arquivo.txt");
		try{
		byte[] texto = Files.readAllBytes(caminho);
		String leitura = new String(texto);
		
		JOptionPane.showMessageDialog(null, leitura);
		
		}catch(Exception erro){}
	}

}
