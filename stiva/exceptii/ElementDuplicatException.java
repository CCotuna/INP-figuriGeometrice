package stiva.exceptii;

import stiva.FiguraGeometrica;

public class ElementDuplicatException extends Exception {

	private FiguraGeometrica figuraDuplicata;
	
	public ElementDuplicatException(FiguraGeometrica figuraDuplicata) {
		super("Elementul: " + figuraDuplicata + " este deja stocat!");
		this.figuraDuplicata = figuraDuplicata;
		
	}
}
