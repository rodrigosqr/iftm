package state;

public class UnderDevState implements IState {
	private ChangeRequestContext CRSystem;

	public UnderDevState(ChangeRequestContext CRSystem) {
		this.CRSystem = CRSystem;
	}

	public void assignToDev() {
		System.out.println("It's already assigned to a developer.");
	}

	public void assignToTester() {
		System.out.println("Assigning to available tester.");
		this.CRSystem.setCurrentState(CRSystem.getUnderTestState());
	}

	public void markTested() {
		System.out.println("Cannot be marked tested when it is under dev.");
	}
}