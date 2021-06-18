package esercizio2;

public class SIM {

	public final String simNumber;
	public double credit;
	public static final int NUMERO_ULTIME_CHIAMATE = 5;
	public Chiamate[] callsLog = new Chiamate[NUMERO_ULTIME_CHIAMATE];

	public SIM(String simNumber) {
		this.simNumber = simNumber;
	}

	public void printSim() {
		System.out.println("Il numero della sim è " + simNumber);
		System.out.println("Il credito residuo della sim è " + credit);
		for (int i = 0; i < callsLog.length; i++) {
			if (callsLog[i] != null) {
				System.out.println(callsLog[i].number + " "+ callsLog[i].duration);
			} else {
				System.out.println("nessun record");
			}
		}
	}

	public void registerCall(Chiamate ultima) {
		for (int i = callsLog.length - 1; i > 0; i--) {
			callsLog[i] = callsLog[i - 1];
		}
		callsLog[0] = ultima;

	}

}
