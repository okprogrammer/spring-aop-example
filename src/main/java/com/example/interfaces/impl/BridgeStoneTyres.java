package com.example.interfaces.impl;

import org.springframework.stereotype.Component;

import com.example.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

	@Override
	public String rotate() {
		return "Vehicle moving with the help of BridgeStone tyre.";
	}

	@Override
	public String stop() {
		return "Vehicle stopped with the help fo BridgeStone tyre";
	}

}
