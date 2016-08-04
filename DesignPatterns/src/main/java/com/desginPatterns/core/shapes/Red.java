package com.desginPatterns.core.shapes;

public class Red implements Color {

	public Red() { }
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#getName()
	 */
	@Override
	public String getName() {
		return "Red";
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Filling with Red coloring");
	}

}
