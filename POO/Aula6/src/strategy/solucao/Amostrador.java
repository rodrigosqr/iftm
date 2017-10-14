package strategy.solucao;


public class Amostrador {

	private int tamanhoAmostra;
	private int[] populacao;
	private ITipoAmostrador tipoAmostrador;
	
	public Amostrador(int[] codigosZip, int tamanhoAmostra, ITipoAmostrador tipoAmostrador) {
		this.populacao = codigosZip;
		this.tamanhoAmostra = tamanhoAmostra;
		this.tipoAmostrador = tipoAmostrador;
	}

	public int[] selecionaSubconjunto() {
		return tipoAmostrador.subconjunto(populacao, tamanhoAmostra);

	}

	public int getTamanhoAmostra() {
		return tamanhoAmostra;
	}

	public void setTamanhoAmostra(int tamanhoAmostra) {
		this.tamanhoAmostra = tamanhoAmostra;
	}

	public int[] getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int[] populacao) {
		this.populacao = populacao;
	}

	public ITipoAmostrador getTipoAmostrador() {
		return tipoAmostrador;
	}

	public void setTipoAmostrador(ITipoAmostrador tipoAmostrador) {
		this.tipoAmostrador = tipoAmostrador;
	}
	
}