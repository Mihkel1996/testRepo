package Car;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Auto {

	private Automark mark;
	private String mudel;
	private String numbrimärk;
	private LocalDate arvelevotuKp;
	private List<Omanik> omanikud;
		


	public LocalDate getKuupäev() {
		return arvelevotuKp;
	}

	public Auto(Automark mark, String mudel, String numbrimärk, LocalDate kuupäev) {
		this.mark = mark;
		this.mudel = mudel;
		this.numbrimärk = numbrimärk;
		this.arvelevotuKp = kuupäev;
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
	
	public void addOmanikud(Omanik omanik) {
		this.omanikud.add(omanik);
	}

	@Override
	public String toString() {
		return "Auto [mark=" + mark + ", mudel=" + mudel + ", numbrimärk=" + numbrimärk + ", kuupäev=" + arvelevotuKp
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

	public void setKuupäev(LocalDate kuupäev) {
		this.arvelevotuKp = kuupäev;
	}
	

}

