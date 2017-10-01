package lista.exercicios.isp.violation.solution;

public class Carro extends Veiculo implements IRadio{

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

	@Override
	public void ligarRadio() {
		radioOn = true;
	}

	@Override
	public void desligarRadio() {
        radioOn = false;
	}
}