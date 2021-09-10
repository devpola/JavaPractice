package oop7_collaboration;

public class RideTest {

    public static void main(String[] args) {
        Student firstStudent = new Student("Minsu", 3000);
        Student secondStudent = new Student("James", 5500);

        Bus cityBus = new Bus(521);
        Subway citySubway = new Subway(1);

        firstStudent.takeBus(cityBus);
        secondStudent.takeSubway(citySubway);

        firstStudent.showInfo();
        secondStudent.showInfo();
        System.out.println();
        cityBus.showInfo();
        citySubway.showInfo();
    }
}
