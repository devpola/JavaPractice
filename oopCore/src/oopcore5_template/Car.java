package oopcore5_template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    //hook method
    //구현부가 비어있는 메서드를 템플릿 메서드에 포함하여
    //해당 메서드를 필요로 하는 하위 클래스만 구현하여 선택적인 수행을 가능하게 하는 메서드
    public void wiper() {}

    //템플릿 메서드
    //추상 메서드 또는 구현 된 메서드를 활용하여 시나리오를 정의하는 메서드
    //final로 선언하여 하위 클래스에서 재정의 할 수 없게 함
    //프레임워크에서 많이 사용되는 설계 패턴
    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }

    //final 변수 : 상수
    //final 메서드 : 하위 클래스에서 재정의 할 수 없는 메서드
    //final 클래스 : 상속할 수 없는 클래스
}
