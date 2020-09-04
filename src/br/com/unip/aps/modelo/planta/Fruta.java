package br.com.unip.aps.modelo.planta;

public class Fruta extends Planta{
	
	public Fruta(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelidoPlanta(apelido);
		this.setGrupoPlanta(3);
		this.setEstagioFinalPlanta(3);
		this.setQuantidadeParaColherPlanta(9);
	}
	
}
