package esercizio2;

public class SIM {

	public String simNumber;
	public double credit;
	public String[] callsLog = new String[5];
	public int lastLog;
	
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

		
		//callsLog[1]=number + " " + duration;
		for (int i = 0; i < 5; i++) {
			if (callsLog[lastLog] == null) {
				callsLog[lastLog]=number + " " + duration;
				break;
			} else {
				callsLog[4]=callsLog[3];
				callsLog[3]=callsLog[2];
				callsLog[2]=callsLog[1];
				callsLog[1]=callsLog[0];
				callsLog[0]=number + " " + duration;	
				break;
							}
		}

	}

}
