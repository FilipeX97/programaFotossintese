package br.com.unip.aps.manipulacao.pessoa;

import br.com.unip.aps.modelo.Pessoa;

public class ManipulaCriarPessoa {

	public Pessoa criarPessoa(String nome) {
		Pessoa p1 = new Pessoa(nome);
		System.out.println("Pessoa criada, bem vindo " + p1.getNomePessoa());
		return p1;
	}
	
}
