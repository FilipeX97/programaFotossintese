package br.com.unip.aps.util;

import java.io.File;

public class ValidaArquivoSaveTxt {
	
	public boolean verficarArquivoExiste(File arquivo) {
		
		if (arquivo.exists()) {
			return true;
		}else {
			return false;
		}
	}
	
}
