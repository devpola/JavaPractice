package oopcore2_polymorphism;

import java.util.ArrayList;

class Animal{

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal{

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal{

    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();

        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);

        for(Animal animal : animalList) {
            //다형성 : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
            //하나의 코드가 반복적으로 실행되지만, 여러 다른 실행 결과가 나옴
            animal.move();
        }

        //***다형성 사용하는 이유***
        //상속과 메스드 재정의를 활용하여 "확장성" 있는 프로그램 만들 수 있음
        //그렇지 않은 경우, 많은 조건문들을 구현해야할 가능성이 있고 이로 인한 유지보수가 어려움
        //상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 각 클래스에 맞게 기능 구현
        //여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 가능
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
