package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Color;
import com.desginPatterns.core.shapes.Shape;
import com.designPatterns.creational.factory.ColorFactory.ColorType;

public abstract class AbstractFactory {

	public abstract Color getColor(ColorType colorType);
	public abstract Shape getShape(String shape) ;
}
