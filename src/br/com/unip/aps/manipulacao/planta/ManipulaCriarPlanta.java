package br.com.unip.aps.manipulacao.planta;

import br.com.unip.aps.modelo.planta.Arvore;
import br.com.unip.aps.modelo.planta.Flor;
import br.com.unip.aps.modelo.planta.Fruta;
import br.com.unip.aps.modelo.planta.Legume;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.modelo.planta.Tempero;
import br.com.unip.aps.modelo.planta.Vegetal;
import br.com.unip.aps.util.ValidarEscolhaAcoes;

public class ManipulaCriarPlanta {
	
	int escolherPlanta;
	
	ManipulaCriarPlanta(int escolher){
		escolherPlanta = escolher;
	}
	
	ValidarEscolhaAcoes validaLiberacao = new ValidarEscolhaAcoes(escolherPlanta);
	
	public void criarPlanta(String nomePlanta, String apelidoPlanta) {
		if (validaLiberacao.validarCriacaoPlanta()) {
			if (escolherPlanta == 1) {
				Planta arvore = new Arvore(nomePlanta, apelidoPlanta);
			} 
				
			if (escolherPlanta == 2) {
				Planta flor = new Flor(nomePlanta, apelidoPlanta);
			} 
			
			if (escolherPlanta == 3) {
				Planta fruta = new Fruta(nomePlanta, apelidoPlanta);
			} 
			
			if (escolherPlanta == 4) {
				Planta legume = new Legume(nomePlanta, apelidoPlanta);
			} 
			
			if (escolherPlanta == 5) {
				Planta tempero = new Tempero(nomePlanta, apelidoPlanta);
			} 
			
			if (escolherPlanta == 6) {
				Planta vegetal = new Vegetal(nomePlanta, apelidoPlanta);
			} 
		}
	}
	
}