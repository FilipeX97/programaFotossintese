package br.com.unip.aps.modelo.planta;

import br.com.unip.aps.modelo.Natureza;

public abstract class Planta {

	private String nomePlanta;
	private int grupo;
	private boolean estado;
	private int qLuz;
	private int qAgua;
	private int qAguaDia;
	private int qEnergia;
	private int qColher;
	private boolean colheu;
	private boolean respirando;
	private final static int estagioInicial = 1;
	private int estagioAtual;
	private int estagioFinal;
	private String apelido;
	
	Natureza n = new Natureza();
	
	Planta(){
		estado = true;
		qLuz = 0;
		qAgua = 0;
		qAguaDia = 0;
		colheu = false;
		respirando = n.getAr();
		estagioAtual = estagioInicial;
	}

	public String getNomePlanta() {
		return nomePlanta;
	}

	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getqLuz() {
		return qLuz;
	}

	public void setqLuz(int qLuz) {
		this.qLuz = qLuz;
	}

	public int getqAgua() {
		return qAgua;
	}

	public void setqAgua(int qAgua) {
		this.qAgua = qAgua;
	}

	public int getqAguaDia() {
		return qAguaDia;
	}

	public void setqAguaDia(int qAguaDia) {
		this.qAguaDia = qAguaDia;
	}

	public int getqEnergia() {
		return qEnergia;
	}

	public void setqEnergia(int qEnergia) {
		this.qEnergia = qEnergia;
	}

	public int getqColher() {
		return qColher;
	}

	public void setqColher(int qColher) {
		this.qColher = qColher;
	}

	public boolean isColheu() {
		return colheu;
	}

	public void setColheu(boolean colheu) {
		this.colheu = colheu;
	}

	public boolean isRespirando() {
		return respirando;
	}

	public void setRespirando(boolean respirando) {
		this.respirando = respirando;
	}

	public int getEstagioAtual() {
		return estagioAtual;
	}

	public void setEstagioAtual(int estagioAtual) {
		this.estagioAtual = estagioAtual;
	}

	public int getEstagioFinal() {
		return estagioFinal;
	}

	public void setEstagioFinal(int estagioFinal) {
		this.estagioFinal = estagioFinal;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
}
