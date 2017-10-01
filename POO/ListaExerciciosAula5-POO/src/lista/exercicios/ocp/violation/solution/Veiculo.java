package lista.exercicios.ocp.violation.solution;

public class Veiculo {

	private ModoDirecao modoDirecao = ModoDirecao.PASSEIO;

	public ModoDirecao getModoDirecao() {
		return modoDirecao;
	}

	public void setModoDirecao(ModoDirecao modoDirecao) {
		this.modoDirecao = modoDirecao;
	}

}