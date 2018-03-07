package Car;

public class Omanikud {
	
	private String eesnimi;
	private String perenimi;
	private Isikukood isikukood;
	private int juhiloapäev;
	
	
	public Omanikud(String eesnimi, String perenimi, Isikukood isikukood, int juhiloapäev) {
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.isikukood = isikukood;
		this.juhiloapäev = juhiloapäev;
	}


	public String getEesnimi() {
		return eesnimi;
	}


	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}


	public String getPerenimi() {
		return perenimi;
	}


	public void setPerenimi(String perenimi) {
		this.perenimi = perenimi;
	}


	public Isikukood getIsikukood() {
		return isikukood;
	}


	public void setIsikukood(Isikukood isikukood) {
		this.isikukood = isikukood;
	}


	public int getJuhiloapäev() {
		return juhiloapäev;
	}


	public void setJuhiloapäev(int juhiloapäev) {
		this.juhiloapäev = juhiloapäev;
	}

}	