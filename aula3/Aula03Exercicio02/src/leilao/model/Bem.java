package leilao.model;

public class Bem {
	private String nome;
	private Double valorInicial;	
	
	
	public Bem(){}
	
	public Bem(String nome, Double valorInicial) {
		this.nome = nome;
		this.valorInicial = valorInicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}
	
	@Override
	public String toString() {
		return "Nome do bem: " + this.nome + ", Valor incial: " + this.valorInicial;
	}

}
