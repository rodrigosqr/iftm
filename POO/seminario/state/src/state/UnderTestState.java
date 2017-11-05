package state;

public class UnderTestState implements IState {
	private ChangeRequestContext CRSystem;

	public UnderTestState(ChangeRequestContext CRSystem) {
		this.CRSystem = CRSystem;
	}

	public void assignToDev() {
		System.out.println("Assigning Back to Developer.");
		this.CRSystem.setCurrentState(CRSystem.getUnderDevState());
	}

	public void assignToTester() {
		System.out.println("Cannot be done as already under test.");
	}

	public void markTested() {
		System.out.println("Marking as tested.");
		this.CRSystem.setCurrentState(CRSystem.getClosedState());
	}
}
