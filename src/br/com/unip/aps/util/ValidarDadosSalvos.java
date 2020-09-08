package br.com.unip.aps.util;

import java.io.File;

public class ValidarDadosSalvos {
	
	public boolean validarDados() {
		File arquivoSave = new File("save.txt");
		if(arquivoSave.exists()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
