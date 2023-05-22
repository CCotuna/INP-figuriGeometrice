package stiva;

public class Patrat extends FiguraGeometrica {

	private double arie;
	private double xP, yP;
	
	public Patrat(double x, double y, double xP, double yP, double arie) {
		super(x, y);
		this.arie = arie;
		this.xP = xP;
		this.yP = yP;
	}

	public double getArie() {
		return arie;
	}

	public double getxP() {
		return xP;
	}

	public double getyP() {
		return yP;
	}

	@Override
	public String toString() {
		return "Patrat [arie=" + arie + ", xP=" + xP + ", yP=" + yP + "]";
	}

	
}
