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
					System.out.println("J� foi atingida a quantidade m�xima que pode regar a planta, poder� regar somente no dia seguinte, ap�s dormir");
					planta.alterarDiaNoite();
				}
			}
		} else if(validaLuz.validarLuz(planta)) {
			System.out.println("Est� de noite, v� dormir...");
		}
	}
	
	public void dormir(Pessoa pessoa, Planta planta) {
		if(validaLuz.validarLuz(planta) == false) {
			planta.setQuantidadeDeEnergiaNaPlanta(planta.getQuantidadeDeEnergiaNaPlanta() + 1);
		}
		else {
			System.out.println("Ainda est� de dia, cuide da sua planta, regue-a at� anoitecer");
		}
	}
}
