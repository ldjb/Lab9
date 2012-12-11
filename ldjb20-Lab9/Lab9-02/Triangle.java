public class Triangle extends Shape{

	private double[] sides = new double[3];
	private int numOfSides = 3;
	
	public Triangle(double var0, double var1, double var2) {
		sides[0] = var0;
		sides[1] = var1;
		sides[2] = var2;
	}
	
	public double getPerimeter() {
		return super.getPerimeter(sides);
	}
	
	public String toString() {
		return super.toString(sides);
	}
	
	public double getArea() {
		double s = (sides[0] + sides[1] + sides[2]) * 0.5;
		double T = Math.pow(s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]), 0.5);
		return T;
	}
	
	public int getNumOfSides() {
		return numOfSides;
	}

}