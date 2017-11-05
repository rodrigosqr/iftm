package state;

public class ClosedState implements IState {
	@SuppressWarnings("unused")
	private ChangeRequestContext CRSystem;

	public ClosedState(ChangeRequestContext CRSystem) {
		this.CRSystem = CRSystem;
	}

	public void assignToDev() {
		System.out.println("Cannot be done as CR is closed.");
	}

	public void assignToTester() {
		System.out.println("Cannot be done as CR is closed.");
	}

	public void markTested() {
		System.out.println("Cannot be done as CR is closed.");
	}
	
}
