package br.com.unip.aps.manipulacao.pessoa;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidaLuz;

public class ManipulaDormirPessoa {

	public void dormirPessoa(Pessoa pessoa, Planta planta) {

		ValidaLuz validaLuz = new ValidaLuz();

		if (validaLuz.validarLuz(planta) == false) {
			System.out.println("Dormindo....");

			planta.setQuantidadeDeEnergiaNaPlanta(planta.getQuantidadeDeEnergiaNaPlanta() + 1);
			pessoa.setQuatidadeRegaPlanta(0);
			planta.setQuantidadeDeAguaDuranteDia(0);

			System.out.println("Acordado!");

			planta.alterarDiaNoite();
		} else {
			System.out.println("Ainda está de dia, cuide da sua planta, regue-a até anoitecer");
		}
	}

}
