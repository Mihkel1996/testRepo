package Car;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

    private Mark mark;
    private Model model;
    private String registerNumber;
    private LocalDate registeringDate;
    private List<Owner> owners;

    public Car() {
    }

    public Car(Mark mark, Model model, String registerNumber, LocalDate registeringDate) {
        this.mark = mark;
        this.model = model;
        this.registerNumber = registerNumber;
        this.registeringDate = registeringDate;
        this.owners = new ArrayList<>();
    }

    public Mark getMark() {
        return mark;
    }

    public Model getModel() {
        return model;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public LocalDate getRegisteringDate() {
        return registeringDate;
    }

    public List<Owner> getOwners() {
        return owners;
    }

    @Override
    public String toString() {
        return "model.Car{" +
                "mark=" + mark +
                ", model=" + model +
                ", registerNumber='" + registerNumber + '\'' +
                ", registeringDate=" + registeringDate +
                ", owners=" + owners +
                '}';
    }

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public Owner getCurrentOwner(){
        return this.getOwners().get(this.getOwners().size()-1);
    }

    public static List<Car> sortByCurrentOwnerActive(List<Car> cars){
        List<Car> sortedCars = new ArrayList<>();

        cars.forEach(car -> {
            System.out.println(car.getCurrentOwner().getLicenceStatus());
            if (car.getCurrentOwner().getLicenceStatus().equals(Owner.Status.ACTIVE)){
                sortedCars.add(car);
            }
        });

        return sortedCars;
    }

    public static List<Car> sortByMark(List<Car> cars, Mark...marks){
        List<Car> sortedCars = new ArrayList<>();

        cars.forEach((car) -> {
            if (Arrays.asList(marks).contains(car.mark)){
                sortedCars.add(car);
            }
        });

        return sortedCars;
    }

    public enum Mark {
        FORD, AUDI, LEXUS, TOYOTA, BMW, MAZDA, FIAT, NISSAN, KIA
    }
}
