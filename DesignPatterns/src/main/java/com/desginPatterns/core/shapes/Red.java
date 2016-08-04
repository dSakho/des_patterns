package com.desginPatterns.core.shapes;

public class Red implements Color {

	public Red() { }
	
	@Override
	public void fill() {
		System.out.println("Filling with Red coloring");
	}

}
