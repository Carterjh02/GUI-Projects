package Pck1;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleClass {

	public static Circle createCircle(int x, int y, int radius, int r, int g, int b) {
		Circle circle = new Circle(x, y, radius);
		circle.setStroke(Color.rgb(0,  0,  0));
		circle.setFill(Color.rgb(r,  g, b));
		return circle;
	}
}
