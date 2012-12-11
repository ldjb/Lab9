public class Rectangle extends Shape{

	private double[] sides = new double[4];
	private int numOfSides = 4;
	
	public Rectangle(double var0, double var1) {
		sides[0] = var0;
		sides[1] = var1;
		sides[2] = var0;
		sides[3] = var1;
	}
	
	public double getPerimeter() {
		return super.getPerimeter(sides);
	}
	
	public String toString() {
		return super.toString(sides);
	}
	
	public double getArea() {
		return sides[0] * sides[1];
	}
	
	public int getNumOfSides() {
		return numOfSides;
	}

}