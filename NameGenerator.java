package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Andreas", "Kati", "Mati", "Jaanus", "Peeter", "Mari", "Marko", "Rootsi", };
	private String[] lastNames = {"Kaigas", "Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts", "Makaron", "Piim", "Munapeer", "Kapsas", };
	private String[] randomNames = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "�", "z", "�", "t", "u", "v", "w", "�", "�", "�", "�", "x", "y",};
	Random random = new Random();
	
	/*TODO Kui �lesanded on valmis, siis teha need �mbes selliselt, 
	et oleks v�imalik valida mehe ja naiste nimedele vahel. */
	
	public String getRandomFirstName() {
		return firstNames[random.nextInt(firstNames.length)];
	}
	
	public String getRandomLastName() {
		//TODO
		return lastNames[random.nextInt(lastNames.length)];
	}
	
	public String getRandomFullName() {
		//TODO
		return getRandomFirstName() + " " + getRandomLastName();
	}
	
	// Juhuslikest t�htedest
	public String generateRandomName(int charNumber) {
		//TODO
		return "";
	}
	
	public Integer generateRandomNumberBetween(int beg, int end) {
		//TODO
		return 0;
	}
	
	public boolean flipPenny() {
		//TODO
		return true;
	}
}
