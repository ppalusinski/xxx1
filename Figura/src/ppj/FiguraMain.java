package ppj;

public class FiguraMain {
	public static void main(String[] args) {
		Figura figura = new Figura("Anna"); System.out.println(figura.toString());
		
		
		Osoba przemek = new Osoba();
		przemek.setWiek(37);
		przemek.podajWiek();
		Osoba lukasz = new Osoba();
		lukasz.setWiek(29);
		lukasz.podajWiek();
		przemek.podajWiek();
		Osoba.podajWiekKlasy();
		}

}
