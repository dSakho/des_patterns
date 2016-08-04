package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Color;
import com.desginPatterns.core.shapes.ColoredShape;
import com.desginPatterns.core.shapes.Shape;
import com.designPatterns.creational.factory.ColorFactory.ColorType;

public class ColoredShapeFactoryTest {
	
	public static void main(String[] args) {
		
		Color red = null, blue = null;
		
		red = ColorFactory.getColor(ColorType.RED);
		blue = ColorFactory.getColor(ColorType.BLUE);
		
		Shape circle = null, rectangle = null, square = null;
		
		circle = ShapeFactory.getShape("com.desginPatterns.core.shapes.Circle");
		rectangle = ShapeFactory.getShape("com.desginPatterns.core.shapes.Rectangle");
		square = ShapeFactory.getShape("com.desginPatterns.core.shapes.Square");
		
		ColoredShape coloredShape = ColoredShapeFactory.getColoredShape(ColorType.GREEN, "com.desginPatterns.core.shapes.Triangle");
		
		System.out.println("Runtime type of Colors: ");
		System.out.println(red.getClass().getName());
		System.out.println(blue.getClass().getName());
		System.out.println();
		System.out.println("Runtime type of Shapes: ");
		System.out.println(circle.getClass().getName());
		System.out.println(rectangle.getClass().getName());
		System.out.println(square.getClass().getName());
		System.out.println();
		System.out.println("Colored Shape: ");
		System.out.println(coloredShape.getName());
	}
}
