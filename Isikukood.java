package Car;

public class Isikukood {
	
	private String Riigikood;
	private int Kood;
	public Isikukood(String isikukood, Riigikood riigikood) {

}
	public Isikukood(String riigikood, int kood) {
		super();
		this.Riigikood = riigikood;
		this.Kood = kood;
	}
	@Override
	public String toString() {
		return "Isikukood [Riigikood=" + Riigikood + ", Kood=" + Kood + "]";
	}

}