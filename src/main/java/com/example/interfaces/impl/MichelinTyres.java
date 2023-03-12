package com.example.interfaces.impl;

import com.example.interfaces.Tyres;

public class MichelinTyres implements Tyres {

	@Override
	public String rotate() {
		return "Vehicle is moving with the help MichelinTyres.";
	}

	@Override
	public String stop() {
		return "Vehicle is stopped with the help of Michelin Tyres.";
	}

}
