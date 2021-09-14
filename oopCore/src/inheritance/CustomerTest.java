package inheritance;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        //하위 클래스의 생성자로 인스턴스를 생성하면, 힙 메모리에 상위 클래스 및 하위 클래스 모든 멤버 변수가 할당된다.
        //상위 클래스의 private 멤버 변수도 생성되지만, 직접 접근을 못할 뿐
        VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");

        //하위 클래스는 상위 클래스의 타입을 내포하고 있으므로, 상위 클래스로의 묵시적 형 변환 가능 (업캐스팅)
        //그 역은 묵시적 형 변환 안됨
        Customer customerNo = new VIPCustomer(10030, "나몰라");

        //customerNo는 결과적으로 Customer 타입의 변수이기 때문에, Customer 클래스의 멤버 변수 및 메서드만 사용가능
        //String agentId = customerNo.getAgentId();

        customerNo.bonusPoint = 10000;
        //customerNo는 Customer 타입의 변수이지만, VIPCustomer 타입의 인스턴스
        //자바에서는 항상 인스턴스의 메서드가 호출된다. (가상메서드의 원리)
        //자바의 모든 메서드는 가상 메서드 (cf) c++은 virtual을 표시해주어야함)
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo  + "원 입니다.");

        //가상 메서드 테이블에서 메서드와 해당 메서드의 코드 영역(메서드 영역)에서 address를 가지고 있음
        //Override의 경우, 재정의 된 메서드의 주소를 가리키게 됨.
        //따라서, 위의 customerNo.calcPrice의 calcPrice는 VIPCustomer에서 재정의된 메서드를 호출하게 되는 것
    }
}