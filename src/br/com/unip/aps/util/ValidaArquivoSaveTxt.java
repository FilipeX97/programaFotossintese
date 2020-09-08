package br.com.unip.aps.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidaArquivoSaveTxt {
	
	public boolean verficarArquivoExiste(File arquivo) {
		 return arquivo.exists();
	}
	
	public boolean verificarArquivoPessoaExiste(int save) throws FileNotFoundException {
		Scanner s = new Scanner(new FileReader("save.txt"));
		List<String> listaDeSaves = new ArrayList<String>();
		while(s.hasNextLine()) {
			listaDeSaves.add(s.nextLine());
		}
		
		return listaDeSaves.get(save) != null;
	}
	
}
