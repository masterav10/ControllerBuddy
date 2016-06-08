package de.bwravencl.controllerbuddy.input.action;

public abstract class DescribedAction implements IAction {

	private String description = "";

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

}
