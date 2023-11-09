package com.mjtech;

import com.mj.color.Color;
import com.mj.shape.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
