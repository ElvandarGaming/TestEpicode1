package esercizio3;

import java.time.LocalDate;

public class Cliente {
	public String clientCode;
	public String name;
	public String surname;
	public String eMail;
	public LocalDate bornDate;

	public Cliente(String clientCode, String name ,String surname, String eMail, LocalDate bornDate) {
		this.clientCode = clientCode;
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.bornDate = bornDate;
	}

}
