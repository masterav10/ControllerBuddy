package de.bwravencl.controllerbuddy.input.action;

import de.bwravencl.controllerbuddy.input.Input;

public class ButtonToNextCycleAction extends DescribedAction implements IButtonToAction {

	private boolean longPress = DEFAULT_LONG_PRESS;
	private float activationValue = DEFAULT_ACTIVATION_VALUE;
	private boolean previous = false;

	@Override
	public void doAction(Input input, float value) {
		final ButtonToCycleAction action = input.getActiveCycleAction();

		if (action != null) {
			action.cycle(previous);
		}
	}

	@Override
	public float getActivationValue() {
		return activationValue;
	}

	@Override
	public boolean isLongPress() {
		return longPress;
	}

	public boolean isPrevious() {
		return previous;
	}

	@Override
	public void setActivationValue(Float activationValue) {
		this.activationValue = activationValue;
	}

	@Override
	public void setLongPress(Boolean longPress) {
		this.longPress = longPress;
	}

	public void setPrevious(Boolean previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return rb.getString("BUTTON_TO_NEXT_CYCLE_ACTION_STRING");
	}

}
