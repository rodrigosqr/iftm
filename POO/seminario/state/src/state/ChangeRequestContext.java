package state;

public class ChangeRequestContext {
	IState newState;
	IState underDevState;
	IState underTestState;
	IState closedState;
	IState currentState = new NewState(this);

	public ChangeRequestContext() {
		newState = new NewState(this);
		underDevState = new UnderDevState(this);
		underTestState = new UnderTestState(this);
		closedState = new ClosedState(this);
	}

	public void assignToDev() {
		currentState.assignToDev();
	}

	public void assignToTester() {
		currentState.assignToTester();
	}

	public void markTested() {
		currentState.markTested();
	}

	public IState getNewState() {
		return newState;
	}

	public void setNewState(IState newState) {
		this.newState = newState;
	}

	public IState getUnderDevState() {
		return underDevState;
	}

	public void setUnderDevState(IState underDevState) {
		this.underDevState = underDevState;
	}

	public IState getUnderTestState() {
		return underTestState;
	}

	public void setUnderTestState(IState underTestState) {
		this.underTestState = underTestState;
	}

	public IState getClosedState() {
		return closedState;
	}

	public void setClosedState(IState closedState) {
		this.closedState = closedState;
	}

	public IState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(IState currentState) {
		this.currentState = currentState;
	}
	
}