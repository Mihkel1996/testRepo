package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autolist {

	public static void main(String[] args) {
		List<String> omanikud = new ArrayList<>(Arrays.asList("Juri", "Raivo"));
		Car a7 = new Car(Car.Mark.AUDI, new Model("A7", "2011 - 2017", Model.Type.SEDAN),
                "6H7DD", LocalDate.of(2012, 4, 9));
		System.out.println(a7);
		
	}

}
