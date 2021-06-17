package esercizio2;

public class Log {
	public String number;
	public String duration;
	public String log;

	public Log() {
		this.number = "0";
		this.duration = "0";
		this.log = "0" + " " + "0";
	}

	public Log(String number, String duration) {
		this.number = number;
		this.duration = duration;
		this.log = number + " " + duration;
	}
	
	public Log addCall(String number, String duration) {
		log= number + " " + duration;
	}

}
