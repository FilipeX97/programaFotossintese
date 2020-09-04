package br.com.unip.aps.modelo;

public class Pessoa {
	
	private String nomePessoa;
	private int quatidadeRegaPlanta;

	public Pessoa(String nome) {
		nomePessoa = nome;
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public int getQuatidadeRegaPlanta() {
		return quatidadeRegaPlanta;
	}

	public void setQuatidadeRegaPlanta(int quatidadeRegaPlanta) {
		this.quatidadeRegaPlanta = quatidadeRegaPlanta;
	}
	
	public void regar() {
		quatidadeRegaPlanta += 1;
	}	
	
}
