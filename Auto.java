package Car;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Auto {

	private Automark mark;
	private String mudel;
	private String numbrim�rk;
	private LocalDate kuup�ev;
	private List<String> omanikud;
		


	public LocalDate getKuup�ev() {
		return kuup�ev;
	}

	public Auto(Automark opel, String mudel, String numbrim�rk, LocalDate kuup�ev, List<String> omanikud) {
		this.mark = opel;
		this.mudel = mudel;
		this.numbrim�rk = numbrim�rk;
		this.kuup�ev = kuup�ev;
		this.omanikud = omanikud;
	}

	/**
	 * @return the automark
	 */
	public Automark getAutomark() {
		return mark;
	}

	/**
	 * @param automark the automark to set
	 */
	public void setAutomark(Automark automark) {
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
		return "Auto [mark=" + mark + ", mudel=" + mudel + ", numbrim�rk=" + numbrim�rk + ", kuup�ev=" + kuup�ev
				+ ", omanikud=" + omanikud + "]";
	}

	public Automark getMark() {
		return mark;
	}

	public void setMark(Automark mark) {
		this.mark = mark;
	}

	public List<String> getOmanikud() {
		return omanikud;
	}

	public void setOmanikud(List<String> omanikud) {
		this.omanikud = omanikud;
	}

	public void setKuup�ev(LocalDate kuup�ev) {
		this.kuup�ev = kuup�ev;
	}
	

}

