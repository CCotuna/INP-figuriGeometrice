package stiva.exceptii;

import stiva.FiguraGeometrica;

public class ElementInexistentException extends Exception {

	private FiguraGeometrica figuraDuplicata;

	public ElementInexistentException(FiguraGeometrica figuraDuplicata) {
		super("Elementul: " + figuraDuplicata + " nu se afla in stiva!");
		this.figuraDuplicata = figuraDuplicata;

	}
}
