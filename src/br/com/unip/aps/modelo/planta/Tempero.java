package br.com.unip.aps.modelo.planta;

public class Tempero extends Planta{
	
	public Tempero(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelidoPlanta(apelido);
		this.setGrupoPlanta(5);
		this.setEstagioFinalPlanta(2);
		this.setQuantidadeEnergiaParaColherPlanta(6);
	}
	
}
