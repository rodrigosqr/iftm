package state;

public class Client {
	public static void main(String args[]) {
		ChangeRequestContext CRSystem = new ChangeRequestContext();
		CRSystem.assignToTester();
		CRSystem.assignToDev();
		CRSystem.markTested();
		CRSystem.assignToTester();
		CRSystem.assignToDev();
		CRSystem.assignToTester();
		CRSystem.markTested();
	}
}