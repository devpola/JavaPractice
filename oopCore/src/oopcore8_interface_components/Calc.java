package oopcore8_interface_components;

public interface Calc {

    //모든 변수는 상수로 변환 됨 - public static final
    double PI = 3.14;
    int ERROR = -9999999;

    //모든 메서드는 추상메서드로 변환됨 - public abstract
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    //default method : 구현을 가지는 메서드
    //인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 메서드.(재정의 가능)
    default void description() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    //static method
    //인터페이스를 구현하는 클래스에서 override 불가능
    //인터페이스 이름으로만 사용가능(참조변수로 호출 시 에러발생)
    static int total(int[] arr) {
        int total = 0;
        for(int num : arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }


    //private method
    //인터페이스 내부에서만(static or default method) 사용하기 위해 구현하는 메서드
    //인터페이스를 구현한 클래스에서 사용하거나 재정의할 수 없음
    private void myMethod() {
        System.out.println("myMethod");
    }

    private static void myStaticMethod() {
        System.out.println("myStaticMethod");
    }
}
