package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Shape;

public class ShapeFactory {
	
	public static Shape getShape(String clazz) {
		
		Shape shapeSubClass = null;
		
		try {
			shapeSubClass = (Shape)Class.forName(clazz).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return shapeSubClass;
	}

}
