package br.com.unip.aps.manipulacao;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;

public class ManipulaImpressaoDeDados{
	
	public String dadosParaImpressaoDaPlanta(Planta planta) {
		String dados = "";
		String estadoPlanta;
		
		dados +=  "Nome da Planta: " + planta.getNomePlanta()
		+ "\nApelido da Planta: " + planta.getApelidoPlanta()
		+ "\nGrupo da Planta: " + planta.getGrupoPlanta();
		
		if (planta.isColherPlanta()) {
			dados += "/nPlanta Já Foi Colhida!";
		} else if (planta.isEstadoPlanta()){
			estadoPlanta = "Está viva";
			dados += "\nEstado da Planta: " + estadoPlanta
			+ "\nQuantidade de Água Colocada No Dia: " + planta.getQuantidadeDeAguaDuranteDia()
			+ "\nQuantidade de Energia na Planta: " + planta.getQuantidadeDeEnergiaNaPlanta()
			+ "\nQuantidade de Energia Necessária Para a Planta ser Colhida: " + planta.getQuantidadeEnergiaParaColherPlanta()
			+ "\nEstágio Atual da Planta: " + planta.getEstagioAtualPlanta()
			+ "\nEstágio Final da Planta: " + planta.getEstagioFinalPlanta();
		} else {
			estadoPlanta = "/nEstá morta";
		}
				
		return dados;
	}
	
	public String dadosParaImpressaoDaPessoa(Pessoa pessoa) {
		String nome;
		nome = "Seu Nome: " + pessoa.getNomePessoa()
		+ "\nQuantidade de vezes que já regou a sua planta: " + pessoa.getQuatidadeRegaPlanta();
		return nome;
	}
	
}
