package lista.exercicios.lsp.violation.solution;

public class Aviao {
	private Veiculo veiculo;
	
	public Aviao() {
		veiculo = new Veiculo();
	}
	
	public void mudaMarcha(Marcha marcha) {
        veiculo.mudaMarcha(marcha);
    }
}
