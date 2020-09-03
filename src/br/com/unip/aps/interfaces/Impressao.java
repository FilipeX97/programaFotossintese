package br.com.unip.aps.interfaces;

import br.com.unip.aps.modelo.Pessoa;
import br.com.unip.aps.modelo.planta.Planta;

public interface Impressao {
	String dadosParaImpressao(Pessoa pe, Planta p);
}
