package oopcore10_interface_multiple_extends;

public class MyClass implements MyInterface{

    @Override
    public void myMethod() {
        System.out.println("myMethod");
    }

    @Override
    public void x() {
        System.out.println("x");
    }

    @Override
    public void y() {
        System.out.println("y");
    }
}
