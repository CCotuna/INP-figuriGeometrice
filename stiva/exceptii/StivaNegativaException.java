package stiva.exceptii;

public class StivaNegativaException extends Exception {

	private int dimensiune;
	
	public StivaNegativaException(int dimensiune) {
		super("Stiva nu poate avea dimensiune negativa: " + dimensiune + " este valoare negativa");
		this.dimensiune = dimensiune;
		
	}
}
