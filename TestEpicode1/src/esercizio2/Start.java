package esercizio2;

public class Start {

	public static void main(String[] args) {

		SIM micro = new SIM("349 9303841");

		// System.out.println(micro.credit);

		micro.printSim();

		System.out.println();

		Chiamate a = new Chiamate("370 3796125", "  4 min , 32 secondi");
		Chiamate b = new Chiamate("370 3796125", "  2 min , 26 secondi");
		Chiamate c = new Chiamate("392 9585198", "  17 min , 45 secondi");
		Chiamate d = new Chiamate("0586 210140", "  0 min , 11 secondi");
		
		micro.registerCall(a);
		micro.registerCall(b);
		micro.registerCall(c);
		micro.registerCall(d);

		micro.printSim();

		System.out.println();

		Chiamate e = new Chiamate("370 3796125", "  4 min , 32 secondi");
		Chiamate f = new Chiamate("370 3796125", "  4 min , 32 secondi");
		Chiamate g = new Chiamate("370 3796125", "  4 min , 32 secondi");
		Chiamate h = new Chiamate("370 3796125", "  4 min , 32 secondi");
		
		micro.registerCall(e);
		micro.registerCall(f);
		micro.registerCall(g);
		micro.registerCall(h);

		micro.printSim();
	}

}
