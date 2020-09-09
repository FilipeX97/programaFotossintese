package br.com.unip.aps.main;

import java.io.IOException;
import java.util.Scanner;

import br.com.unip.aps.manipulacao.ManipulaImpressaoDeDados;
import br.com.unip.aps.manipulacao.ManipulaLoadPessoa;
import br.com.unip.aps.manipulacao.ManipulaLoadPlanta;
import br.com.unip.aps.manipulacao.ManipulaSave;
import br.com.unip.aps.manipulacao.pessoa.ManipulaCriarPessoa;
import br.com.unip.aps.manipulacao.pessoa.ManipulaDormirPessoa;
import br.com.unip.aps.manipulacao.planta.ManipulaColherPlanta;
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
		ManipulaColherPlanta colhePlanta;
		ManipulaDormirPessoa dormirPessoa;
		ManipulaMatarPlanta matarPlanta;
		ManipulaSave salvar;

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Planta planta = null;
		Pessoa pessoa = null;
		
		int escolhaMain = 0;
		boolean validarLoad = false;
		String nomePessoa;
		String nomePlanta;
		String apelidoPlanta;
		String validacaoScanner;
		
		System.out.println("Bem Vindo ao Programa Fotossíntese"
				+ "\nEscolha uma opção para continuar: ");
		do {
			System.out.println("1 - Iniciar Jogo");
			System.out.println("0 - Fechar Jogo");
			
			validacaoScanner = sc2.nextLine();
			if(validacaoScanner.matches("[0-9]*")) {
				escolhaMain = Integer.parseInt(validacaoScanner);
			}else {
				escolhaMain = 9;
			}
			
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
			
			validacaoScanner = sc2.nextLine();
			if(validacaoScanner.matches("[0-9]*")) {
				escolhaMain = Integer.parseInt(validacaoScanner);
			}else {
				escolhaMain = 9;
			}
			
			escolha = new ValidarEscolhaAcoes(escolhaMain);
			
			if(escolhaMain != 1 ) {
				System.out.println("Opção Inválida!");
				if(validarLoad == false && escolhaMain == 2)
					System.out.println("Não contêm load!");
			}
		}
		while(escolha.validaOpcaoDeJogo(validarLoad) == false);
		
		if (escolhaMain == 1) {
			do {
				System.out.println("Digite o Nome da Pessoa: ");
				nomePessoa = sc2.nextLine();
				if(nomePessoa.length() == 0) {
					System.out.println("Digitação Inválida, não deixe o campo em branco");
				}
			}
			while(nomePessoa.length() == 0);
			
			pessoa = criarPessoa.criarPessoa(nomePessoa);
			
			
			do {
				System.out.println("Escolha a Categoria da sua Planta: \n" +
						"1 - Árvore\n" + 
						"2 - Flor\n" + 
						"3 - Fruta\n" + 
						"4 - Legume\n" + 
						"5 - Tempero\n" + 
						"6 - Vegetal");
				
				validacaoScanner = sc2.nextLine();
				if(validacaoScanner.matches("[0-9]*")) {
					escolhaMain = Integer.parseInt(validacaoScanner);
				}else {
					escolhaMain = 9;
				}
				
				escolha = new ValidarEscolhaAcoes(escolhaMain);
				if(escolha.validarCriacaoPlanta() == false) {
					System.out.println("Opção Inválida!");
				}
			}
			while(escolha.validarCriacaoPlanta() == false);
				
			criarPlanta = new ManipulaCriarPlanta(escolhaMain);
			do {
				System.out.println("Digite o nome da Planta: ");
				nomePlanta = sc2.nextLine();
				System.out.println("Digite o Apelido da Planta");
				apelidoPlanta = sc2.nextLine();
				
				if(nomePlanta.length() == 0) {
					System.out.println("Nome da planta inválida!");
				}
				if(apelidoPlanta.length() == 0) {
					System.out.println("Apelido da planta inválida!");
				}
			}
			while(nomePlanta.length() == 0 || apelidoPlanta.length() == 0);
			planta = criarPlanta.criarPlanta(nomePlanta, apelidoPlanta);
				
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
				
				validacaoScanner = sc2.nextLine();
				if(validacaoScanner.matches("[0-9]*")) {
					escolhaMain = Integer.parseInt(validacaoScanner);
				}else {
					escolhaMain = 9;
				}
				
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
				// TODO: Criar opção de colher
				colhePlanta = new ManipulaColherPlanta();
				colhePlanta.colherPlanta(planta);
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
				salvar.saveArquivo(pessoa, planta);
			}
		}
		while(escolhaMain != 7);
		
		System.exit(0);
		
		sc1.close();
		sc2.close();
	}
}
