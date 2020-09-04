package br.com.unip.aps.modelo.planta;

public class Vegetal extends Planta{
	
	public Vegetal(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelidoPlanta(apelido);
		this.setGrupoPlanta(6);
		this.setEstagioFinalPlanta(3);
		this.setQuantidadeEnergiaParaColherPlanta(9);
	}
	
}