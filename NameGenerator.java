package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Andreas", "Kati", "Mati", "Jaanus", "Peeter", "Mari", "Marko", "Rootsi", };
	private String[] lastNames = {"Kaigas", "Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts", "Makaron", "Piim", "Munapeer", "Kapsas", };
	private String[] randomNames = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "ð", "z", "þ", "t", "u", "v", "w", "õ", "ä", "ö", "ü", "x", "y",};
	Random random = new Random();
	
	/*TODO Kui ülesanded on valmis, siis teha need ümbes selliselt, 
	et oleks võimalik valida mehe ja naiste nimedele vahel. */
	
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
	
	// Juhuslikest tähtedest
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
