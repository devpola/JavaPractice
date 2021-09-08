package oop4_accessmodifier;

public class BirthdayTest {

    public static void main(String[] args){
        BirthDay date = new BirthDay();

        date.setYear(2019);
        date.setMonth(12);
        date.setDay(30);

        date.showDate();
    }
}
