package Car;
import model.Car;
import model.IdentificationNumber;
import model.Model;
import model.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App11 {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car m3 = new Car(Car.Mark.BMW, new Model("M3", "2000 - 2007", Model.Type.COUPE),
                "224-FFJ", LocalDate.of(1999, 2, 19));
        m3.addOwner(new Owner("Mihkel Johannes", "Paimla", new IdentificationNumber(39612274167L, IdentificationNumber.CountryIndex.ESTONIA),
                LocalDate.of(1998, 10, 6), LocalDate.of(2019,7,9)));

        cars.add(m3);

        m3.getCurrentOwner().surrenderLicence();

        m3.addOwner(new Owner("Andreas", "Saar", new IdentificationNumber(39608174588L, IdentificationNumber.CountryIndex.FINLAND),
                LocalDate.of(2017, 10, 27), LocalDate.of(2022, 10, 27)));

        m3.getCurrentOwner().surrenderLicence();

        Car a7 = new Car(Car.Mark.AUDI, new Model("A7", "2011 - 2017", Model.Type.SEDAN),
                "6H7DD", LocalDate.of(2012, 4, 9));
        a7.addOwner(new Owner("Jaan", "Uss", new IdentificationNumber(36711118009L, IdentificationNumber.CountryIndex.LATVIA),
                LocalDate.of(1970,10, 7), LocalDate.of(2018, 5, 9)));

        cars.add(a7);
        System.out.println(Car.sortByCurrentOwnerActive(cars));


    }
}
