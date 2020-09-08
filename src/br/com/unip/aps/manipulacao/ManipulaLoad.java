package br.com.unip.aps.manipulacao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.unip.aps.manipulacao.planta.ManipulaCriarPlanta;
import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidaArquivoSaveTxt;
import br.com.unip.aps.util.ValidarEscolhaAcoes;

public class ManipulaLoad {
	
	public Pessoa loadPessoa(Planta planta) throws FileNotFoundException {
		ValidaArquivoSaveTxt validaPessoa = new ValidaArquivoSaveTxt();
		ValidarEscolhaAcoes escolha;
		Scanner s = new Scanner(new FileReader("save.txt"));
		List<String> listaDeSaves = new ArrayList<String>();
		while(s.hasNextLine()) {
			listaDeSaves.add(s.nextLine());
		}

		if(listaDeSaves.size() == 19 && (validaPessoa.verificarArquivoPessoaExiste(3) && validaPessoa.verificarArquivoPessoaExiste(12))) {
			do {
				System.out.println("Existem dois saves, qual deseja carregar?"
						+ "1 - Save 1"
						+ "2 - Save 2"
						+ "3 - Não carregar nenhum save!");
				System.out.println("Save 1"
						+"Nome da Pessoa: " + listaDeSaves.get(2)
						+"Nome da Planta: " + listaDeSaves.get(3)
						+"Apelido da Planta: " + listaDeSaves.get(4));
				System.out.println("Save 2"
						+"Nome da Pessoa: " + listaDeSaves.get(12)
						+"Nome da Planta: " + listaDeSaves.get(13)
						+"Apelido da Planta: " + listaDeSaves.get(14));
				Scanner sc = new Scanner(System.in);
				int decisao = sc.nextInt();
				sc.close();
				escolha = new ValidarEscolhaAcoes(decisao);
				
				if(decisao == 1) {
					System.out.println("Carregando save do slote 1!");
					Pessoa pessoa = new Pessoa(listaDeSaves.get(3));
					planta = loadPlanta(1);
					return pessoa;
				} else if(decisao == 2) {
					System.out.println("Carregando save do slote 2!");
					Pessoa pessoa = new Pessoa(listaDeSaves.get(12));
					planta = loadPlanta(2);
					return pessoa;
				} else if (decisao == 3) {
					System.out.println("Não foi carregado nenhum save, voltando ao menu inicial...");
				} else {
					System.out.println("Opção Inválida!");
				}
				
			}
			while(escolha.validaEscolhaLoad());
		} else if(listaDeSaves.size() == 10 && validaPessoa.verificarArquivoPessoaExiste(3)) {
			int decisao;
				do {
				System.out.println("Existe um save no slot 1!");	
				System.out.println("Save 1"
						+"Nome da Pessoa: " + listaDeSaves.get(2)
						+"Nome da Planta: " + listaDeSaves.get(3)
						+"Apelido da Planta: " + listaDeSaves.get(4));
				
				System.out.println("Deseja carregar?"
						+ "1 - Sim"
						+ "2 - Não");
				Scanner sc = new Scanner(System.in);
				decisao = sc.nextInt();
				sc.close();
				
				if(decisao == 1) {
					System.out.println("Carregando save do slote 1!");
					Pessoa pessoa = new Pessoa(listaDeSaves.get(3));
					planta = loadPlanta(1);
					return pessoa;
				} else if(decisao == 2) {
					System.out.println("Não foi carregado nenhum save, voltando ao menu inicial...");
				} else {
					System.out.println("Escolha Inválida");
				}
			}
			while(decisao < 0 && decisao > 2);
		}
		return null;
	}
	
	private Planta loadPlanta(int save) throws FileNotFoundException {
		ManipulaCriarPlanta criaPlanta = null;
		Planta planta;
		Scanner s = new Scanner(new FileReader("save.txt"));
		List<String> listaDeSaves = new ArrayList<String>();
		while(s.hasNextLine()) {
			listaDeSaves.add(s.nextLine());
		}
		
		if(save == 1) {
			criaPlanta = new ManipulaCriarPlanta(Integer.parseInt((listaDeSaves.get(6))));
			planta = criaPlanta.criarPlanta(listaDeSaves.get(4), listaDeSaves.get(5));
			planta.setEstadoPlanta(Boolean.parseBoolean(listaDeSaves.get(7)));
			planta.setQuantidadeDeEnergiaNaPlanta(Integer.parseInt(listaDeSaves.get(8)));
			planta.setEstagioAtualPlanta(Integer.parseInt(listaDeSaves.get(9)));
			return planta;
		} else if(save == 2) {
			criaPlanta = new ManipulaCriarPlanta(Integer.parseInt((listaDeSaves.get(15))));
			planta = criaPlanta.criarPlanta(listaDeSaves.get(13), listaDeSaves.get(14));
			planta.setEstadoPlanta(Boolean.parseBoolean(listaDeSaves.get(16)));
			planta.setQuantidadeDeEnergiaNaPlanta(Integer.parseInt(listaDeSaves.get(17)));
			planta.setEstagioAtualPlanta(Integer.parseInt(listaDeSaves.get(18)));
			return planta;
		}
		return null;
		
		
	}
	
}
