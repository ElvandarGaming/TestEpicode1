package esercizio2;

public class SIM {

	public final String simNumber;
	public double credit;
	public String[] callsLog = new String[5];

	public SIM(String simNumber) {
		this.simNumber = simNumber;
	}

	public void printSim() {
		System.out.println("Il numero della sim è " + simNumber);
		System.out.println("Il credito residuo della sim è " + credit);
		for (int i = 0; i < 5; i++) {
			if (callsLog[i] != null) {
				System.out.println(callsLog[i]);
			} else {
				System.out.println("nessun record");
			}
		}
	}

	public void registerCall(String number, String duration) {
		for (int i = callsLog.length-1; i > 0; i--) {
			callsLog[i] = callsLog[i - 1];
		}
		callsLog[0] = number + " " + duration;

	}

}
