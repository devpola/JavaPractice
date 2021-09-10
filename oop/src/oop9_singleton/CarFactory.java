package oop9_singleton;

public class CarFactory {

    private static CarFactory carFactory = new CarFactory();

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        if(carFactory == null) {
            carFactory = new CarFactory();
        }
        return carFactory;
    }

    public Car createCar() {
        Car newCar = new Car();
        return newCar;
    }

}
