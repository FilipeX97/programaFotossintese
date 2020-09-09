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
				System.out.println("Planta colhida parab�ns por ter cuidado dela at� aqui.");
			}
			else {
				System.out.println("Ainda n�o � poss�vel colher a planta!");
			}
		}
	}
	
}
