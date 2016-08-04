package com.designPatterns.creational.factory;

import com.desginPatterns.core.shapes.Blue;
import com.desginPatterns.core.shapes.Color;
import com.desginPatterns.core.shapes.Green;
import com.desginPatterns.core.shapes.Red;

public class ColorFactory {

	public enum ColorType{RED, BLUE, GREEN};
	
	public static Color getColor(ColorType colorType) {
		Color color = null;
		
		switch (colorType) {
			case RED:
				color = new Red();
				break;
			case BLUE:
				color = new Blue();
				break;
			case GREEN:
				color = new Green();
				break;
			default:
				color = null;
				break;
		}
		
		return color;
	}

}
