package com.desginPatterns.core.shapes;

public class Triangle implements Shape {

	private double base;
	private double height;
	
	public Triangle() { }

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
