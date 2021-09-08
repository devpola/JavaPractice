package oop2_classpractice;

public class Order {

    String orderID;
    String phoneNumber;
    String address;
    String date;
    String time;
    String menuID;
    int price;

    public Order(String phoneNumber, String address, String date, String time, String menuID, int price){

        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.menuID = menuID;
        this.price = price;
        this.orderID = date + menuID;
    }

    public void showOrderInfo(){
        System.out.println("주문 접수 번호 : " + orderID);
        System.out.println("주문 핸드폰 번호 : " + phoneNumber);
        System.out.println("주문 집 주소 : " + address);
        System.out.println("주문 날짜 : " + date);
        System.out.println("주문 시간 : " + time);
        System.out.println("주문 가격 : " + price);
        System.out.println("메뉴 번호 : " + menuID);
    }
}
