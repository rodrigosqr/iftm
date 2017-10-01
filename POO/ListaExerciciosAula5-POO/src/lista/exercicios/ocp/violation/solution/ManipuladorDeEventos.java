package lista.exercicios.ocp.violation.solution;

public class ManipuladorDeEventos {

	private Veiculo veiculo;

	public ManipuladorDeEventos(final Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void mudarModoDirecao(final ModoDirecao modoDirecao) {
		veiculo.setModoDirecao(modoDirecao);
	}
}
