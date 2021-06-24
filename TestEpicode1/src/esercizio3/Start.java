package esercizio3;

public class Start {

	public static void main(String[] args) {
		Articolo libro1 = new Articolo("8001526", "Core Java, volume I", 55.70, 234);
		Articolo libro5 = new Articolo("8001526", "Core Java, volume 45I", 55.70, 234);
		Articolo libro2 = new Articolo("8001527", "Core Java, volume II", 75.60, 97);
		Articolo libro3 = new Articolo("8001528", "Core Java, volume III", 78.80, 5);
		Articolo libro4 = new Articolo("8001527", "Core Java, volume II", 75.60, 97);;
		Carrello basket = new Carrello();

		basket.updateTotal();
		
		basket.addArticle(libro1);
		basket.addArticle(libro2);
		basket.addArticle(libro3);
		basket.addArticle(libro4);
		basket.addArticle(libro5);

		basket.updateTotal();

		basket.printCartArticleList();

		System.out.println("Il totale del carrello è di 				€" + basket.total);
		
		/*
		Articolo libro1 = new Articolo("8001526", "Core Java, volume I", 55.70, 234);
		Articolo libro2 = new Articolo("8001526", "Core Java, volume I", 55.70, 234);
		System.out.println(libro1==libro2);
		System.out.println(libro1.equals(libro2));
		String s1 = "Pippo";
		String s2 = "Pippo";
		System.out.println(s1 == s2);
		
		
		String x = "ciccio ";
		
		String r = x.trim();
		System.out.println(x.length());
		System.out.println(r.length());
		equals appartiene alla classe object, e tutte le classi in java ereditano le funzioni di object
	*/
	}

}
