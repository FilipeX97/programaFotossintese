package br.com.unip.aps.main;

import java.io.IOException;
import java.util.Scanner;

import br.com.unip.aps.manipulacao.ManipulaImpressaoDeDados;
import br.com.unip.aps.manipulacao.ManipulaLoadPessoa;
import br.com.unip.aps.manipulacao.ManipulaLoadPlanta;
import br.com.unip.aps.manipulacao.ManipulaSave;
import br.com.unip.aps.manipulacao.pessoa.ManipulaCriarPessoa;
import br.com.unip.aps.manipulacao.pessoa.ManipulaDormirPessoa;
import br.com.unip.aps.manipulacao.planta.ManipulaCriarPlanta;
import br.com.unip.aps.manipulacao.planta.ManipulaMatarPlanta;
import br.com.unip.aps.manipulacao.planta.ManipulaRegarPlanta;
import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidaArquivoSaveTxt;
import br.com.unip.aps.util.ValidarEscolhaAcoes;

public class TestaPrograma {
	
	public static void main(String[] args) throws IOException {
		
		ValidarEscolhaAcoes escolha;
		ValidaArquivoSaveTxt validaSaveTxt = new ValidaArquivoSaveTxt();
		ManipulaCriarPlanta criarPlanta;
		ManipulaCriarPessoa criarPessoa = new ManipulaCriarPessoa();
		ManipulaLoadPessoa loadPessoa;
		ManipulaLoadPlanta loadPlanta;
		ManipulaRegarPlanta regaPlanta;
		ManipulaImpressaoDeDados imprimir;
		ManipulaDormirPessoa dormirPessoa;
		ManipulaMatarPlanta matarPlanta;
		ManipulaSave salvar;

		Scanner sc1 = new Scanner(System.in);
		
		Planta planta = null;
		Pessoa pessoa = null;
		
		int escolhaMain;
		boolean validarLoad = false;
		
		System.out.println("Bem Vindo ao Programa Fotossíntese"
				+ "\nEscolha uma opção para continuar: ");
		do {
			System.out.println("1 - Iniciar Jogo");
			System.out.println("0 - Fechar Jogo");
			
			escolhaMain = sc1.nextInt();
			escolha = new ValidarEscolhaAcoes(escolhaMain);
			
			if(escolhaMain != 0 && escolhaMain != 1) {
				System.out.println("Opção Inválida!");
			}
		}
		while (escolha.validaIniciar() == false);
		
		if(escolhaMain == 0)
			System.exit(0);
		
		do {
			System.out.println("Opções: "
					+ "\n1 - Novo Jogo");
			if(validaSaveTxt.verficarArquivoExiste() == true) {
				validarLoad = true;
				System.out.println("2 - Carregar Jogo");
			}
			
			escolhaMain = sc1.nextInt();
			escolha = new ValidarEscolhaAcoes(escolhaMain);
			
			if(escolhaMain != 1) {
				if (validarLoad == true && escolhaMain != 2) {
					System.out.println("Opção Inválida!");
					if(validarLoad == false)
						System.out.println("Não contêm load!");
				}
			}
		}
		while(escolha.validaOpcaoDeJogo(validarLoad) == false);
		
		if (escolhaMain == 1) {
			System.out.println("Digite o Nome da Pessoa: ");
			String nomePessoa = sc1.nextLine();
			pessoa = criarPessoa.criarPessoa(nomePessoa);
			
			do {
				System.out.println("Escolha a Categoria da sua Planta: " +
						"1 - Flor\n" + 
						"2 - Tempero\n" + 
						"3 - Legume\n" + 
						"4 - Vegetal\n" + 
						"5 - Fruta\n" + 
						"6 - Árvore");
				escolhaMain = sc1.nextInt();
				
				criarPlanta = new ManipulaCriarPlanta(escolhaMain);
				System.out.println("Digite o nome da Planta: ");
				String nomePlanta = sc1.nextLine();
				System.out.println("Digite o Apelido da Planta");
				String apelidoPlanta = sc1.nextLine();
				planta = criarPlanta.criarPlanta(nomePlanta, apelidoPlanta);
				
				if(escolha.validarCriacaoPlanta() == false) {
					System.out.println("Opção Inválida!");
				}
			}
			while(escolha.validarCriacaoPlanta() == false);
		}
		
		if (escolhaMain == 2) {
			if(validaSaveTxt.verficarArquivoExiste()) {
				loadPessoa = new ManipulaLoadPessoa();
				pessoa = loadPessoa.loadPessoa();
				loadPlanta = new ManipulaLoadPlanta();
				planta = loadPlanta.loadPlanta(pessoa.getEscolhaDoSave());
			} else {
				System.out.println("Arquivo não encontrado!");
			}
		}
		do {
			do {
				System.out.println("--------------------------------------------------");
				System.out.println(pessoa.getNomePessoa() + " ,escolha uma ação..."
						+ "\n1 - Colocar Água"
						+ "\n2 - Exibir informações"
						+ "\n3 - Colher"
						+ "\n4 - Dormir"
						+ "\n5 - Matar Planta"
						+ "\n6 - Salvar"
						+ "\n7 - Sair"
						+ "\nEscolha: ");
				escolhaMain = sc1.nextInt();
				escolha = new ValidarEscolhaAcoes(escolhaMain);
				
				if(escolha.validaAcao() == false)
					System.out.println("Opção Inválida!");
			}
			while(escolha.validaAcao() == false);
			
			if(escolhaMain == 1) {
				regaPlanta = new ManipulaRegarPlanta();
				regaPlanta.regarPlanta(pessoa, planta);
			}
			
			if(escolhaMain == 2) {
				imprimir = new ManipulaImpressaoDeDados();
				System.out.println(imprimir.dadosParaImpressaoDaPessoa(pessoa) + "\n" 
						+ imprimir.dadosParaImpressaoDaPlanta(planta));
			}
			
			if(escolhaMain == 3) {
				// FAZER...
			}
			
			if(escolhaMain == 4) {
				dormirPessoa = new ManipulaDormirPessoa();
				dormirPessoa.dormirPessoa(pessoa, planta);
			}
			
			if(escolhaMain == 5) {
				matarPlanta = new ManipulaMatarPlanta();
				matarPlanta.matarPlanta(planta);
			}

			if(escolhaMain == 6) {
				salvar = new ManipulaSave();
				salvar.Save(pessoa, planta);
			}
		}
		while(escolhaMain != 7);
		
		System.exit(0);
	}
}
