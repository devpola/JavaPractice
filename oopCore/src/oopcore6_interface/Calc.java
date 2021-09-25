package oopcore6_interface;

public interface Calc {

    //interface는 멤버변수를 가질 수 없음
    //프리컴파일 단계에서, 키워드가 없는 변수들 앞에 public static final이 자동으로 붙으며 상수로 선언됨
    double PI = 3.14;
    int ERROR = -99999999;

    //프리컴파일 단계에서, 키워드가 없는 메서드 앞에 public abstract이 자동으로 붙으며 추상 메서드로 선언됨
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //인터페이스를 쓰는 이유 - 인터페이스가 하는 일
    // 클래스나 프로그램이 제공하는 기능을 "명시적으로" 선언
    // 일종의 클라이언트 코드와의 약속이며, 클래스나 프로그램이 제공하는 명세(specification)
    // 클라이언트 프로그램은 인터페이스에 선언된 메서드 명세만 보고 이를 구현한 클래스를 사용할 수 있음
    // 어떤 객체가 특정 인터페이스의 타입이라는 것은 해당 인터페이스가 제공하는 모든 메서드를 구현했고 사용할 수 있다는 의미
    // 인터페이스를 구현한 다양한 객체를 사용 - 다형성
}
