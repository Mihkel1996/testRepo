package Car;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Auto {

	private Automark mark;
	private String mudel;
	private String numbrim�rk;
	private LocalDate arvelevotuKp;
	private List<Omanik> omanikud;
		


	public LocalDate getKuup�ev() {
		return arvelevotuKp;
	}

	public Auto(Automark mark, String mudel, String numbrim�rk, LocalDate kuup�ev) {
		this.mark = mark;
		this.mudel = mudel;
		this.numbrim�rk = numbrim�rk;
		this.arvelevotuKp = kuup�ev;
		this.omanikud = new ArrayList<>();
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
	
	public void addOmanikud(Omanik omanik) {
		this.omanikud.add(omanik);
	}

	@Override
	public String toString() {
		return "Auto [mark=" + mark + ", mudel=" + mudel + ", numbrim�rk=" + numbrim�rk + ", kuup�ev=" + arvelevotuKp
				+ ", omanikud=" + omanikud + "]";
	}

	public Automark getMark() {
		return mark;
	}

	public void setMark(Automark mark) {
		this.mark = mark;
	}

	public List<Omanik> getOmanikud() {
		return omanikud;
	}

	public void setOmanikud(List<Omanik> omanikud) {
		this.omanikud = omanikud;
	}

	public void setKuup�ev(LocalDate kuup�ev) {
		this.arvelevotuKp = kuup�ev;
	}
	

}

