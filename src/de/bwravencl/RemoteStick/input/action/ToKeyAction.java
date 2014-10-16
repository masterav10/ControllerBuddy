package de.bwravencl.RemoteStick.input.action;

import de.bwravencl.RemoteStick.input.KeyStroke;

public abstract class ToKeyAction extends InvertableAction {

	protected boolean downUp = false;
	protected boolean wasUp = true;

	protected KeyStroke keystroke = new KeyStroke();

	public boolean isDownUp() {
		return downUp;
	}

	public void setDownUp(Boolean downUp) {
		this.downUp = downUp;
	}

	public KeyStroke getKeystroke() {
		return keystroke;
	}

	public void setKeystroke(KeyStroke keystroke) {
		this.keystroke = keystroke;
	}

	@Override
	public String toString() {
		return rb.getString("TO_KEY_ACTION_STRING");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		final ToKeyAction toKeyAction = (ToKeyAction) super.clone();
		toKeyAction.setKeystroke((KeyStroke) keystroke.clone());

		return toKeyAction;
	}

}
