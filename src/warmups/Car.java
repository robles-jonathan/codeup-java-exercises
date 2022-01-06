package warmups;
public class Car {
    //creating instance variable objects
    public String name;
    public String maker;
    public String model;
    public int year;

    //create instance method
    public String startTheCar() {
        return String.format("Starting up %s %s %s %d", name, maker, model, year);
    }

    //the car constructor
    public Car() {
        System.out.println("A car is being made!");
    }

    public static void main(String[] args) {
        //Create an instance of our car class
        Car firstCar = new Car();
        firstCar.name = "Betty";
        firstCar.maker = "Audi";
        firstCar.model = "R8";
        firstCar.year = 2020;
        System.out.println(firstCar.startTheCar());

        Car car2 = new Car(); //object instantiated "new"
        car2.name = "Speedy";
        car2.maker = "AMC";
        car2.model = "Rebel";
        car2.year = 1969;
        System.out.println(car2.startTheCar());
    }
}


