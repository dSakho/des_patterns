package com.designPatterns.structural.adapter;

import com.desginPatterns.core.RoundHole;
import com.designPattern.structural.adapter.SquarePegAdapter;

/*
 * Convert the interface of a class into another interface clients expect. 
 * 
 * Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 * 
 * Wrap an existing class with a new interface.
 * 
 * Impedance match an old component to a new system
 */
public class AdapterDemoSquarePeg {
	
	public static void main(String[] args) {
		RoundHole rh = new RoundHole(5);
		SquarePegAdapter spa;

		spa = new SquarePegAdapter(9d);
		// The client uses (is coupled to) the new interface
		spa.makeFit(rh);
	}
}
