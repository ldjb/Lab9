public class Shape {

	public double getArea() {
		return 0;
	}
	
	public int getNumOfSides() {
		return 0;
	}
	
	public double getPerimeter(double[] sides) {
		double perimeter = 0;
		for (int i = 0; i < sides.length; i++) {
			perimeter += sides[i];
		}
		return perimeter;
	}
	
	public String toString(double[] sides) {
		String result = sides.length + " : {";
		for (int i = 0; i < sides.length - 1; i++) {
			result += Double.toString(sides[i]);
			result += ", ";
		}
		result += Double.toString(sides[sides.length - 1]);
		result += "}";
		return result;
	}

}