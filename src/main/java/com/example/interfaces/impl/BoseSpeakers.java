package com.example.interfaces.impl;

import com.example.interfaces.Speakers;
import com.example.model.Song;

public class BoseSpeakers implements Speakers {

	@Override
	public String makeSound(Song song) {
		return "Playing the song " + song.getTitle() + " by" + song.getSingerName() + " with Bose Speakers";
	}

}
