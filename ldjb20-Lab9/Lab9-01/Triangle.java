public class Triangle extends Shape{

	private double[] sides = new double[3];
	
	public Triangle(double[] paramSides) {
		sides = paramSides;
	}
	
	public double getPerimeter() {
		return super.getPerimeter(sides);
	}
	
	public String toString() {
		return super.toString(sides);
	}

}