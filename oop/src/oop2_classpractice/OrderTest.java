package oop2_classpractice;

public class OrderTest {

    public static void main(String[] args){

        Order firstOrder = new Order("01023450001", "경기도 성남시 분당동 100-111", "20210908", "130258", "0003", 35000);
        firstOrder.showOrderInfo();
    }
}
