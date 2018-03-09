package Car;

import java.time.LocalDate;

public class Omanik {
	
	private String eesnimi;
	private String perenimi;
	private String isikukood;
	private LocalDate juhiloaKp;

	
	
	public Omanik(String eesnimi, String perenimi, String isikukood, LocalDate juhiloaKp) {
		this.eesnimi = eesnimi;
		this.perenimi = perenimi;
		this.isikukood = isikukood;
		this.juhiloaKp = juhiloaKp;
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


	public String getIsikukood() {
		return isikukood;
	}


	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}


	public LocalDate getJuhiloapaev() {
		return juhiloaKp;
	}


	public void setJuhiloapaev(LocalDate juhiloapaev) {
		this.juhiloaKp = juhiloapaev;
	}


	@Override
	public String toString() {
		return "Omanikud [eesnimi=" + eesnimi + ", perenimi=" + perenimi + ", isikukood=" + isikukood + ", juhiloapäev="
				+ juhiloaKp + "]";
	}

}