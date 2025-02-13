package src;

public class Car {
    //Attributes of the Car class
    private String make;
    private String model;
    private int year;

    //Constructor
    public Car(String carMake, String carModel, int carYear) {
        this.make = carMake;
        this.model = carModel;
        this.year = carYear;
    }
    public Car() {

    }
    public static void main(String[] args) {
        Car car = new Car();
        Car carEthan = new Car("Hyundai", "VeraCruz", 2012);
        carEthan.toString();

    }
    //public String toString(){
       //return toString() + "new stuff";
    //}
}
