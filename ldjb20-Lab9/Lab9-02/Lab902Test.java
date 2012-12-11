//   getNumOfSides() only needs to be defined in
// the Triangle and Rectangle classes, since the
// Square class is a subclass of Rectangle.

import java.util.ArrayList;

public class Lab902Test {

	public static void main(String[] args) {
		ArrayList<Shape> arrayShapes = new ArrayList<Shape>();
		arrayShapes.add(new Triangle(0.8, 4.1, 4.4));
		arrayShapes.add(new Square(2.5));
		arrayShapes.add(new Rectangle(5.3, 0.6));
		for (Shape shape : arrayShapes) {
			System.out.println(shape);
		}
	}

}