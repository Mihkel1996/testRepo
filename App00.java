package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App00 {

	public static void main(String[] args) {
		Auto car1 = new Auto(Automark.BMW, "M4", "555 BMW", LocalDate.parse("2017-02-10"));
		car1.addOmanikud(new Omanik("Mart", "Juur", "36548374657", LocalDate.parse("2014-12-22")));
		//car1.addOmanikud(new Omanik("Mart", "Juur", new Isikukood("25555555555",Riigikood.ET) LocalDate.parse("2016-10-29")));
		System.out.println(car1);

	}

}