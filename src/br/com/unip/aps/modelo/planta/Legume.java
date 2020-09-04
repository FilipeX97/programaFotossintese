package br.com.unip.aps.modelo.planta;

public class Legume extends Planta{
	
	public Legume(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelidoPlanta(apelido);
		this.setGrupoPlanta(4);
		this.setEstagioFinalPlanta(3);
		this.setQuantidadeParaColherPlanta(9);
	}
	
}
