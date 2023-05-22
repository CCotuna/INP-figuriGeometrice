package stiva.exceptii;

public class DimensiuneDepasitaException extends Exception{
	
	public DimensiuneDepasitaException() {
		super("Dimensiune depasita! Nu mai poti adauga alte elemente in stiva!");
	}
}
