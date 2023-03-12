package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ProjectConfig;
import com.example.model.Song;
import com.example.services.VehicleServices;

public class Main {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var vehicleServices = context.getBean(VehicleServices.class);
		System.out.println(vehicleServices.getClass());
		Song song = new Song();
		song.setTitle("Blank Blank");
		song.setSingerName("Emminem");
		boolean vehicleStarted = true;
//		String moveVehicle = vehicleServices.moveVehicle(vehicleStarted);
		String playMusic = vehicleServices.playMusic(vehicleStarted, song);
//		String applyBrake = vehicleServices.applyBrake(vehicleStarted);
		context.close();

	}
}
