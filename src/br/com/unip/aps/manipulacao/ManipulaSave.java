package br.com.unip.aps.manipulacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidaArquivoSaveTxt;
import br.com.unip.aps.util.ValidarEscolhaAcoes;

public class ManipulaSave {
	
	public void saveArquivo(Pessoa pessoa, Planta planta) throws IOException {
		
		ValidaArquivoSaveTxt validaTxt = new ValidaArquivoSaveTxt();
		File arquivoSave = new File("save.txt");
		
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int desejo;
		int desejo2;
		String validacaoScanner;
		
		if(validaTxt.verficarArquivoExiste()) {
			FileWriter fw = new FileWriter(arquivoSave, true);
			BufferedWriter bw = new BufferedWriter(fw);
			ValidarEscolhaAcoes valida;
			do {
				System.out.println("Já possui um save no slot 1!"
						+ "\nDeseja Sobrescrever?"
						+ "\n1 - Sim"
						+ "\n2 - Não");
				
				validacaoScanner = s.nextLine();
				if(validacaoScanner.matches("[0-9]*")) {
					desejo = Integer.parseInt(validacaoScanner);
				}else {
					desejo = 9;
				}
				
				valida = new ValidarEscolhaAcoes(desejo);
				
				if(desejo == 1) {
					
					Scanner sc = new Scanner(new FileReader("save.txt"));
					List<String> listaDeSaves = new ArrayList<String>();
					while(sc.hasNextLine()) {
						listaDeSaves.add(sc.nextLine());
					}
					
					if(listaDeSaves.size() == 19) {
							
							listaDeSaves.set(1, "\n" + 1);
							listaDeSaves.set(2, "\n" + pessoa.getNomePessoa());
							listaDeSaves.set(3, "\n" + planta.getNomePlanta());
							listaDeSaves.set(4, "\n" + planta.getApelidoPlanta());
							listaDeSaves.set(5, "\n" + String.valueOf(planta.getGrupoPlanta()));
							listaDeSaves.set(6, "\n" + String.valueOf(planta.isEstadoPlanta()));
							listaDeSaves.set(7, "\n" + String.valueOf(planta.getQuantidadeDeEnergiaNaPlanta()));
							listaDeSaves.set(8, "\n" + String.valueOf(planta.getEstagioAtualPlanta()));
							
							PrintWriter writer = new PrintWriter(arquivoSave);
							writer.print("");
							writer.close();
							
							for (int i = 0; i < listaDeSaves.size(); i++) {
								if(i < 9) {
									bw.append(listaDeSaves.get(i));
								} else {
									bw.append("\n" + listaDeSaves.get(i));
								}
							}
							
							bw.close();
							fw.close();
					} else {
						
						PrintWriter writer = new PrintWriter(arquivoSave);
						writer.print("");
						writer.close();
						
						bw.append("ARQUIVO DE SALVE DO GAME CUIDE DE UMA PLANTA !!!");
						bw.append("\n1"
						+ "\n" + pessoa.getNomePessoa()
						+ "\n" + planta.getNomePlanta()
						+ "\n" + planta.getApelidoPlanta()
						+ "\n" + planta.getGrupoPlanta()
						+ "\n" + planta.isEstadoPlanta()
						+ "\n" + planta.getQuantidadeDeEnergiaNaPlanta()
						+ "\n" + planta.getEstagioAtualPlanta()
						+ "\n" + ".");
						
						bw.close();
						fw.close();
					}
					System.out.println("Arquivo sobrescrito no slot 1!");
				} else if(desejo == 2) {
					
					Scanner sc = new Scanner(new FileReader("save.txt"));
					List<String> listaDeSaves = new ArrayList<String>();
					while(sc.hasNextLine()) {
						listaDeSaves.add(sc.nextLine() + "\n");
					}
					
					if(listaDeSaves.size() == 19) {
						ValidarEscolhaAcoes valida2;
						do {
							System.out.println("Já possui um save no slot 2!"
							+ "\nDeseja Sobrescrever?"
							+ "\n1 - Sim"
							+ "\n2 - Não");
							
							validacaoScanner = s.nextLine();
							if(validacaoScanner.matches("[0-9]*")) {
								desejo2 = Integer.parseInt(validacaoScanner);
							}else {
								desejo2 = 9;
							}
							valida2 = new ValidarEscolhaAcoes(desejo2);
							
							if(desejo2 == 1) {
								
								listaDeSaves.set(11, pessoa.getNomePessoa());
								listaDeSaves.set(12, "\n" + planta.getNomePlanta());
								listaDeSaves.set(13, "\n" + planta.getApelidoPlanta());
								listaDeSaves.set(14, "\n" + String.valueOf(planta.getGrupoPlanta()));
								listaDeSaves.set(15, "\n" + String.valueOf(planta.isEstadoPlanta()));
								listaDeSaves.set(16, "\n" + String.valueOf(planta.getQuantidadeDeEnergiaNaPlanta()));
								listaDeSaves.set(17, "\n" + String.valueOf(planta.getEstagioAtualPlanta()));
								listaDeSaves.set(18, "\n" + ".");
								
								PrintWriter writer = new PrintWriter(arquivoSave);
								writer.print("");
								writer.close();
								
								for (int i = 0; i < listaDeSaves.size(); i++) {
									bw.append(listaDeSaves.get(i));
								}
								
								bw.close();
								fw.close();
								
								System.out.println("Arquivo sobrescrito no slot 2!");
								
							}else if(desejo2 == 2) {
								System.out.println("Arquivo não salvo!");
							}else {
								System.out.println("Opção Inválida!");
							}
						}
						while(valida2.validaEscolhaSave() == false);
					} else if(listaDeSaves.size() == 10) {
						
						listaDeSaves.add("2");
						listaDeSaves.add("\n" + pessoa.getNomePessoa());
						listaDeSaves.add("\n" + planta.getNomePlanta());
						listaDeSaves.add("\n" + planta.getApelidoPlanta());
						listaDeSaves.add("\n" + String.valueOf(planta.getGrupoPlanta()));
						listaDeSaves.add("\n" + String.valueOf(planta.isEstadoPlanta()));
						listaDeSaves.add("\n" + String.valueOf(planta.getQuantidadeDeEnergiaNaPlanta()));
						listaDeSaves.add("\n" + String.valueOf(planta.getEstagioAtualPlanta()));
						listaDeSaves.add("\n" + ".");
						
						PrintWriter writer = new PrintWriter(arquivoSave);
						writer.print("");
						writer.close();
						
						for (int i = 0; i < listaDeSaves.size(); i++) {
						bw.append(listaDeSaves.get(i));
						}
						
						bw.close();
						fw.close();
						
						System.out.println("Arquivo salvo no slot 2!");
					}
				}else {
					System.out.println("Opção Inválida!"
							+ "\nDigite uma opção válida");
				}
			}
			while(valida.validaEscolhaSave() == false);
			
		} else {
			FileWriter fw = new FileWriter(arquivoSave, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.append("ARQUIVO DE SALVE DO GAME CUIDE DE UMA PLANTA !!!");
			bw.append("\n1"
			+ "\n" + pessoa.getNomePessoa()
			+ "\n" + planta.getNomePlanta()
			+ "\n" + planta.getApelidoPlanta()
			+ "\n" + planta.getGrupoPlanta()
			+ "\n" + planta.isEstadoPlanta()
			+ "\n" + planta.getQuantidadeDeEnergiaNaPlanta()
			+ "\n" + planta.getEstagioAtualPlanta()
			+ "\n" + ".");
			
			bw.close();
			fw.close();
			
			System.out.println("Arquivo salvo no slot 1!");
		}
		
		
	}
}
