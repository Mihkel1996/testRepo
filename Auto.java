import java.util.List;
import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;

public class Auto {

	private String mark;
	private String mudel;
	private String numbrimärk;
	private Date kuupäev;
	public List<String> omanikud;
	public static void main(String[] args) {
		

	}

	public Auto(String mark, String mudel, String numbrimärk, Date kuupäev, List<String> omanikud) {
		this.mark = mark;
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

	@Override
	public String toString() {
		return "Auto [mark=" + mark + ", mudel=" + mudel + ", numbrimärk=" + numbrimärk + ", omanikud="
				+ omanikud + "]";
	}

	public Date getKuupäev() {
		return kuupäev;
	}

	public void setKuupäev(Date kuupäev) {
		this.kuupäev = kuupäev;
	}
	

}

