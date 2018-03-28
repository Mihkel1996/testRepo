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
		Car a8 = new Car(Car.Mark.BMW, new Model("A8", "2011 - 2017", Model.Type.SEDAN),
				"6H7DD", LocalDate.of(2012, 4, 9));
		Car a9 = new Car(Car.Mark.FORD, new Model("A7", "2011 - 2017", Model.Type.SEDAN),
				"6H7DD", LocalDate.of(2012, 4, 9));
		
		List<Car> autod = new ArrayList<>();
		autod.add(a7);
		autod.add(a8);
		autod.add(a9);
		
		List<Car> audid = new ArrayList<>();
		for (Car auto : autod) {
			if (auto.getMark() == Car.Mark.AUDI) {
				audid.add(auto);
			}
		}
		
		
		
		System.out.println(autod);
		System.out.println(audid);
		
	}

}
