package lista.exercicios.lsp.violation.solution;

public class Carro {
	private Veiculo veiculo;
	
	public Carro() {
		veiculo = new Veiculo();
	}
        
    public void mudaMarcha(Marcha marcha) {
        if(Marcha.R.equals(marcha) && veiculo.getMarcha().equals(Marcha.D)){
            throw new RuntimeException("N�o pode mudar para REVERSE quando " + veiculo.getMarcha().toString() + " marcha est� engatada!");
        }
        veiculo.mudaMarcha(marcha);
    }
}
