package ppj;

public class Figura {
	protected String nazwa; public Figura(String nazwa) {
	    this.nazwa = nazwa;
	  }
	String getNazwa() { return nazwa; //nic nie lumim2
	}
	@Override
	  public String toString() {
	    // super.toString();
	    return "Figura '" + nazwa + "'";
	  }
	

}
