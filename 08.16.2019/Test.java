package domaci08162019;

import java.util.concurrent.ThreadLocalRandom;

public class Test {

	public static void main(String[] args) {

		Tacka[] niz_tacaka = new Tacka[10];
		for (int i = 0; i < niz_tacaka.length; i++) {
			double m = ThreadLocalRandom.current().nextDouble(1, 10);
			double n = ThreadLocalRandom.current().nextDouble(1, 10);
			niz_tacaka[i] = new Tacka(m, n);
		}

		Trougao t1 = new Trougao(5.0, 6.0, 9.0);
		t1.setT(niz_tacaka[1]);

		Trougao t2 = new Trougao(3.0, 3.0, 5.5);
		t2.setT(niz_tacaka[7]);

		Trougao t3 = new Trougao(4.2, 5.1, 10.7);
		t3.setT(niz_tacaka[3]);

		System.out.println("Ispis trougla t1: ");
		System.out.println(t1.ispis());

		System.out.println("---------------------");

		System.out.println("Ispis trougla t2: ");
		System.out.println(t2.ispis());

		System.out.println("\n---------------------");

		System.out.print("Trougao t2 ");
		t2.getJednakokraki();
		System.out.print("Trougao t3 ");
		t3.getJednakokraki();

		Trougao tr4 = new Trougao(3.2, 3.5, 7.);
		tr4.setT(niz_tacaka[3]);

		System.out.print("Trouglovi tr4 i tr1 ");
		tr4.poredjenje(t1.getT());

	}

}
