package esercizio3;

public class Carrello {
	public String associatedCustomer;
	public Articolo[] articleList = new Articolo[100];
	public double total;

	public void addArticle(Articolo art) {
		for (int i = 0; i < 100; i++) {
			if (articleList[i] == null) {
				articleList[i] = art;
				break;
			}

		}

	}

	public void printCartArticleList() {
		for (int i = 0; i < articleList.length; i++) {
			if (articleList[i] != null) {
				System.out.println("Codice articolo " + articleList[i].artCod + " " + articleList[i].description
						+ "		€" + articleList[i].price);
			}
		}
	}

	public double total() {

		this.total = 0;
		int i = 0;
		while (i < articleList.length) {
			if (articleList[i] != null) {
				total = total + articleList[i].price;
				i++;
			} else {
				i++;
			}

		}
		return total;
	}

}
