package br.com.unip.aps.modelo;

public class Pessoa {
	
	private String nomePessoa;
	private int escolhaDaPessoa;

	public Pessoa(String nome) {
		nomePessoa = nome;
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public int getEscolhaDaPessoa() {
		return escolhaDaPessoa;
	}

	public void setEscolhaDaPessoa(int escolhaDaPessoa) {
		this.escolhaDaPessoa = escolhaDaPessoa;
	}
	
}
