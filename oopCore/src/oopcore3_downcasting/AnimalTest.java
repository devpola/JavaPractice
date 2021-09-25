package oopcore3_downcasting;

import java.lang.reflect.Array;
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
            animal.move();
        }

        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for(int i=0; i<list.size(); i++) {
            Animal animal = list.get(i);

            if(animal instanceof Human) {
                Human human = (Human)animal;
                human.readBook();
            }
            else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
