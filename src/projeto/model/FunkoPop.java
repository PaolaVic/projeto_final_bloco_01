package projeto.model;

import java.util.List;

public abstract class FunkoPop {

	private String nome;
	private String valor;
	private String tamanho;
	private String material;
	private String fandom;

	public FunkoPop(String nome, String valor, String tamanho, String material, String fandom) {
		this.nome = nome;
		this.valor = valor;
		this.tamanho = tamanho;
		this.material = material;
		this.fandom = fandom;

	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFandom() {
		return fandom;
	}

	public void setFandom(String fandom) {
		this.fandom = fandom;

	}
	
	public void visualizar() {
	}

	public void add(List<FunkoEspecial> produtos) {
		
	}
}

