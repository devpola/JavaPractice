package oop7_collaboration;

public class Student {

    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.ride();
        money -= Bus.price;
    }

    public void takeSubway(Subway subway) {
        subway.ride();
        money -= Subway.price;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }

}
