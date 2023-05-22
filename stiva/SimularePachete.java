package stiva;

import stiva.exceptii.DimensiuneDepasitaException;
import stiva.exceptii.ElementDuplicatException;
import stiva.exceptii.StivaGoalaException;
import stiva.exceptii.StivaNegativaException;

public class SimularePachete {

	public static void main(String[] args) throws StivaNegativaException, ElementDuplicatException, DimensiuneDepasitaException, StivaGoalaException {
		
		Stiva stiva = new Stiva(3);
		
		Cerc cerc1 = new Cerc(10, 40, 30);
		Patrat patrat1 = new Patrat(10, 20, 30, 40, 50);
		Cerc cerc2 = new Cerc(10, 90, 30);
		Cerc cerc3 = new Cerc(40, 32, 18);
		
		stiva.adaugaFigura(cerc1);
		stiva.adaugaFigura(patrat1);
		
//		stiva.afisareContinut();
		
		stiva.adaugaFigura(cerc2);
		stiva.afisareContinut();
		System.out.println();
		
//		stiva.adaugaFigura(cerc3);
		stiva.stergeUltimulElement();
		stiva.afisareContinut();
		
	}

}
