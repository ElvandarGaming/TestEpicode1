package esercizio1;

public class Start {

	public static void main(String[] args) {

		Rectangle first = new Rectangle(5, 7);
		Rectangle second = new Rectangle(2.5, 3.5);

		System.out.println(first.perimeter());
		System.out.println(first.area());

		first.printRectangle(first);
		
		System.out.println();

		first.printRectangles(first, second);
	}

}
