package com.example.services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.interfaces.LogAspect;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import com.example.model.Song;

@Component
public class VehicleServices {

	private Logger logger = Logger.getLogger(VehicleServices.class.getName());

	@Autowired
	private Speakers speakers;

	private Tyres tyres;

	@LogAspect
	public String playMusic(boolean vehicleStarted, Song song) {
		return speakers.makeSound(song);
	}

	public String moveVehicle(boolean vehicleStarted) {
		return tyres.rotate();
	}

	public String applyBrake(boolean vehicleStarted) {
		return tyres.stop();
	}

	public Tyres getTyres() {
		return tyres;
	}

	@Autowired
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

}
