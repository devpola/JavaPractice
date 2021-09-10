package oop6_this;

public class Person {

    String name;
    int age;

    public Person() {
        //생성자에서 다른 생성자를 호출하는 경우, 인스턴스의 생성이 완전하지 않은 상태이므로
        //this() 문장 이전에 다른 문장 쓸 수 없음
        this("이름없음", 1);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "의 나이는 " + age + " 살 입니다.");
    }

    public Person getPerson() {
        return this;
    }
}
