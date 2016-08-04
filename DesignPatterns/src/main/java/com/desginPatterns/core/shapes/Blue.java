package com.desginPatterns.core.shapes;

public class Blue implements Color {

	public Blue() { }
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#getName()
	 */
	@Override
	public String getName() {
		return "Blue";
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Filling with Blue coloring");
	}

}
