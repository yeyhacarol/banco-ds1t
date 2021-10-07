package br.senai.sp.jandira.model;

public class Agencia {
	
	private String numeroAgencia;
	private String nomeGerente;
	private String telefoneAgencia;
	private String cidadeAgencia;
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	public void setNomeGerente(String nomeGerente) {
		this.nomeGerente = nomeGerente;
	}
	
	public String getNomeGerente() {
		return nomeGerente;
	}
	
	public void setTelefoneAgencia(String telefoneAgencia) {
		this.telefoneAgencia = telefoneAgencia;
	}
	
	public String getTelefoneAgencia() {
		return telefoneAgencia;
	}
	
	public void setCidadeAgencia(String cidadeAgencia) {
		this.cidadeAgencia = cidadeAgencia;
	}
	
	public String getCidadeAgencia() {
		return cidadeAgencia;
	}

}
