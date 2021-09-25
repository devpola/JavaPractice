package oopcore8_interface_components;

public abstract class Calculator implements Calc {

    //클래스 상속과 달리 구현 코드가 없으므로 여러 인터페이스를 구현할 수 있음
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
