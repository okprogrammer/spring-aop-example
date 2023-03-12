package com.example.interfaces.impl;

import org.springframework.stereotype.Component;

import com.example.interfaces.Speakers;
import com.example.model.Song;

@Component
public class SonySpeakers implements Speakers {

	@Override
	public String makeSound(Song song) {
		return "Playing the songs " + song.getTitle() + " by " + song.getSingerName() + " with Sony Speakers.";
	}

}
