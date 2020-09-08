package br.com.unip.aps.util;

public class ValidarEscolhaAcoes {
	
	private int escolhaAcoes;
	
	public ValidarEscolhaAcoes(int escolha) {
		escolhaAcoes = escolha;
	}
	
	public boolean validarCriacaoPlanta(){
		if(escolhaAcoes > 0 || escolhaAcoes < 6) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validaEscolhaSave() {
		if(escolhaAcoes > 0 || escolhaAcoes < 3) {
			return true;
		} else {
			return false;
		}
	}
	
}
