package oopcore11_interface_extends_implements;

//하위 클래스보다 일반적인 역할을 하는 상위 클래스를 상속하고
//구현할 기능을 가지고 있는 interface를 구현하는 방식
public class BookShelf extends Shelf implements Queue{

    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
