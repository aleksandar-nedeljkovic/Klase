package domaci08162019;

public class Trougao {
	private double a;
	private double b;
	private double c;
	private Tacka t;
	private int poredjenje;

	public Trougao(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		t = null;
	}

	public boolean stranice() {
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("Pogresan unos!!");
			return false;
		} else
			return true;
	}

	public Tacka getT() {
		return t;
	}

	public void setT(Tacka t) {
		this.t = t;
	}

	public void getJednakokraki() {
		if (a == b)
			System.out.println("jeste jednokraki!");
		else
			System.out.println("nije jednokraki!");

	}

	// Racunamo povrsinu trougla po heronovom obrascu
	public double getPovrsina() {
		double s;
		double heron;
		// Racunanje poluobima
		s = (a + b + c) / 2;
		heron = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		return heron;
	}

	public double getObim() {
		double o;
		o = a + b + c;
		return o;

	}

	public double setA() {
		if (a + b < c || a + c < b || b + c < a) {
			System.out.println("Broj ne moze biti negativan!");
		}
		return a;
	}

	public double setB() {
		if (a + b < c || a + c < b || b + c < a) {
			System.out.println("Broj ne moze biti negativan!");
		}
		return b;
	}

	public double setC() {
		if (a + b < c || a + c < b || b + c < a) {
			System.out.println("Broj ne moze biti negativan!");
		}
		return c;
	}

	public void poredjenje(Tacka m) {
		if ((t.getX() == m.getX()) && (t.getY() == m.getY()))
			System.out.println("IMAJU zajednicku pocetnu tacku!");
		else
			System.out.println("NEMAJU zajednicku pocetnu tacku!");
	}

	public String ispis() {
		String ispis = "";
		if (stranice()) {
			ispis += "Trougao sa pocetkom u tackama (" + t.getX() + ", " + t.getY() + ")";
			ispis += "\nStranice trougla " + a + " " + b + " " + c;
			ispis += "\nPovrsina P= " + getPovrsina();
			ispis += "\nObim O= " + getObim();
		} else
			System.out.println("Trougao nije kreiran pravilno");

		return ispis;

	}
}
