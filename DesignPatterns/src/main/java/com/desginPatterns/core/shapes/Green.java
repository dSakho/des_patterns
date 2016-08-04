package com.desginPatterns.core.shapes;

public class Green implements Color {

	public Green() { }
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#getName()
	 */
	@Override
	public String getName() {
		return "Green";
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Filling with Green coloring");
	}

}
