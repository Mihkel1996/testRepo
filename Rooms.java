package Cars;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auto {

		private String mark;
		private String mudel;
		private String numbrimärk;
		private Date kuupäev;
		private List<String> omanikud;

public Auto(String automark, String mudel, String numbrimärk, Date kuupäev, List<String> omanikud) {
	this.mark = automark;
	this.mudel = mudel;
	this.numbrimärk = numbrimärk;
	this.setKuupäev(kuupäev);
	this.omanikud = new ArrayList<>();
}

/**
 * @return the automark
 */
public String getAutomark() {
	return mark;
}

/**
 * @param automark the automark to set
 */
public void setAutomark(String automark) {
	this.mark = automark;
}

/**
 * @return the mudel
 */
public String getMudel() {
	return mudel;
}

/**
 * @param mudel the mudel to set
 */
public void setMudel(String mudel) {
	this.mudel = mudel;
}

/**
 * @return the numbrimärk
 */
public String getNumbrimärk() {
	return numbrimärk;
}

/**
 * @param numbrimärk the numbrimärk to set
 */
public void setNumbrimärk(String numbrimärk) {
	this.numbrimärk = numbrimärk;
}

public void addOmanikud(String omanik) {
	this.omanikud.add(omanik);
}

public Date getKuupäev() {
	return kuupäev;
}

public void setKuupäev(Date kuupäev) {
	this.kuupäev = kuupäev;
}


}


