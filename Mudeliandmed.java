package Car;

import java.time.LocalDate;

public class Mudeliandmed {

	private String nimetus;
	private LocalDate alguskuupäev;
	private LocalDate lőpukuupäev;
	private Mudeliliik liik;
	public Mudeliandmed(String nimetus, LocalDate alguskuupäev, LocalDate lőpukuupäev, Mudeliliik liik) {
		super();
		this.nimetus = nimetus;
		this.alguskuupäev = alguskuupäev;
		this.lőpukuupäev = lőpukuupäev;
		this.liik = liik;
	}
	public String getNimetus() {
		return nimetus;
	}
	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}
	public LocalDate getAlguskuupäev() {
		return alguskuupäev;
	}
	public void setAlguskuupäev(LocalDate alguskuupäev) {
		this.alguskuupäev = alguskuupäev;
	}
	public LocalDate getLőpukuupäev() {
		return lőpukuupäev;
	}
	public void setLőpukuupäev(LocalDate lőpukuupäev) {
		this.lőpukuupäev = lőpukuupäev;
	}
	public Mudeliliik getLiik() {
		return liik;
	}
	public void setLiik(Mudeliliik liik) {
		this.liik = liik;
	}
	@Override
	public String toString() {
		return "Mudeliandmed [nimetus=" + nimetus + ", alguskuupäev=" + alguskuupäev + ", lőpukuupäev=" + lőpukuupäev
				+ ", liik=" + liik + "]";
	}
	
}