package oopcore9_interface_multiple_implementation;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("buy order");
    }
}
