package br.com.unip.aps.util;

public class ValidarEscolhaAcoes {
	
	private int escolhaAcoes;
	
	public ValidarEscolhaAcoes(int escolha) {
		escolhaAcoes = escolha;
	}
	
	public boolean validarCriacaoPlanta(){
		return escolhaAcoes > 0 && escolhaAcoes < 6;
	}
	
	public boolean validaEscolhaSave() {
		return escolhaAcoes > 0 && escolhaAcoes < 3;
	}
	
	public boolean validaEscolhaLoad() {
		return escolhaAcoes > 0 && escolhaAcoes < 3;
	}
}
