package esercizio3;

public class Start {

	public static void main(String[] args) {
		Articolo libro = new Articolo("8001526", "Core Java, volume I", 55.70, 234);
		Articolo libro2 = new Articolo("8001527", "Core Java, volume II", 75.60, 97);
		Articolo libro3 = new Articolo("8001528", "Core Java, volume III", 78.80, 5);

		Carrello basket = new Carrello();

		basket.total();

		basket.addArticle(libro);
		basket.addArticle(libro2);
		basket.addArticle(libro);
		basket.addArticle(libro);
		basket.addArticle(libro);
		basket.addArticle(libro3);

		basket.total();

		basket.printCartArticleList();

		basket.total();
		System.out.println("Il totale del carrello è di 				€" + basket.total);
	}

}
