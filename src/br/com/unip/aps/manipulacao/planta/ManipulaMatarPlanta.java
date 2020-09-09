package br.com.unip.aps.manipulacao.planta;

import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidarEstadoPlanta;

public class ManipulaMatarPlanta {

	public void matarPlanta(Planta planta) {

		ValidarEstadoPlanta validaPlanta = new ValidarEstadoPlanta();

		if (validaPlanta.validar(planta)) {
			planta.setEstadoPlanta(false);
			System.out.println("Planta morta!");
		}

	}

}
