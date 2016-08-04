package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Color;
import com.desginPatterns.core.shapes.Shape;
import com.designPatterns.creational.factory.ColorFactory.ColorType;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Shape getShape(String clazz) {
		
		Shape shapeSubClass = null;
		
		try {
			shapeSubClass = (Shape)Class.forName(clazz).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return shapeSubClass;
	}

	@Override
	public Color getColor(ColorType colorType) {
		// TODO Auto-generated method stub
		return null;
	}

}
