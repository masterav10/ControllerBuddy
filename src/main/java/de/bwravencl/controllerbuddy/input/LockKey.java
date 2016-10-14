/* Copyright (C) 2016  Matteo Hausner
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package de.bwravencl.controllerbuddy.input;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

public class LockKey {

	public static final LockKey[] LOCK_KEYS = { new LockKey("Caps Lock", KeyEvent.VK_CAPS_LOCK),
			new LockKey("Num Lock", KeyEvent.VK_NUM_LOCK), new LockKey("Scroll Lock", KeyEvent.VK_SCROLL_LOCK),
			new LockKey("Kana Lock", KeyEvent.VK_KANA_LOCK), };

	public static final Map<LockKey, Integer> lockKeyToVirtualKeyCodeMap;
	public static final Map<Integer, LockKey> virtualKeyCodeToLockKeyMap;

	static {
		lockKeyToVirtualKeyCodeMap = new HashMap<>();
		virtualKeyCodeToLockKeyMap = new HashMap<>();

		for (final LockKey lk : LOCK_KEYS) {
			lockKeyToVirtualKeyCodeMap.put(lk, lk.virtualKeyCode);
			virtualKeyCodeToLockKeyMap.put(lk.virtualKeyCode, lk);
		}
	}

	public final String name;
	public final int virtualKeyCode;

	public LockKey(String name, int virtualKeyCode) {
		this.name = name;
		this.virtualKeyCode = virtualKeyCode;
	}

	@Override
	public String toString() {
		return name;
	}

}
