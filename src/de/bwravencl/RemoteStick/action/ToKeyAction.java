package de.bwravencl.RemoteStick.action;

import de.bwravencl.RemoteStick.KeyStroke;

public abstract class ToKeyAction extends InvertableAction {

	protected boolean downUp = false;
	protected boolean wasUp = true;
	protected KeyStroke keystroke;

	public boolean isDownUp() {
		return downUp;
	}

	public void setDownUp(boolean downUp) {
		this.downUp = downUp;
	}
	
	public KeyStroke getKeystroke() {
		return keystroke;
	}
	
	public void setKeystroke(KeyStroke keystroke) {
		this.keystroke = keystroke;
	}

}
