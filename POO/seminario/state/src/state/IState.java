package state;

public interface IState {
	public void assignToDev();

	public void assignToTester();

	public void markTested();
}