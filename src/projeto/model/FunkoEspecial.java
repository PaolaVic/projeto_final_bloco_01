package projeto.model;

public class FunkoEspecial extends FunkoPop

{
	private String brilho;

	public FunkoEspecial(String nome, String valor, String tamanho, String material, String fandom, String brilho) {
		super(nome, valor, tamanho, material, fandom);

		this.brilho = brilho;
	}

	public String getBrilho() {
		return brilho;
	}

	public void setBrilho(String brilho) {
		this.brilho = brilho;
	}

	@Override
	public String toString() {
		return "FunkoEspecial{" + "nome='" + getNome() + '\'' + ", valor='" + getValor() + '\'' + ", tamanho='"
				+ getTamanho() + '\'' + ", material='" + getMaterial() + '\'' + ", fandom='" + getFandom() + '\''
				+ ", brilho='" + brilho + '\'' + '}';

	}
}