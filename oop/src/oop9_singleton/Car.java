package oop9_singleton;

public class Car {

    private int carNumber;
    private static int serialNumber = 1001;

    public Car() {
        carNumber = serialNumber;
        serialNumber++;
    }

    public int getCarNumber() {
        return carNumber;
    }
}
