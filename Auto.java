import java.util.List;
import java.util.Arrays;
import java.util.Date;
import java.util.ArrayList;

public class Auto {

	private String mark;
	private String mudel;
	private String numbrim�rk;
	private Date kuup�ev;
	public List<String> omanikud;
	public static void main(String[] args) {
		

	}

	public Auto(String mark, String mudel, String numbrim�rk, Date kuup�ev, List<String> omanikud) {
		this.mark = mark;
		this.mudel = mudel;
		this.numbrim�rk = numbrim�rk;
		this.setKuup�ev(kuup�ev);
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
	 * @return the numbrim�rk
	 */
	public String getNumbrim�rk() {
		return numbrim�rk;
	}

	/**
	 * @param numbrim�rk the numbrim�rk to set
	 */
	public void setNumbrim�rk(String numbrim�rk) {
		this.numbrim�rk = numbrim�rk;
	}
	
	public void addOmanikud(String omanik) {
		this.omanikud.add(omanik);
	}

	@Override
	public String toString() {
		return "Auto [mark=" + mark + ", mudel=" + mudel + ", numbrim�rk=" + numbrim�rk + ", omanikud="
				+ omanikud + "]";
	}

	public Date getKuup�ev() {
		return kuup�ev;
	}

	public void setKuup�ev(Date kuup�ev) {
		this.kuup�ev = kuup�ev;
	}
	

}

