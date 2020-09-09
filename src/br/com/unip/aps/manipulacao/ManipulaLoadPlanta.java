package br.com.unip.aps.manipulacao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.unip.aps.manipulacao.planta.ManipulaCriarPlanta;
import br.com.unip.aps.modelo.planta.Planta;

public class ManipulaLoadPlanta {
	
	public Planta loadPlanta(int save) throws FileNotFoundException {
		ManipulaCriarPlanta criaPlanta = null;
		Planta planta;
		Scanner s = new Scanner(new FileReader("save.txt"));
		List<String> listaDeSaves = new ArrayList<String>();
		
		while(s.hasNextLine()) {
			listaDeSaves.add(s.nextLine());
		}
		
		if(save == 1) {
			criaPlanta = new ManipulaCriarPlanta(Integer.parseInt((listaDeSaves.get(5))));
			planta = criaPlanta.criarPlanta(listaDeSaves.get(3), listaDeSaves.get(4));
			planta.setEstadoPlanta(Boolean.parseBoolean(listaDeSaves.get(6)));
			planta.setQuantidadeDeEnergiaNaPlanta(Integer.parseInt(listaDeSaves.get(7)));
			planta.setEstagioAtualPlanta(Integer.parseInt(listaDeSaves.get(8)));
			return planta;
		} else if(save == 2) {
			criaPlanta = new ManipulaCriarPlanta(Integer.parseInt((listaDeSaves.get(14))));
			planta = criaPlanta.criarPlanta(listaDeSaves.get(12), listaDeSaves.get(13));
			planta.setEstadoPlanta(Boolean.parseBoolean(listaDeSaves.get(15)));
			planta.setQuantidadeDeEnergiaNaPlanta(Integer.parseInt(listaDeSaves.get(16)));
			planta.setEstagioAtualPlanta(Integer.parseInt(listaDeSaves.get(17)));
			return planta;
		}
		return null;
		
		
	}
	
	
}
