package com.desginPatterns.core.shapes;

public class Circle implements Shape {

	private double radius;
	
	public Circle() { }
	
	public Circle(double radius) {
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * @see com.designPatterns.core.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
