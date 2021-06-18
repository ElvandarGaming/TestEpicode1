package esercizio1;

public class Start {

	public static void main(String[] args) {

		Rectangle first = new Rectangle(5, 7);
		Rectangle second = new Rectangle(2.5, 3.5);

		System.out.println(first.perimeter());
		System.out.println(first.area());

		printRectangle(first);

		System.out.println();

		printRectangles(first, second);
	}

	public static void printRectangle(Rectangle rectangle) {
		String areaPerimeter = "L'area del primo rettangolo è " + rectangle.area() + " e il perimetro è "
				+ rectangle.perimeter();
		System.out.println(areaPerimeter);

	}

	public static void printRectangles(Rectangle firstRectangle, Rectangle secondRectangle) {
		String areaPerimeter1 = "L'area del primo rettangolo è " + firstRectangle.area() + " e il perimetro è "
				+ firstRectangle.perimeter();
		System.out.println(areaPerimeter1);
		String areaPerimeter2 = "L'area del secondo rettangolo è " + secondRectangle.area() + " e il perimetro è "
				+ secondRectangle.perimeter();
		System.out.println(areaPerimeter2);

		System.out.println("L'area totale dei rettangoli è " + (firstRectangle.area() + secondRectangle.area())
				+ " mentre la somma dei perimetri è " + (firstRectangle.perimeter() + secondRectangle.perimeter()));

	}
}
