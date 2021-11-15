package org.generation.italy;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String nome = "Pinco-";
		String cognome ="Pallo-";
		String colore ="magenta-";
		int mese = 5;
		int anno = 1994;
		int giorno = 12;
		int data = mese + anno + giorno;
		String password = nome + cognome + colore + data;
		
		System.out.println(password);
	}

}
