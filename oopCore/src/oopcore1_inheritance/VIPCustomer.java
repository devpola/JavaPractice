package oopcore1_inheritance;

public class VIPCustomer extends Customer{

    double salesRatio;
    String agentId;

    //하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출 함
    public VIPCustomer(int customerID, String customerName) {
        //하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출 됨
        //이 때, 반드시 상위 클래스의 default 생성자가 존재 해야함

        //상위 클래스의 default 생성자가 없는 경우, 하위 클래스에서 아래와 같이 super를 이용하여
        //명시적으로 상위 클래스의 생성자를 호출해야함.
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.01;

        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    //override의 경우, 상위 클래스의 함수 정의부(접근자, 반환부, 함수명, 매개변수,...)이 달라지면
    //-> @Override annotation이 있는 경우 에러 발생
    //-> 없는 경우, 다른 함수로 인식
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public String getAgentId() {
        return agentId;
    }
}
