package br.com.unip.aps.main;

import br.com.unip.aps.modelo.planta.Arvore;
import br.com.unip.aps.modelo.planta.Planta;

public class TestePrograma {
	public static void main(String[] args) {
		Planta p1 = new Arvore("teste", "testando");
		System.out.println("1"+ p1.getNomePlanta()
		+"2" + p1.getApelido()
		+"3" + p1.getGrupo()
		+"4" + p1.getqColher()
		+"5" + p1.getEstagioAtual()
		
				);
	}
}
