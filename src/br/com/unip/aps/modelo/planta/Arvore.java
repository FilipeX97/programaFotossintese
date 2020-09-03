package br.com.unip.aps.modelo.planta;

public class Arvore extends Planta{
	
	public Arvore(String nome, String apelido) {
		this.setNomePlanta(nome);
		this.setApelido(apelido);
		this.setGrupo(1);
		this.setEstagioFinal(3);
	}

}
