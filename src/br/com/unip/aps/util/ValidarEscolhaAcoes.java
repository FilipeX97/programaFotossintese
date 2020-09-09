package br.com.unip.aps.util;

public class ValidarEscolhaAcoes {
	
	private int escolhaAcoes;
	
	public ValidarEscolhaAcoes(int escolha) {
		escolhaAcoes = escolha;
	}
	
	public boolean validarCriacaoPlanta(){
		return escolhaAcoes > 0 && escolhaAcoes < 7;
	}
	
	public boolean validaEscolhaSave() {
		return escolhaAcoes > 0 && escolhaAcoes < 3;
	}
	
	public boolean validaEscolhaLoad() {
		return escolhaAcoes > 0 && escolhaAcoes < 4;
	}
	
	public boolean validaIniciar() {
		return escolhaAcoes == 0 || escolhaAcoes == 1;
	}
	
	public boolean validaOpcaoDeJogo(boolean opcaoLoad) {
		if(opcaoLoad == true) {
			return escolhaAcoes == 1 || escolhaAcoes == 2;
		} else {
			return escolhaAcoes == 1;
		}
	}
	
	public boolean validaAcao() {
		return escolhaAcoes > 0 && escolhaAcoes < 8;
	}
}
