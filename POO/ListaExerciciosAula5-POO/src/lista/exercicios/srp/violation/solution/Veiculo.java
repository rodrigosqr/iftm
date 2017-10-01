package lista.exercicios.srp.violation.solution;

public class Veiculo implements IVeiculo {

	private final int capacidadeTanqueCombustivel;
	private int quantidadeCombustivel;

	public Veiculo(int capacidadeTanque) {
		this.capacidadeTanqueCombustivel = capacidadeTanque;
		quantidadeCombustivel = capacidadeTanque;
	}

	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		if (quantidadeCombustivel > capacidadeTanqueCombustivel) {
			this.quantidadeCombustivel = capacidadeTanqueCombustivel;
		} else {
			this.quantidadeCombustivel = quantidadeCombustivel;
		}
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

	@Override
	public void acelerar() {
		quantidadeCombustivel--;
	}
}
