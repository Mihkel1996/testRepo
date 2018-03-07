package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App00 {

	public static void main(String[] args) {
		List<String> omanikud = new ArrayList<>(Arrays.asList("Peeter Maasik"));
		Auto car1 = new Auto(Automark.BMW, "M4", "555 BMW", LocalDate.parse("2017-02-10"), omanikud);
		//car1.addOmanikud(new omanik("", "", new Isikukood("36020348343",Riigikoodid.ET), LocalDate.parse("2014-12-22"));
		System.out.println(car1);

	}

}