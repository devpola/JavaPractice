package oopcore9_interface_multiple_implementation;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
