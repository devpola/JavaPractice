package Review;

public class MyLinkedList {

    MyListNode head;
    int count;

    public static final String ERROR_CODE = "ERROR";

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addElement(String data) {
        MyListNode newNode = new MyListNode(data);
        MyListNode tempNode = head;

        if(head == null) {
            head = newNode;
        }
        else {
            while(tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data) {
        MyListNode newNode = new MyListNode(data);
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if(position < 0 || position > count) {
            System.out.println("position error");
            return null;
        }
        if(position == 0) {
            newNode.next = head;
            head = newNode;
        }
        else {
            for(int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        MyListNode tempNode = head;
        MyListNode preNode = null;

        if(position < 0 || position >= count) {
            System.out.println("position error");
            return null;
        }
        if(position == 0) {
            head = head.next;
        }
        else {
            for(int i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count--;
        return tempNode;
    }

    public String getElement(int position) {
        MyListNode tempNode = head;

        if(position < 0 || position >= count) {
            System.out.println("position error");
            return null;
        }
        for(int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode.getElement();
    }

    public MyListNode getNode(int position) {
        MyListNode tempNode = head;

        if(position < 0 || position >= count) {
            System.out.println("position error");
            return null;
        }
        for(int i = 0; i < position; i++) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public int getSize() {
        return count;
    }

    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printAll() {
        MyListNode tempNode = head;

        if(count == 0) {
            System.out.println("There is no element");
            return;
        }
        while(tempNode != null) {
            System.out.print(tempNode.getElement());
            System.out.print("->");
            if(tempNode.next == null) {
                System.out.println();
            }
        }
    }

    public void removeAll() {
        head = null;
        count = 0;
    }
}
