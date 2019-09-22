package domaci08162019;

public class Tacka {
	private double x;
	private double y;

	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String ispisTacke() {
		String ispis = "";
		ispis += x + "," + y;
		return ispis;
	}
}
