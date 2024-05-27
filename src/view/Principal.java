package view;

import java.io.IOException;

import controller.CaminhoController;

public class Principal {
	public static void main(String[] args) {
		
		CaminhoController cc = new CaminhoController(); 
		
		String caminho = "C:\\Users\\kayla\\OneDrive\\Documentos\\CURSOS\\JAVA - FIAP"; 
		
		try {
			cc.readDir(caminho);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
