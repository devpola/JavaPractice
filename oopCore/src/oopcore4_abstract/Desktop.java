package oopcore4_abstract;

import javax.annotation.processing.SupportedOptions;

public class Desktop extends Computer{
    //추상 클래스를 상속하는 경우, 모든 추상 메서드를 구현해야 함
    //하나라도 구현하지 않는 경우 해당 클래스도 추상 클래스로 만들면 됨

    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }
}
