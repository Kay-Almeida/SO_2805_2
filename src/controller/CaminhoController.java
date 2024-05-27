package controller;

import java.io.File;
import java.io.IOException;

public class CaminhoController {
	
	public CaminhoController() {
		super(); 
	}
	
	public void readDir(String caminho) throws IOException {
		File dir = new File(caminho);
		if(dir.exists() && dir.isDirectory()) {
			File[] files = dir.listFiles(); 
			for(File f: files) {
				if(f.isFile()) {
					double bytes = f.length(); 
					double tamanho = ((bytes/1024)/1024);
					System.out.println(f.getName()+ " Tamanho: "+ tamanho + " MB");
				}else{
					System.out.println("<DIR>\t"+f.getName());
				}
			}
						
		}else {
			throw new IOException("Diretório inválido"); 
		}
	}
}
