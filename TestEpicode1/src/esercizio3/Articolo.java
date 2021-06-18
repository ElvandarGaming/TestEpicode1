package esercizio3;

public class Articolo {
	public String artCod;
	public String description;
	public double price;
	public int pz;
	

	public Articolo(String artCod, String description, double price, int pz) {
		this.artCod = artCod;
		this.description = description;
		this.price = price;
		this.pz = pz;
	}
	
	public boolean equals(Object o) {
		Class x = o.getClass();
		if(x != Articolo.class) {
			return false;
		}
		Articolo altro = (Articolo) o;
		
		if(this.artCod.equals(altro.artCod)) {
			return true;
		}
		return false;
	}
}
