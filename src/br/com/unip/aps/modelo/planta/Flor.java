package br.com.unip.aps.modelo.planta;

public class Flor extends Planta{
	
	public Flor(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelidoPlanta(apelido);
		this.setGrupoPlanta(2);
		this.setEstagioFinalPlanta(2);
		this.setQuantidadeEnergiaParaColherPlanta(6);
	}
	
}
