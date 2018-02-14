import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App11 {

	public static void main(String[] args) {
		Headphone korvaKlapid1 = new Headphone("Bludio", 50, false);
		System.out.println(korvaKlapid1);
		System.out.println("Kas on kallis: " + korvaKlapid1.isExpensiveString());
		System.out.println("Kas on odav: " + korvaKlapid1.isExpensiveString());
		System.out.println(korvaKlapid1.isExpensive() ? "Kõrvaklapid on kallid" : "Kõrvaklapid on odavad");
		
		Headphone korvaKlapid2 = new Headphone("Samsung");
		korvaKlapid2.setPrice(154.50);
		korvaKlapid2.isWired();
		System.out.println(korvaKlapid2);
		//System.out.println("Kas on kallis: " korvaKlapid2.isWired());
		System.out.println(korvaKlapid2.isExpensive() ? "Kõrvaklapid on kallid" : "Kõrvaklapid on odavad");
		
		List<String> specs = new ArrayList<>(Arrays.asList("mikrofon", "mürasummutaja"));
		Headphone korvaklapid3 = new Headphone("Sony", 180, false, specs);
		korvaklapid3.addSpecification("NFC");
		System.out.println(korvaklapid3);
		
	}
}