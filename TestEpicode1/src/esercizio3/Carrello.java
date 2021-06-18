package esercizio3;

public class Carrello {
	public Cliente associatedCustomer;

	public LineaOrdine[] articleList = new LineaOrdine[100];
	public int conteggioArticoli;
	public double total;

	public boolean addArticle(Articolo art) {
		/*
		 * for (int i = 0; i < 100; i++) { if (articleList[i] == null) { articleList[i]
		 * = art; break; }
		 * 
		 * }
		 */
		for(int i = 0; i<conteggioArticoli; i++) {
			if (articleList[i].articolo.equals(art)) {
				articleList[i].qta++;
				return true;
			}
		}
		if(conteggioArticoli<articleList.length) {
			articleList[conteggioArticoli] = new LineaOrdine(art);
			conteggioArticoli++;
			return true;
		}
		return false;
				//articleList[i] = new LineaOrdine(art);
				//return true;
			
		/*if (conteggioArticoli < articleList.length) {
			conteggioArticoli++;
			for (int i = 0; i < conteggioArticoli; i++) {
				if (articleList[i].artCod.equals(art.artCod)) {

				} else {
					articleList[i] = art;

				}
			}

			articleList[conteggioArticoli - 1] = art;
			return true;
		} else {
			return false;
		}
*/
	}
	

	public boolean isPresent(Articolo art) {

		for (int i = 0; i < conteggioArticoli; i++) {
			if (articleList[i].articolo.equals(art)) {
				return true;
			}
			
		}
		return false;
	}

	public void printCartArticleList() {
		for (int i = 0; i < conteggioArticoli; i++) {
			if (articleList[i] != null) {
				System.out.println("Codice articolo " + articleList[i].articolo.artCod + " " + articleList[i].articolo.description
						+ "		€" + articleList[i].articolo.price + "	Nr pezzi " + articleList[i].qta + " totale riga " + articleList[i].lineOrderValue());
			}
		}
	}

	public double updateTotal() {

		this.total = 0;
		int i = 0;
		while (i < conteggioArticoli) {
			if (articleList[i] != null) {
				total = total + articleList[i].lineOrderValue() ;
				i++;
			} else {
				i++;
			}

		}
		return total;
	}

}
