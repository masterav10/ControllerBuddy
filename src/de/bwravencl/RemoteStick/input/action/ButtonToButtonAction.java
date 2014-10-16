package de.bwravencl.RemoteStick.input.action;

import de.bwravencl.RemoteStick.input.Input;

public class ButtonToButtonAction extends ToButtonAction {

	@Override
	public void doAction(Input input, float value) {
		input.setButtons(buttonId, invert ? -value : value);
	}

}
