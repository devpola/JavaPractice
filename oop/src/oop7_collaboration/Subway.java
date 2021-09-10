package oop7_collaboration;

public class Subway {
    int subwayNumber;
    int numberOfPassenger;
    int income;
    static int price = 1200;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void ride() {
        numberOfPassenger++;
        income += price;
    }

    public void showInfo() {
        System.out.print(subwayNumber + "번 지하철의 승객은 " + numberOfPassenger + "명 이고, ");
        System.out.println("수입은 " + income + "원 입니다.");
    }
}
