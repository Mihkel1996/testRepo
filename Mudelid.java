package Car;

import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Mudelid {

	private String nimetus;
	private LocalDate alguskuupäev;
	private LocalDate lőpukuupäev;
	private String mudeliliik;
	public Mudelid(String nimetus, LocalDate alguskuupäev, LocalDate lőpukuupäev, String mudeliliik) {
		super();
		this.nimetus = nimetus;
		this.alguskuupäev = alguskuupäev;
		this.lőpukuupäev = lőpukuupäev;
		this.mudeliliik = mudeliliik;

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
	public String getMudeliliik() {
		return mudeliliik;
	}
	public void setMudeliliik(String mudeliliik) {
		this.mudeliliik = mudeliliik;
	}

	
	}

