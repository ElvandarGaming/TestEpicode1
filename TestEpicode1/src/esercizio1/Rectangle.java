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

	public void printRectangle(Rectangle rectangle) {
		String areaPerimeter = "L'area del primo rettangolo � " + rectangle.area() + " e il perimetro � "
				+ rectangle.perimeter();
		System.out.println(areaPerimeter);

	}

	public void printRectangles(Rectangle firstRectangle, Rectangle secondRectangle) {
		String areaPerimeter1 = "L'area del primo rettangolo � " + firstRectangle.area() + " e il perimetro � "
				+ firstRectangle.perimeter();
		System.out.println(areaPerimeter1);
		String areaPerimeter2 = "L'area del secondo rettangolo � " + secondRectangle.area() + " e il perimetro � "
				+ secondRectangle.perimeter();
		System.out.println(areaPerimeter2);

		System.out.println("L'area totale dei rettangoli � " + (firstRectangle.area() + secondRectangle.area())
				+ " mentre la somma dei perimetri � " + (firstRectangle.perimeter() + secondRectangle.perimeter()));

	}

}
