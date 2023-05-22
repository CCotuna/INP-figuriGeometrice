package stiva;

import java.util.Iterator;
import java.util.LinkedList;

import stiva.exceptii.DimensiuneDepasitaException;
import stiva.exceptii.ElementDuplicatException;
import stiva.exceptii.ElementInexistentException;
import stiva.exceptii.StivaGoalaException;
import stiva.exceptii.StivaNegativaException;

public class Stiva {

	private int dimensiune;
	private LinkedList<FiguraGeometrica> figuri;
	
	public Stiva(int dimensiune) throws StivaNegativaException{
		if(dimensiune <= 0) {
			throw new StivaNegativaException(dimensiune);
		}
		this.dimensiune = dimensiune;
		figuri = new LinkedList<FiguraGeometrica>();
	}
	
	public boolean adaugaFigura(FiguraGeometrica fig) throws ElementDuplicatException, DimensiuneDepasitaException{
		if(figuri.size() >= dimensiune) {
			throw new DimensiuneDepasitaException();
		}
		for(FiguraGeometrica f : figuri) {
			if(f.equals(fig)) {
				throw new ElementDuplicatException(fig);
			}
		}
		
		figuri.addLast(fig);
		return true;
	}
	
	public boolean stergeUltimulElement() throws StivaGoalaException{
		if(figuri.size() == 0) {
			throw new StivaGoalaException();
		}
		int sizeB = figuri.size();
		figuri.removeLast();
		int sizeA = figuri.size();
		
		boolean sters = sizeA < sizeB;
		return sters;
		
	}

	public void afisareContinut() {
		Iterator<FiguraGeometrica> iterator = figuri.descendingIterator();
		while(iterator.hasNext()) {
			FiguraGeometrica element = iterator.next();
			System.out.println(element);
		}
	}
	
	
}
//Stiva 
//Stiva.exceptii - poate sa para un subpachet al stivei - in java si n majoritatea limbajelor - ele sunt tratate ca si cand ar fi PACHETE diferite - difera doar numele