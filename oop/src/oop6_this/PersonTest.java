package oop6_this;

public class PersonTest {

    public static void main(String[] args){

        Person firstPerson = new Person();
        Person secondPerson = new Person("minsu", 25);

        firstPerson.showPerson();
        secondPerson.showPerson();

        Person copiedPerson = firstPerson.getPerson();

        System.out.println(firstPerson);
        System.out.println(copiedPerson);
    }
}
