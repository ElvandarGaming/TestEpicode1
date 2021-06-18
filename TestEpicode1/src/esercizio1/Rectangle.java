package esercizio1;

public class Rectangle {
	public double height;
	public double length;

	public Rectangle(double height, double length) {
		this.height = height;
		this.length = length;
	}

	public double perimeter() {
		double perimeter = 0;
		perimeter = (height + length) * 2;
		return perimeter;
	}

	public double area() {
		double area = 0;
		area = height * length;
		return area;
	}

}
