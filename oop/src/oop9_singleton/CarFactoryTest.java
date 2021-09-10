package oop9_singleton;

public class CarFactoryTest {

    public static void main(String[] args) {

        CarFactory factory = CarFactory.getInstance();
        Car sonata = factory.createCar();
        Car ray = factory.createCar();

        System.out.println(sonata.getCarNumber());
        System.out.println(ray.getCarNumber());
    }
}
