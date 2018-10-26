package ppj;

public class Osoba {
	
	private static int wiekKlasy;
	
	private int wiek;
	
//	public Osoba(int wiek) {
//		if(wiek > 0) {
//			this.wiek = wiek;
//		} else {
//			System.out.println("Debilu zle");
//		}
//	}
	
	

	public void setWiek(int wiek) {
		if (wiek > 0) {
			wiekKlasy = wiek;
			this.wiek = wiek;
		} else {
			System.out.println("Debilu zle");
		}
	}

	public void podajWiek() {
		System.out.println("Wiek " + this.wiek + " wiek klasy " + wiekKlasy);
	}
	
	static public void podajWiekKlasy() {
		System.out.println("wiekKlasy " + wiekKlasy);
	}
}
