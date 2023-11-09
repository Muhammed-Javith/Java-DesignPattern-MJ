package com.mjtech;

import com.mj.color.Color;
import com.mj.shape.Circle;
import com.mj.shape.Rectangle;
import com.mj.shape.Shape;
import com.mj.shape.Square;

public class ShapeFactory extends AbstractFactory {
	// use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
