package com.desginPatterns.core.shapes;

public class Rectangle implements Shape {

	private double length;
	private double width;
	
	public Rectangle() { }
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/*
	 * (non-Javadoc)
	 * @see com.designPatterns.core.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return this.length * this.width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
