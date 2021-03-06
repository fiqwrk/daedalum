/*
 * Copyright 2010-2011 Stainless Code
 *
 *  This file is part of Daedalum.
 *
 *  Daedalum is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Daedalum is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Daedalum.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.stainlesscode.mediapipeline.util;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

import com.stainlesscode.mediapipeline.event.MediaPlayerEvent;
import com.stainlesscode.mediapipeline.event.MediaPlayerEventListener;

@SuppressWarnings("serial")
public class MediaPlayerEventSupportedJComponent extends JComponent {
	
	protected List<MediaPlayerEventListener> listeners = new ArrayList<MediaPlayerEventListener>();

	protected void fireMediaPlayerEvent(MediaPlayerEvent evt) {
		for (MediaPlayerEventListener listener : listeners) {
			listener.mediaPlayerEventReceived(evt);
		}
	}

	public void addMediaPlayerEventListener(MediaPlayerEventListener listener) {
		listeners.add(listener);
	}

	public void removeMediaPlayerEventListener(MediaPlayerEventListener listener) {
		listeners.remove(listener);
	}

}
