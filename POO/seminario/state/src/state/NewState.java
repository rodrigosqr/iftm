package state;

public class NewState implements IState {
	private ChangeRequestContext CRSystem;

	public NewState(ChangeRequestContext CRSystem) {
		this.CRSystem = CRSystem;
	}

	public void assignToDev() {
		System.out.println("Assigning to available developer.");
		this.CRSystem.setCurrentState(CRSystem.getUnderDevState());
	}

	public void assignToTester() {
		System.out.println("Cannot be assigned to tester from new state.");
	}

	public void markTested() {
		System.out.println("Cannot be marked tested when it is new.");
	}
}