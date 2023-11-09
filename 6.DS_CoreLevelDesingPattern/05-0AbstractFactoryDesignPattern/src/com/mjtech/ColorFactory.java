package com.mjtech;

import com.mj.color.Blue;
import com.mj.color.Color;
import com.mj.color.Green;
import com.mj.color.Red;
import com.mj.shape.Shape;

public class ColorFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}
}