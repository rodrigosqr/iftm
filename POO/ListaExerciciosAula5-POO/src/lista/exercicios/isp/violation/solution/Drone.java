package lista.exercicios.isp.violation.solution;

public class Drone extends Veiculo implements ICamera {

    private boolean cameraOn;

    public boolean isCameraOn() {
        return cameraOn;
    }

	@Override
	public void ligarCamera() {
		cameraOn = true;
	}

	@Override
	public void desligarCamera() {
		cameraOn = false;
	}
}