package br.com.unip.aps.main;

import java.io.IOException;

import br.com.unip.aps.manipulacao.ManipulaImpressaoDeDados;
import br.com.unip.aps.manipulacao.ManipulaSave;
import br.com.unip.aps.manipulacao.pessoa.ManipulaCriarPessoa;
import br.com.unip.aps.manipulacao.pessoa.ManipulaDormirPessoa;
import br.com.unip.aps.manipulacao.planta.ManipulaCriarPlanta;
import br.com.unip.aps.manipulacao.planta.ManipulaRegarPlanta;
import br.com.unip.aps.manipulacao.planta.MatarPlanta;
import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;

public class TestaPrograma {
	
	public static void main(String[] args) throws IOException {
		
		Planta planta;
		Pessoa pessoa;
		
		ManipulaCriarPessoa criaPessoa = new ManipulaCriarPessoa();
		pessoa = criaPessoa.criarPessoa("Filipe");
		
		ManipulaCriarPlanta criaPlanta = new ManipulaCriarPlanta(1);
		planta = criaPlanta.criarPlanta("Carvalho", "Carvalinho");
		
		ManipulaImpressaoDeDados imprimirDados = new ManipulaImpressaoDeDados();
		System.out.println(imprimirDados.dadosParaImpressaoDaPessoa(pessoa));
		System.out.println(imprimirDados.dadosParaImpressaoDaPlanta(planta));
		
		ManipulaRegarPlanta regaPlanta = new ManipulaRegarPlanta();
		MatarPlanta mataPlanta = new MatarPlanta();
		ManipulaDormirPessoa dormePessoa = new ManipulaDormirPessoa();
		
		regaPlanta.regarPlanta(pessoa, planta);
		dormePessoa.dormirPessoa(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		dormePessoa.dormirPessoa(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		dormePessoa.dormirPessoa(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		dormePessoa.dormirPessoa(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		dormePessoa.dormirPessoa(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		regaPlanta.regarPlanta(pessoa, planta);
		dormePessoa.dormirPessoa(pessoa, planta);
		
		ManipulaSave save = new ManipulaSave();
		save.Save(pessoa, planta);
		
	}
}
