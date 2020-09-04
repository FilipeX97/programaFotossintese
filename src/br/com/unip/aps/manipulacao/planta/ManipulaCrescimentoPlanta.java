package br.com.unip.aps.manipulacao.planta;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidaLuz;
import br.com.unip.aps.util.ValidarEstadoPlanta;

public class ManipulaCrescimentoPlanta {
	
	ValidarEstadoPlanta validaPlanta = new ValidarEstadoPlanta();
	ValidaLuz validaLuz = new ValidaLuz();
	
	public void regarPlanta(Pessoa pessoa, Planta planta) {
		if(validaPlanta.validar(planta) && validaLuz.validarLuz(planta)) {
			if(pessoa.getQuatidadeRegaPlanta() < 3) {
				pessoa.regar();
				planta.setQuantidadeDeAguaDuranteDia(pessoa.getQuatidadeRegaPlanta());
				System.out.println("Planta Regada");
				
				if(planta.getQuantidadeDeAguaDuranteDia() < planta.getQuantidadeDeAguaTotalDoDia()) {
					System.out.println(pessoa.getNomePessoa() + ", ainda falta regar " + (planta.getQuantidadeDeAguaTotalDoDia() - planta.getQuantidadeDeAguaDuranteDia()) + "vezes durante o dia.");
				} else {
					System.out.println("Já foi atingida a quantidade máxima que pode regar a planta, poderá regar somente no dia seguinte, após dormir");
					planta.alterarDiaNoite();
				}
			}
		} else if(validaLuz.validarLuz(planta)) {
			System.out.println("Está de noite, vá dormir...");
		}
	}
	
	public void dormir(Pessoa pessoa, Planta planta) {
		if(validaLuz.validarLuz(planta) == false) {
			planta.setQuantidadeDeEnergiaNaPlanta(planta.getQuantidadeDeEnergiaNaPlanta() + 1);
		}
		else {
			System.out.println("Ainda está de dia, cuide da sua planta, regue-a até anoitecer");
		}
	}
}
