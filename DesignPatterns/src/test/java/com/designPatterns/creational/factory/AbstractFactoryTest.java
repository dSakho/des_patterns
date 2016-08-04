package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Color;
import com.desginPatterns.core.shapes.Shape;
import com.designPatterns.creational.factory.AbstractFactory;
import com.designPatterns.creational.factory.ColorFactory.ColorType;
import com.designPatterns.creational.factory.FactoryProducer;

public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Color red = null, blue = null, green = null;
		
		red = colorFactory.getColor(ColorType.RED);
		blue = colorFactory.getColor(ColorType.BLUE);
		green = colorFactory.getColor(ColorType.GREEN);
		
		Shape circle = null, rectangle = null, square = null, triangle = null;
		
		circle = shapeFactory.getShape("com.desginPatterns.core.shapes.Circle");
		rectangle = shapeFactory.getShape("com.desginPatterns.core.shapes.Rectangle");
		square = shapeFactory.getShape("com.desginPatterns.core.shapes.Square");
		triangle = shapeFactory.getShape("com.desginPatterns.core.shapes.Triangle");
		
		System.out.println("Runtime type of Colors: ");
		System.out.println(red.getClass().getName());
		System.out.println(blue.getClass().getName());
		System.out.println(green.getClass().getName());
		System.out.println();
		System.out.println("Runtime type of Shapes: ");
		System.out.println(circle.getClass().getName());
		System.out.println(rectangle.getClass().getName());
		System.out.println(square.getClass().getName());
		System.out.println(triangle.getClass().getName());
	}
}
