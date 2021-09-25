package oopcore9_interface_multiple_implementation;

public class Customer implements Buy, Sell{

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    //여러개의 interface를 구현할 때에 추상 클래스들은 모두 override하면 되지만,
    //중복되는 default method가 존재하면, 그 중 하나를 그대로 사용하거나 새로 정의하여 overriding 해야함.
    @Override
    public void order() {
        //Buy.super.order();
        System.out.println("customer order");
    }

    public void hello() {
        System.out.println("hello");
    }
}
