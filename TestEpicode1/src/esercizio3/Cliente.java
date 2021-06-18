package esercizio3;

import java.time.LocalDate;

public class Cliente {
	public String clientCode;
	public String nameSurname;
	// nome e cognome
	public String eMail;
	public LocalDate bornDate;

	public Cliente(String clientCode, String nameSurname, String eMail, LocalDate bornDate) {
		this.clientCode = clientCode;
		this.nameSurname = nameSurname;
		this.eMail = eMail;
		this.bornDate = bornDate;
	}

}
