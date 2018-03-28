package Car;
import Car.Car;
import Car.IdentificationNumber;
import Car.Model;
import Car.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App111 {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car m3 = new Car(Car.Mark.BMW, new Model("M3", "2000 - 2007", Model.Type.COUPE),
                "224-FFJ", LocalDate.of(1999, 2, 19));
        m3.addOwner(new Owner("Mihkel Johannes", "Paimla", new IdentificationNumber(39612274167L, IdentificationNumber.CountryIndex.ESTONIA),
                LocalDate.of(1998, 10, 6), LocalDate.of(2019, 7, 9)));

        cars.add(m3);

        m3.getCurrentOwner().surrenderLicence();
        
        m3.addOwner(new Owner("Andreas", "Saar", new IdentificationNumber(39608174588L, IdentificationNumber.CountryIndex.FINLAND),
                LocalDate.of(2017, 10, 27), LocalDate.of(2022, 10, 27)));

        m3.getCurrentOwner().surrenderLicence();

        Car a7 = new Car(Car.Mark.AUDI, new Model("A7", "2011 - 2017", Model.Type.SEDAN),
                "6H7DD", LocalDate.of(2012, 4, 9));
        a7.addOwner(new Owner("Jaan", "Paat", new IdentificationNumber(36711118009L, IdentificationNumber.CountryIndex.LATVIA),
                LocalDate.of(1970, 10, 7), LocalDate.of(2018, 5, 9)));

        cars.add(a7);
        
        
        Car n2 = new Car(Car.Mark.FORD, new Model("N2", "2011 - 2019", Model.Type.COUPE),
        		"6G7SS", LocalDate.of(2017, 11, 12));
        n2.addOwner(new Owner("Jaanus", "Kaal", new IdentificationNumber(3999928389L, IdentificationNumber.CountryIndex.RUSSIA),
        		LocalDate.of(1980, 10, 27), LocalDate.of(2018, 06, 12)));
        
        cars.add(n2);
        
        Car p2 = new Car(Car.Mark.LEXUS, new Model("P2", "2014 - 2024", Model.Type.UNIVERSAL),
        		"6G7SS", LocalDate.of(2019, 10, 16));
        p2.addOwner(new Owner("Mart", "Oja", new IdentificationNumber(3569728389L, IdentificationNumber.CountryIndex.LATVIA),
        		LocalDate.of(1998, 8, 23), LocalDate.of(2017, 9, 12)));
        cars.add(p2);
        System.out.println(Car.sortByCurrentOwnerActive(cars));


    }
}
