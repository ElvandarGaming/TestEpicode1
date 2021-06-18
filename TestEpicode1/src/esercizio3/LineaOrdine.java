package esercizio3;

public class LineaOrdine {
	public int qta;
	public Articolo articolo;
	
	public LineaOrdine(Articolo articolo) {
		this.articolo = articolo;
		this.qta=1;
	}
	
	public double lineOrderValue() {
		return  qta* articolo.price;
	}
	
	
}