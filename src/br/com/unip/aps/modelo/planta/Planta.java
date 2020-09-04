package br.com.unip.aps.modelo.planta;

import br.com.unip.aps.modelo.Natureza;

public abstract class Planta {

	private String nomePlanta;
	private String apelidoPlanta;
	private int grupoPlanta;
	private boolean estadoPlanta;
	private int quantidadeDeLuz;
	private int quantidadeDeAgua;
	private int quantidadeDeAguaDia;
	private int quantidadeDeEnergiaNaPlanta;
	private int quantidadeParaColherPlanta;
	private boolean colherPlanta;
	private boolean respiracaoPlanta;
	private final static int estagioInicialPlanta = 1;
	private int estagioAtualPlanta;
	private int estagioFinalPlanta;

	Natureza n = new Natureza();

	Planta() {
		estadoPlanta = true;
		quantidadeDeLuz = 0;
		quantidadeDeAgua = 0;
		quantidadeDeAguaDia = 0;
		quantidadeDeEnergiaNaPlanta = 0;
		colherPlanta = false;
		respiracaoPlanta = n.getAr();
		estagioAtualPlanta = estagioInicialPlanta;
	}

	public String getNomePlanta() {
		return nomePlanta;
	}

	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}

	public int getGrupoPlanta() {
		return grupoPlanta;
	}

	public void setGrupoPlanta(int grupo) {
		this.grupoPlanta = grupo;
	}

	public boolean isEstadoPlanta() {
		return estadoPlanta;
	}

	public void setEstadoPlanta(boolean estado) {
		this.estadoPlanta = estado;
	}

	public int getQuantidadeDeLuz() {
		return quantidadeDeLuz;
	}

	public void setQuantidadeDeLuz(int qLuz) {
		this.quantidadeDeLuz = qLuz;
	}

	public int getQuantidadeDeAgua() {
		return quantidadeDeAgua;
	}

	public void setQuantidadeDeAgua(int qAgua) {
		this.quantidadeDeAgua = qAgua;
	}

	public String getApelidoPlanta() {
		return apelidoPlanta;
	}

	public void setApelidoPlanta(String apelidoPlanta) {
		this.apelidoPlanta = apelidoPlanta;
	}

	public int getQuantidadeDeAguaDia() {
		return quantidadeDeAguaDia;
	}

	public void setQuantidadeDeAguaDia(int quantidadeDeAguaDia) {
		this.quantidadeDeAguaDia = quantidadeDeAguaDia;
	}

	public int getQuantidadeDeEnergiaNaPlanta() {
		return quantidadeDeEnergiaNaPlanta;
	}

	public void setQuantidadeDeEnergiaNaPlanta(int quantidadeDeEnergiaNaPlanta) {
		this.quantidadeDeEnergiaNaPlanta = quantidadeDeEnergiaNaPlanta;
	}

	public int getQuantidadeParaColherPlanta() {
		return quantidadeParaColherPlanta;
	}

	public void setQuantidadeParaColherPlanta(int quantidadeParaColherPlanta) {
		this.quantidadeParaColherPlanta = quantidadeParaColherPlanta;
	}

	public boolean isColherPlanta() {
		return colherPlanta;
	}

	public void setColherPlanta(boolean colherPlanta) {
		this.colherPlanta = colherPlanta;
	}

	public boolean isRespiracaoPlanta() {
		return respiracaoPlanta;
	}

	public void setRespiracaoPlanta(boolean respiracaoPlanta) {
		this.respiracaoPlanta = respiracaoPlanta;
	}

	public int getEstagioAtualPlanta() {
		return estagioAtualPlanta;
	}

	public void setEstagioAtualPlanta(int estagioAtualPlanta) {
		this.estagioAtualPlanta = estagioAtualPlanta;
	}

	public int getEstagioFinalPlanta() {
		return estagioFinalPlanta;
	}

	public void setEstagioFinalPlanta(int estagioFinalPlanta) {
		this.estagioFinalPlanta = estagioFinalPlanta;
	}

	public Natureza getN() {
		return n;
	}

	public void setN(Natureza n) {
		this.n = n;
	}

	public static int getEstagioinicialplanta() {
		return estagioInicialPlanta;
	}

}
