import java.util.ArrayList;

public class Lab901Test {

	public static void main(String[] args) {
		ArrayList<Shape> arrayShapes = new ArrayList<Shape>();
		arrayShapes.add(new Triangle(0.8, 4.1, 4.4));
		arrayShapes.add(new Square(2.5));
		arrayShapes.add(new Rectangle(5.3, 0.6));
		for (Shape shape : arrayShapes) {
			System.out.print(shape.getClass());
			System.out.print(" : ");
			System.out.print(shape);
			System.out.print(" : ");
			System.out.println(shape.getArea());
		}
	}

}