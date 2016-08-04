package com.desginPatterns.core.shapes;

public class ColoredShape implements Color, Shape {

	private Color color;
	private Shape shape;
	
	public ColoredShape() { }
	
	public ColoredShape(Color color, Shape shape) {
		super();
		this.color = color;
		this.shape = shape;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return this.shape.getArea();
	}
	
	@Override
	public String getName() {
		return this.getColor().getName() + " " + this.getShape().getClass().getSimpleName();
	}

	/*
	 * (non-Javadoc)
	 * @see com.desginPatterns.core.shapes.Color#fill()
	 */
	@Override
	public void fill() {
		this.color.fill();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

}
