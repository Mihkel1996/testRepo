package Car;

public class Omanikud {
	
	private String eesnimi;
	private String perenimi;
	private Isikukood isikukood;
	private int juhiloap�ev;
	
	
	public Omanikud(String eesnimi, String perenimi, Isikukood isikukood, int juhiloap�ev) {
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.isikukood = isikukood;
		this.juhiloap�ev = juhiloap�ev;
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


	public int getJuhiloap�ev() {
		return juhiloap�ev;
	}


	public void setJuhiloap�ev(int juhiloap�ev) {
		this.juhiloap�ev = juhiloap�ev;
	}

}	