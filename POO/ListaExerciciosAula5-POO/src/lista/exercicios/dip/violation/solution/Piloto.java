package lista.exercicios.dip.violation.solution;

public class Piloto {

	private CarroDeCorrida veiculo;

	public Piloto() {
		this.veiculo = new CarroDeCorrida(100);
	}

	public void aumentaVelocidade() {
		veiculo.acelerar();
	}
}
