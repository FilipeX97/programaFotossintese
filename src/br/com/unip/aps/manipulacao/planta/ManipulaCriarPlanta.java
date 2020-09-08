package br.com.unip.aps.manipulacao.planta;

import br.com.unip.aps.modelo.planta.Arvore;
import br.com.unip.aps.modelo.planta.Flor;
import br.com.unip.aps.modelo.planta.Fruta;
import br.com.unip.aps.modelo.planta.Legume;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.modelo.planta.Tempero;
import br.com.unip.aps.modelo.planta.Vegetal;

public class ManipulaCriarPlanta {
	
	int escolherPlanta;
	
	public ManipulaCriarPlanta(int escolher){
		escolherPlanta = escolher;
	}
	
	public Planta criarPlanta(String nomePlanta, String apelidoPlanta) {
		
			if (escolherPlanta == 1) {
				Planta arvore = new Arvore(nomePlanta, apelidoPlanta);
				System.out.println("Árvore criada!"
						+ "\nO nome é: " + arvore.getNomePlanta()
						+ "\nE seu apelido: " + arvore.getApelidoPlanta());
				return arvore;
			} 
				
			if (escolherPlanta == 2) {
				Planta flor = new Flor(nomePlanta, apelidoPlanta);
				System.out.println("Flor criada!"
						+ "\nO nome é: " + flor.getNomePlanta()
						+ "\nE seu apelido: " + flor.getApelidoPlanta());
				return flor;
			} 
			
			if (escolherPlanta == 3) {
				Planta fruta = new Fruta(nomePlanta, apelidoPlanta);
				System.out.println("Fruta criada!"
						+ "\nO nome é: " + fruta.getNomePlanta()
						+ "\nE seu apelido: " + fruta.getApelidoPlanta());
				return fruta;
			} 
			
			if (escolherPlanta == 4) {
				Planta legume = new Legume(nomePlanta, apelidoPlanta);
				System.out.println("Legume criada!"
						+ "\nO nome é: " + legume.getNomePlanta()
						+ "\nE seu apelido: " + legume.getApelidoPlanta());
				return legume;
			} 
			
			if (escolherPlanta == 5) {
				Planta tempero = new Tempero(nomePlanta, apelidoPlanta);
				System.out.println("Tempero criada!"
						+ "\nO nome é: " + tempero.getNomePlanta()
						+ "\nE seu apelido: " + tempero.getApelidoPlanta());
				return tempero;
			} 
			
			if (escolherPlanta == 6) {
				Planta vegetal = new Vegetal(nomePlanta, apelidoPlanta);
				System.out.println("Vegetal criada!"
						+ "\nO nome é: " + vegetal.getNomePlanta()
						+ "\nE seu apelido: " + vegetal.getApelidoPlanta());
				return vegetal;
			} 
			
		return null;
	}
	
}