package br.com.unip.aps.manipulacao.planta;

import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidarEstadoPlanta;

public class ManipulaColherPlanta {
	
	public void colherPlanta(Planta planta) {
		ValidarEstadoPlanta estadoPlanta = new ValidarEstadoPlanta();
		if(estadoPlanta.validar(planta)) {
			if(planta.getQuantidadeDeEnergiaNaPlanta() == planta.getQuantidadeEnergiaParaColherPlanta()
					&& planta.getEstagioAtualPlanta() == planta.getEstagioFinalPlanta()) {
				planta.setColherPlanta(true);
				System.out.println("Planta colhida parabéns por ter cuidado dela até aqui.");
			}
			else {
				System.out.println("Ainda não é possível colher a planta!");
			}
		}
	}
	
}
