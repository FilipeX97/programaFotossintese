package br.com.unip.aps.manipulacao;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.util.ValidaArquivoSaveTxt;
import br.com.unip.aps.util.ValidarEscolhaAcoes;

public class ManipulaLoadPessoa {
	
	public Pessoa loadPessoa() throws IOException {
		ValidaArquivoSaveTxt validaPessoa = new ValidaArquivoSaveTxt();
		ValidarEscolhaAcoes escolha;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(new FileReader("save.txt"));
		List<String> listaDeSaves = new ArrayList<String>();
		while(s.hasNextLine()) {
			listaDeSaves.add(s.nextLine());
		}

		if(listaDeSaves.size() == 19 && (validaPessoa.verificarArquivoPessoaExiste(3) && validaPessoa.verificarArquivoPessoaExiste(12))) {
			do {
				System.out.println("Existem dois saves, qual deseja carregar?"
						+ "\n1 - Save 1"
						+ "\n2 - Save 2"
						+ "\n3 - Não carregar nenhum save!");
				System.out.println("\nSave 1"
						+"\nNome da Pessoa: " + listaDeSaves.get(2)
						+"\nNome da Planta: " + listaDeSaves.get(3)
						+"\nApelido da Planta: " + listaDeSaves.get(4));
				System.out.println("\nSave 2"
						+"\nNome da Pessoa: " + listaDeSaves.get(11)
						+"\nNome da Planta: " + listaDeSaves.get(12)
						+"\nApelido da Planta: " + listaDeSaves.get(13));

				int decisao = sc.nextInt();
				escolha = new ValidarEscolhaAcoes(decisao);
				
				if(decisao == 1) {
					System.out.println("Carregando save do slote 1!");
					Pessoa pessoa = new Pessoa(listaDeSaves.get(2));
					pessoa.setEscolhaDoSave(1);
					System.out.println("Seja bem vindo de volta, "  + pessoa.getNomePessoa());
					return pessoa;
				} else if(decisao == 2) {
					System.out.println("Carregando save do slote 2!");
					Pessoa pessoa = new Pessoa(listaDeSaves.get(11));
					pessoa.setEscolhaDoSave(2);
					System.out.println("Seja bem vindo de volta, "  + pessoa.getNomePessoa());
					return pessoa;
				} else if (decisao == 3) {
					System.out.println("Não foi carregado nenhum save, fechando jogo...");
					System.exit(0);
				} else {
					System.out.println("Opção Inválida!");
				}
				
			}
			while(escolha.validaEscolhaLoad() == false);
		} else if(listaDeSaves.size() == 10 && validaPessoa.verificarArquivoPessoaExiste(3)) {
			int decisao;
			do {
				System.out.println("Existe um save no slot 1!");	
				System.out.println("\nSave 1"
						+"\nNome da Pessoa: " + listaDeSaves.get(2)
						+"\nNome da Planta: " + listaDeSaves.get(3)
						+"\nApelido da Planta: " + listaDeSaves.get(4));
				
				System.out.println("Deseja carregar?"
						+ "\n1 - Sim"
						+ "\n2 - Não");
				
				decisao = sc.nextInt();
				
				if(decisao == 1) {
					System.out.println("Carregando save do slote 1!");
					Pessoa pessoa = new Pessoa(listaDeSaves.get(2));
					System.out.println("Seja bem vindo de volta, "  + pessoa.getNomePessoa());
					pessoa.setEscolhaDoSave(1);
					return pessoa;
				} else if(decisao == 2) {
					System.out.println("Não foi carregado nenhum save, fechando jogo...");
					System.exit(0);
				} else {
					System.out.println("Escolha Inválida");
				}
			}
			while(decisao < 0 && decisao > 2);
		}
		return null;
	}
	
}
