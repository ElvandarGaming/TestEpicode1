package esercizio2;

public class Start {

	public static void main(String[] args) {

		SIM micro = new SIM("349 9303841");

		// System.out.println(micro.credit);

		micro.printSim();

		System.out.println();

		micro.registerCall("370 3796125", "  4 min , 32 secondi");
		micro.registerCall("370 3796125", "  2 min , 26 secondi");
		micro.registerCall("392 9585198", "  17 min , 45 secondi");
		micro.registerCall("0586 210140", "  0 min , 11 secondi");

		micro.printSim();

		System.out.println();

		micro.registerCall("081 7672167", "  8 min , 17 secondi");
		micro.registerCall("392 9585198", "  2 min , 09 secondi");
		micro.registerCall("081 484200", "  45 min , 02 secondi");
		micro.registerCall("081 7672167", "  1 min , 14 secondi");

		micro.printSim();
	}

}
