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

package com.stainlesscode.mediapipeline.factory;

import com.stainlesscode.mediapipeline.EngineConfiguration;
import com.stainlesscode.mediapipeline.VideoOutput;

public class VideoOutputFactory {

	public static VideoOutput createVideoOutput(
			EngineConfiguration engineConfiguration)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String voClassName = engineConfiguration.getConfiguration().get(
				EngineConfiguration.VIDEO_OUTPUT_KEY);
		VideoOutput vo = (VideoOutput) Class.forName(voClassName).newInstance();
		return vo;
	}

}
