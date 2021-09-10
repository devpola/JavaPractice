package oop7_collaboration;

public class Bus {

    int busNumber;
    int numberOfPassenger;
    int income;
    static int price = 1000;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void ride() { //승차로 인한 승객 수 및 수입 증가
        numberOfPassenger++;
        income += price;
    }

    public void showInfo() {
        System.out.print(busNumber + "번 버스의 승객은 " + numberOfPassenger + "명 이고, ");
        System.out.println("수입은 " + income + "원 입니다.");
    }
}
