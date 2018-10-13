package ppj.ppj;

public class figura {
	protected String nazwa; public Figura(String nazwa) {
	    this.nazwa = nazwa;
	  }
	String getNazwa() { return nazwa; //nic nie lumim
	}
	@Override
	  public String toString() {
	    // super.toString();
	    return "Figura '" + nazwa + "'";
	  }
	

}
