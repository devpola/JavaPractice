package oopcore4_abstract;

//추상 클래스 : 메서드 선언부만 존재하는 추상 메서드를 포함하는 클래스
//모든 메서드가 구현 된 클래스라도 abstract로 선언되면, 인스턴스화 할 수 없다.
public abstract class Computer {

    //추상 메서드는 메서드의 구현부(body)가 없음
    //하위 클래스에게 구현을 위임
    public abstract void display();
    public abstract void typing();

    //하위 클래스가 공통으로 사용하는 메서드(필요에 따라 하위 클래스에서 재정의)
    void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
