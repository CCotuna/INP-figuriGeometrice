package stiva;

public class Cerc extends FiguraGeometrica {

	private double raza; 
	
	public Cerc(double x, double y, double raza) {
		super(x, y);
		this.raza = raza;
	}
	public double getRaza() {
		return raza;
	}

	public boolean equals(Cerc c) {
		if(getX() == c.getX() && getY() == c.getY() && raza == c.getRaza())
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Cerc [raza=" + raza + " , coordonate (x:" + getX()+",y:"+ getY() + "]";
	}
	
	
}
