package oop2_classpractice;

public class Person {

    String name;
    String sex;
    int height;
    int weight;
    int age;

    public Person(String name, String sex, int height, int weight, int age){

        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void showInfo(){

        System.out.print("키가 " + height + " 이고 몸무게가 " + weight + " 킬로인 " + sex + "이 있습니다.");
        System.out.println(" 이름은 " + name + " 이고 나이는 " + age + "세입니다.");
    }
}
