package br.com.unip.aps.manipulacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;
import br.com.unip.aps.util.ValidaArquivoSaveTxt;
import br.com.unip.aps.util.ValidarEscolhaAcoes;

public class ManipulaSave {
	
	public void Save(Pessoa pessoa, Planta planta) throws IOException {
		
		ValidaArquivoSaveTxt validaTxt = new ValidaArquivoSaveTxt();
		File arquivoSave = new File("save.txt");
		FileWriter fw = new FileWriter(arquivoSave, true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		if(!validaTxt.verficarArquivoExiste(arquivoSave)) {
			arquivoSave.createNewFile();
			bw.write("ARQUIVO DE SALVE DO GAME CUIDE DE UMA PLANTA !!!");
			bw.newLine();
			bw.append("1"
			+ "\n" + pessoa.getNomePessoa()
			+ "\n" + planta.getNomePlanta()
			+ "\n" + planta.getApelidoPlanta()
			+ "\n" + planta.getGrupoPlanta());
			
			bw.close();
			fw.close();
		} else {
			ValidarEscolhaAcoes valida;
			do {
				System.out.println("Já possui um save no slot 1!"
						+ "\nDeseja Sobrescrever?"
						+ "\n1 - Sim"
						+ "\n2 - Não");
				Scanner sc = new Scanner(System.in);
				int desejo = sc.nextInt();
				valida = new ValidarEscolhaAcoes(desejo);
				
				if(desejo == 1) {
					bw.write("ARQUIVO DE SALVE DO GAME CUIDE DE UMA PLANTA !!!");
					bw.newLine();
					bw.append("1"
					+ "\n" + pessoa.getNomePessoa()
					+ "\n" + planta.getNomePlanta()
					+ "\n" + planta.getApelidoPlanta()
					+ "\n" + planta.getGrupoPlanta());
					
					bw.close();
					fw.close();
				} else if(desejo == 2) {
					// Para Criar No Save 2
					
					Scanner s = new Scanner(new FileReader("save.txt"));
					List<String> listaDeSaves = new ArrayList<String>();
					while(s.hasNextLine()) {
						listaDeSaves.add(s.nextLine());
					}
					
					String concatenaGrupoPlanta = ""+planta.getGrupoPlanta();
					
					listaDeSaves.add("");
					listaDeSaves.add("2");
					listaDeSaves.add(pessoa.getNomePessoa());
					listaDeSaves.add(planta.getNomePlanta());
					listaDeSaves.add(planta.getApelidoPlanta());
					listaDeSaves.add(concatenaGrupoPlanta);
					
					
					
				}else {
					System.out.println("Opção Inválida!"
							+ "\nDigite uma opção válida");
				}
			}
			while(valida.validaEscolhaSave() == false);
		}
	}
}
