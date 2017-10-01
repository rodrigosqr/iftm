package lista.exercicios.ocp.violation.solution;

public enum ModoDirecao {
    ESPORTE(500,10), 
    PASSEIO(400,20);
    
	private int potencia;
	private int alturaSuspencao;
	
	ModoDirecao(int potencia, int alturaSuspensao) {
		this.potencia = potencia;
		this.alturaSuspencao = alturaSuspensao;
	}

	public int getPotencia() {
		return potencia;
	}

	public int getAlturaSuspencao() {
		return alturaSuspencao;
	}
	
}
