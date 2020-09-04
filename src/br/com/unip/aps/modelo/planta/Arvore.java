package br.com.unip.aps.modelo.planta;

public class Arvore extends Planta{
	
	public Arvore(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelidoPlanta(apelido);
		this.setGrupoPlanta(1);
		this.setEstagioFinalPlanta(3);
		this.setQuantidadeEnergiaParaColherPlanta(12);
	}

}
