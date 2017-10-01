package lista.exercicios.dip.violation.solution;

public class CarroDeCorrida implements ICarro{

    private final int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;
    private int potencia;

    public CarroDeCorrida(final int combustivel) {
        this.capacidadeTanqueCombustivel = combustivel;
        this.quantidadeCombustivel = combustivel;
    }

	@Override
	public void acelerar() {
        potencia++;
        quantidadeCombustivel--;		
	}


}