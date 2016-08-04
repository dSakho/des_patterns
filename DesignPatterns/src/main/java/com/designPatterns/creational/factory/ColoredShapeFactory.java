package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Color;
import com.desginPatterns.core.shapes.ColoredShape;
import com.desginPatterns.core.shapes.Shape;
import com.designPatterns.creational.factory.ColorFactory.ColorType;

public class ColoredShapeFactory {
	
	public static ColoredShape getColoredShape(ColorType colorType, String shapeClazzName) {
		
		Color color = ColorFactory.getColor(colorType);
		Shape shape = ShapeFactory.getShape(shapeClazzName);
		
		return new ColoredShape(color, shape);
	}

}
